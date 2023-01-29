package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.dto.CustomerDto;
import com.customer.entities.Customer;
import com.customer.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public String viewCustomerPage() {
		return "create_customer_information";
	}

	@RequestMapping("/create")
	public String saveCustomerDetails(@ModelAttribute("customer") Customer customer, Model model) {
		customerService.createCustomerInformation(customer);
		model.addAttribute("msg", "Record is Saved");
		return "create_customer_information";
	}

	@RequestMapping("/list")
	public String listAllCustomers(Model model){//@PathVariable("page") Integer currentPage, 
		//Page<Customer> cutomerlist = customerService.getCustomers(currentPage, 3);
		//List<Customer> lists = customerService.getAllCustomers();
		//model.addAttribute("list", lists);
		//
		//
		return getPage(0, model);
	}

	@RequestMapping("/delete")
	public String deleteOneCustomer(@RequestParam("id") String id, Model model) {
		
		customerService.deleteOneCustomerDetails(id);

		
		return "redirect:/list";
	}

	@RequestMapping("/update")
	public String openEditPage(@RequestParam("id") String id, Model model) {
		Customer one = customerService.getOneCustomer(id);
		model.addAttribute("one", one);
		return "update_customer";
	}

	@RequestMapping("/edit")
	public String editOneCustomer(CustomerDto dto, Model model) {

		Customer customer = new Customer();
		//customer.setId(dto.getId());
		customer.setUidNumber(dto.getUidNumber());
		customer.setName(dto.getName());
		customer.setDob(dto.getDob());
		customer.setAddress(dto.getAddress());
		customer.setProfession(dto.getProfession());
		customer.setOpeningBalance(dto.getOpeningBalance());
		customer.setGender(dto.getGender());
		customer.setCitizenship(dto.getCitizenship());

		customerService.createCustomerInformation(customer);
		
		model.addAttribute("Msg","Record is updated");
		return "redirect:/list";
		

	}
	@GetMapping("/page")
	public String getPage(@RequestParam("page") Integer currentPage,Model model) {
		Page<Customer> cutomerlist = customerService.getCustomers(currentPage, 3);
		List<Customer> list = cutomerlist.getContent();
		model.addAttribute("list", list);
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("totalpage", cutomerlist.getTotalPages());
		model.addAttribute("totalCustomer", cutomerlist.getTotalElements());
		return"list_customer";
	}
}