package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.employee.EmployeeDto;
import com.case_study_module4_furama_by_spring.model.employee.Division;
import com.case_study_module4_furama_by_spring.model.employee.EducationDegree;
import com.case_study_module4_furama_by_spring.model.employee.Employee;
import com.case_study_module4_furama_by_spring.model.employee.Position;
import com.case_study_module4_furama_by_spring.model.user.AppUser;
import com.case_study_module4_furama_by_spring.service.employee_service.IDivisionService;
import com.case_study_module4_furama_by_spring.service.employee_service.IEducationDegreeService;
import com.case_study_module4_furama_by_spring.service.employee_service.IEmployeeService;
import com.case_study_module4_furama_by_spring.service.employee_service.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
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

    @PostMapping("/create")
    public String createEmployee(@Valid @ModelAttribute EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);


        Position position = new Position();
        position.setPositionId(employeeDto.getPosition().getPositionId());
        position.setPositionName(employeeDto.getPosition().getPositionName());
        employee.setPosition(position);

        EducationDegree educationDegree = new EducationDegree();
        educationDegree.setEducationDegreeId(employeeDto.getEducationDegree().getEducationDegreeId());
        educationDegree.setEducationDegreeName(employeeDto.getEducationDegree().getEducationDegreeName());
        employee.setEducationDegree(educationDegree);

        Division division = new Division();
        division.setDivisionId(employeeDto.getDivision().getDivisionId());
        position.setPositionName(employeeDto.getDivision().getDivisionName());
        employee.setDivision(division);

        AppUser appUser = new AppUser();
        appUser.setUserName(employeeDto.getAppUser().getUserName());
        employee.setAppUser(appUser);

        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message","added employee successfully");

        return "redirect:/employee/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditEmployeeForm(@PathVariable Integer id, ModelMap modelMap) {
        Employee employee = employeeService.findEmployeeById(id);
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee, employeeDto);

        Position position = new Position();
        position.setPositionId(employee.getPosition().getPositionId());
        position.setPositionName(employee.getPosition().getPositionName());
        employeeDto.setPosition(position);

        EducationDegree educationDegree = new EducationDegree();
        educationDegree.setEducationDegreeId(employee.getEducationDegree().getEducationDegreeId());
        educationDegree.setEducationDegreeName(employee.getEducationDegree().getEducationDegreeName());
        employeeDto.setEducationDegree(educationDegree);

        Division division = new Division();
        division.setDivisionId(employee.getDivision().getDivisionId());
        position.setPositionName(employee.getDivision().getDivisionName());
        employeeDto.setDivision(division);

        AppUser appUser = new AppUser();
        appUser.setUserName(employee.getAppUser().getUserName());
        appUser.setEncrytedPassword(employee.getAppUser().getEncrytedPassword());
        employeeDto.setAppUser(appUser);

        modelMap.addAttribute("employeeDto", employeeDto);
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String editEmployee(@Valid @ModelAttribute EmployeeDto employeeDto,BindingResult bindingResult,RedirectAttributes redirectAttributes){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);

        Position position = new Position();
        position.setPositionId(employeeDto.getPosition().getPositionId());
        position.setPositionName(employeeDto.getPosition().getPositionName());
        employee.setPosition(position);

        EducationDegree educationDegree = new EducationDegree();
        educationDegree.setEducationDegreeId(employeeDto.getEducationDegree().getEducationDegreeId());
        educationDegree.setEducationDegreeName(employeeDto.getEducationDegree().getEducationDegreeName());
        employee.setEducationDegree(educationDegree);

        Division division = new Division();
        division.setDivisionId(employeeDto.getDivision().getDivisionId());
        position.setPositionName(employeeDto.getDivision().getDivisionName());
        employee.setDivision(division);

        AppUser appUser = new AppUser();
        appUser.setUserName(employeeDto.getAppUser().getUserName());
        appUser.setEncrytedPassword(employeeDto.getAppUser().getEncrytedPassword());
        employee.setAppUser(appUser);

        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message","edited employee successfully");

        return "redirect:/employee/list";
    }

}
