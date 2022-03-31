package com.employee.controller;

import com.employee.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm(ModelMap modelMap){
        modelMap.addAttribute("employee",new Employee());
        return "employee/create";
    }

    @RequestMapping(value = "addEmployee",method = RequestMethod.POST)
    public String createEmployee(Model model, @ModelAttribute Employee employee){
    model.addAttribute("employee",employee);

        return "employee/info";
    }


}
