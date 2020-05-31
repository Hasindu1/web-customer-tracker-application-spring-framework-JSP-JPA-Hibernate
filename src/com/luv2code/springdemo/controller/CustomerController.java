package com.luv2code.springdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//need to inject customer Service
   @Autowired
   private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
		
		//get customers form the the service
		
		List<Customer> theCustomers = customerService.getCustomer();
		// add customers to the model
		model.addAttribute("customers",theCustomers);
		return "list-customers";
	}
	@GetMapping("/showFormForAdd")
	public String showForForAdd(Model model) {
		//create a new model attribute to bind form data
		
		Customer theCustomer = new Customer();
		
		model.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(Model model,HttpServletRequest request) {
		Customer updatedCustomer =customerService.getSpeceficCustomer(Integer.parseInt(request.getParameter("id")));
		model.addAttribute("customer",updatedCustomer);
		return "customer-form";
	}
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(HttpServletRequest request) {
		customerService.deleteCustomer(Integer.parseInt(request.getParameter("id")));
		return"redirect:/customer/list";
		
	}
} 
