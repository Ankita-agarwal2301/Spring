package com.stackroute.spring.mvc.employee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.spring.mvc.employee.model.Employee;
import com.stackroute.spring.mvc.employee.repository.EmployeeRepository;

@Controller

public class EmployeeController {

	// Beans from ApplicationContext
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Employee emp = context.getBean("employee", Employee.class);
	EmployeeRepository empRep = context.getBean("employeeRepository", EmployeeRepository.class);

	// default get request, will return indx and dispatecher-sevlet.xml will map it
	// to /WEB-INF/views/index.jsp
	@GetMapping("/")
	public String getHomePage(ModelMap map) {
		// to get data on home page also
		map.addAttribute("employeeList", this.empRep.getEmpList());
		return "index";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee, ModelMap map) {
		System.out.println("Save emp called " + employee);

		// if it httpservletrequest then we do like this
		// int id = Integer.parseInt(req.getParameter("id"));

		this.empRep.addEmployee(employee);
		System.out.println(this.empRep);
		map.addAttribute("employeeList", this.empRep.getEmpList());
		return "index";
	}

	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("id") int empId) {
		System.out.println("deleting");
		this.empRep.deleteEmployee(empId);
		return "redirect:/";

	}
}
