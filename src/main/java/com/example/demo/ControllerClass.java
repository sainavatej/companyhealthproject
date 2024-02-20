package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/employee")
public class ControllerClass {
	
	@Autowired
	private EmployeeDetailsRepository employeedetailsRepository;


    @GetMapping("/details")
    public String getEmployeeDetails(Model model) {
        
        model.addAttribute("employee", new EmployeeDetails()); 
        return "emp-details";
    }
	
	@PostMapping("/details")
    public String postEmployeeDetails(@ModelAttribute EmployeeDetails employee, Model model) {
      
        EmployeeDetails savedEmployee = employeedetailsRepository.save(employee);

       
        model.addAttribute("id", savedEmployee.getId());
        model.addAttribute("name", savedEmployee.getName());
        model.addAttribute("email", savedEmployee.getEmail());
        model.addAttribute("mobile", savedEmployee.getMobilenumber());


        return "success";
    }


}
