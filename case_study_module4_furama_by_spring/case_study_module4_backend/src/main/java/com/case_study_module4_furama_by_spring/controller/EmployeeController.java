package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.customer.CustomerDto;
import com.case_study_module4_furama_by_spring.dto.employee.EmployeeDto;
import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.model.employee.Division;
import com.case_study_module4_furama_by_spring.model.employee.EducationDegree;
import com.case_study_module4_furama_by_spring.model.employee.Employee;
import com.case_study_module4_furama_by_spring.model.employee.Position;
import com.case_study_module4_furama_by_spring.service.employee_service.IDivisionService;
import com.case_study_module4_furama_by_spring.service.employee_service.IEducationDegreeService;
import com.case_study_module4_furama_by_spring.service.employee_service.IEmployeeService;
import com.case_study_module4_furama_by_spring.service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IDivisionService divisionService;
    @Autowired
    IEducationDegreeService educationDegreeService;
    @Autowired
    IPositionService positionService;


    @ModelAttribute("positionList")
    public List<Position> positionList() {
        return positionService.findAllPositionList();
    }
    @ModelAttribute("divisionList")
    public List<Division> divisionList(){
        return divisionService.findAllDivisionList();
    }

    @ModelAttribute("educationDegreeList")
    public List<EducationDegree> educationDegreeList(){
        return educationDegreeService.findAllEducationDegreeList();
    }

    @GetMapping("/list")
    public String showCustomerList(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> searchWord, ModelMap modelMap) {
        String searchWordValue = searchWord.orElse("");
        Page<Employee> employeeList = employeeService.findAllEmployee(pageable);
        modelMap.addAttribute("employeeList", employeeList);
        modelMap.addAttribute("searchWordValue", searchWordValue);
        return "employee/list";
    }

    @GetMapping("/create")
    public String showCreateForm(ModelMap modelMap) {
        modelMap.addAttribute("employeeDto", new EmployeeDto());

        return "employee/create";
    }


}
