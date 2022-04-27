package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.service.HouseDto;
import com.case_study_module4_furama_by_spring.dto.service.RoomDto;
import com.case_study_module4_furama_by_spring.dto.service.VillaDto;
import com.case_study_module4_furama_by_spring.model.service_entity.RentType;
import com.case_study_module4_furama_by_spring.model.service_entity.ServiceEntity;
import com.case_study_module4_furama_by_spring.model.service_entity.ServiceType;
import com.case_study_module4_furama_by_spring.service.service_service.IRentTypeService;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceEntityService;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "service")
public class ServiceController {

    @Autowired
    IServiceEntityService serviceEntityService;
    @Autowired
    IRentTypeService rentTypeService;
    @Autowired
    IServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypeList")
    public List<RentType> rentTypeList (){
        return rentTypeService.findAll();
    }

    @ModelAttribute("serviceTypeList")
    public List<ServiceType> serviceTypeList(){
        return serviceTypeService.findAll();
    }

    @ModelAttribute("standardRoomList")
    public Iterable<String> sendStandardRoomList() {
        return Arrays.asList("Vip", "Luxury", "superior");
    }

    @GetMapping("/list")
    public String showCustomerList(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> searchWord, ModelMap modelMap) {
        String searchWordValue = searchWord.orElse("");
        Page<ServiceEntity> serviceList = serviceEntityService.findAll(pageable);
        modelMap.addAttribute("serviceList", serviceList);
        modelMap.addAttribute("searchWordValue", searchWordValue);
        return "service/list";
    }

    @GetMapping(value = "/create")
    public String showCreateForm(@RequestParam Integer serviceType,ModelMap modelMap) {
        if (serviceType == 1) {
            modelMap.addAttribute("villaDto", new VillaDto());
        } else if (serviceType == 2) {
            modelMap.addAttribute("houseDto", new HouseDto());
        } else if (serviceType == 3) {
            modelMap.addAttribute("roomDto", new RoomDto());
        }
        modelMap.addAttribute("serviceTypeId", serviceType);
        return "service/create";
    }

    @PostMapping(value = "/saveVilla")
    public String saveVilla(@Valid @ModelAttribute("villaDto") VillaDto villaDto,
                            BindingResult bindingResult,@RequestParam Integer serviceTypeId, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            modelMap.addAttribute("serviceTypeId",serviceTypeId);
            return "service/create";
        }
        villaDto.setServiceType(new ServiceType(1, "Villa"));
        ServiceEntity serviceEntity = new ServiceEntity();
        BeanUtils.copyProperties(villaDto, serviceEntity);
        serviceEntity.setRentType(villaDto.getRentType());
        serviceEntity.setServiceType(villaDto.getServiceType());
        serviceEntityService.save(serviceEntity);
        return "redirect:/service/list";
    }

    @PostMapping(value = "/saveHouse")
    public String saveHouse(@Valid @ModelAttribute("houseDto") HouseDto houseDto,
                            BindingResult bindingResult,ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            modelMap.addAttribute("serviceTypeId",2);
            return "service/create";
        }
        houseDto.setServiceType(new ServiceType(2, "House"));
        ServiceEntity serviceEntity = new ServiceEntity();
        BeanUtils.copyProperties(houseDto, serviceEntity);
        serviceEntity.setRentType(houseDto.getRentType());
        serviceEntity.setServiceType(houseDto.getServiceType());
        serviceEntityService.save(serviceEntity);
        return "redirect:/service/list";
    }

    @PostMapping(value = "/saveRoom")
    public String saveRoom(@Valid @ModelAttribute("roomDto") RoomDto roomDto,
                           BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            modelMap.addAttribute("serviceTypeId",3);

            return "service/create";
        }
        roomDto.setServiceType(new ServiceType(3, "Room"));
        ServiceEntity serviceEntity = new ServiceEntity();
        BeanUtils.copyProperties(roomDto, serviceEntity);
        serviceEntity.setRentType(roomDto.getRentType());
        serviceEntity.setServiceType(roomDto.getServiceType());
        serviceEntityService.save(serviceEntity);
        return "redirect:/service/list";
    }

}
