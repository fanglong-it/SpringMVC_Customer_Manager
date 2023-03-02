package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.customer.Customer;
import net.codejava.customer.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Customer> customers = customerService.listAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("listCustomer", customers);
		return modelAndView;
	}
	
	

	@RequestMapping("/new")
	public ModelAndView addCustomer() {
		ModelAndView modelAndView = new ModelAndView();
		Customer customer = new Customer();
		modelAndView.addObject(customer);
		modelAndView.setViewName("new");
		return modelAndView;
	}

	@RequestMapping(name = "/save", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
		ModelAndView modelAndView = new ModelAndView();
		customerService.save(customer);
		modelAndView.setViewName("redirect:/");
		return modelAndView;
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView deleteCustomer(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView();
		customerService.delete(id);
		modelAndView.setViewName("redirect:/");
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCustomer(@RequestParam("id") Long id) {
		ModelAndView modelAndView = new ModelAndView();
		Customer customer = customerService.get(id);
		modelAndView.addObject("customer", customer);
		modelAndView.setViewName("new");
		return modelAndView;
	}
	
	
	
	
	
	

}
