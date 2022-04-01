package com.product_management.controller;

import com.product_management.model.Product;
import com.product_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/product")
    public String showProductList(ModelMap modelMap){
        List<Product> productList = iProductService.getAllProduct();
        modelMap.addAttribute("productList",productList);

        return "list";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String showCreateForm(ModelMap modelMap){
        modelMap.addAttribute("product", new Product());

        return "create";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createProduct(@ModelAttribute Product product){
    product.setId((int)Math.random()*1000);
    iProductService.create(product);
        return "redirect:product";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, ModelMap modelMap){
      Product product =  iProductService.findProductById(id);
        modelMap.addAttribute("product",product);
        return "edit";
    }

    @PostMapping("/edit")
    public String editProduct(@ModelAttribute Product product){
        iProductService.update(product);

        return "redirect:product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id,ModelMap modelMap){
        Product product = iProductService.findProductById(id);
        iProductService.removeProduct(product);
        List<Product> productList = iProductService.getAllProduct();
        modelMap.addAttribute("productList",productList);

        return "list";
    }


    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, ModelMap modelMap){
        Product product = iProductService.findProductById(id);
        modelMap.addAttribute("product",product);

        return "view";
    }

    @PostMapping("/search")
    public String searchProductByName(@RequestParam String search, ModelMap modelMap){
        iProductService.searchProductByName(search);

        return "list";
    }



}
