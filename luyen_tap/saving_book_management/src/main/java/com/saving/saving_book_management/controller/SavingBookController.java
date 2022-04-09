package com.saving.saving_book_management.controller;

import com.saving.saving_book_management.dto.SavingBookDto;
import com.saving.saving_book_management.model.Customer;
import com.saving.saving_book_management.model.SavingBook;
import com.saving.saving_book_management.service.ICustomerService;
import com.saving.saving_book_management.service.ISavingBookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import java.util.List;

@Controller
public class SavingBookController {

    @Autowired
    private ISavingBookService savingBookService;
    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/savingbook", method = RequestMethod.GET)
    public String showListSavingBook(ModelMap modelMap) {
        List<SavingBook> savingBookList = savingBookService.findAll();
        modelMap.addAttribute("savingBookList", savingBookList);
        return "saving_book/list";
    }

    @RequestMapping(value = "/createSavingBook", method = RequestMethod.GET)
    public String showCreateFormSavingBook(ModelMap modelMap) {
        modelMap.addAttribute("savingBookDto", new SavingBookDto());
        modelMap.addAttribute("customerList", this.customerService.findAll());
        return "saving_book/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createSavingBook(@Valid @ModelAttribute SavingBookDto savingBookDto, BindingResult bindingResult) {
        savingBookDto.validate(savingBookDto, bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "saving_book/create";
        }
        SavingBook savingBook = new SavingBook();
        BeanUtils.copyProperties(savingBookDto,savingBook);
        Customer customer = new Customer();
        customer.setCustomerCode(savingBookDto.getCustomer().getCustomerCode());
        customer.setCustomerName(savingBookDto.getCustomer().getCustomerName());
        savingBook.setCustomer(customer);
        savingBookService.save(savingBook);
        return "redirect:/savingbook";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String showEditForm(@PathVariable int id,ModelMap modelMap){
        SavingBook savingBook = savingBookService.findById(id);
        SavingBookDto savingBookDto = new SavingBookDto();
        BeanUtils.copyProperties(savingBook,savingBookDto);

        Customer customer =  new Customer();
        customer.setCustomerCode(savingBook.getCustomer().getCustomerCode());
        customer.setCustomerName(savingBook.getCustomer().getCustomerName());
        savingBookDto.setCustomer(customer);

        modelMap.addAttribute("savingBookDto",savingBookDto);
        return "saving_book/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editInfo(@Valid @ModelAttribute SavingBookDto savingBookDto, ModelMap modelMap){
        SavingBook savingBook = new SavingBook();
        BeanUtils.copyProperties(savingBookDto,savingBook);

        Customer customer = new Customer();
        customer.setCustomerCode(savingBookDto.getCustomer().getCustomerCode());
        customer.setCustomerName(savingBookDto.getCustomer().getCustomerName());
        savingBook.setCustomer(customer);
        savingBookService.save(savingBook);

    return "redirect:savingbook";
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String showDeleteForm(@PathVariable int id, ModelMap modelMap){
        SavingBook savingBook = savingBookService.findById(id);

        SavingBookDto savingBookDto = new SavingBookDto();
        BeanUtils.copyProperties(savingBook,savingBookDto);

        Customer customer =  new Customer();
        customer.setCustomerCode(savingBook.getCustomer().getCustomerCode());
        customer.setCustomerName(savingBook.getCustomer().getCustomerName());
        savingBookDto.setCustomer(customer);

        modelMap.addAttribute("savingBookDto",savingBookDto);

    return "saving_book/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String deteleForm(@ModelAttribute SavingBookDto savingBookDto){
        SavingBook savingBook = new SavingBook();
        BeanUtils.copyProperties(savingBookDto,savingBook);

//        Customer customer = new Customer();
//        customer.setCustomerCode(savingBookDto.getCustomer().getCustomerCode());
//        customer.setCustomerName(savingBookDto.getCustomer().getCustomerName());
//        savingBook.setCustomer(customer);

        savingBookService.deleteById(savingBook.getSavingBookId());

        return "redirect:savingbook";
    }
}
