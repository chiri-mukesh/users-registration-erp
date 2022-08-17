package com.rinfotek.registrationlogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rinfotek.registrationlogin.service.UserService;
import com.rinfotek.registrationlogin.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	//import user service interface
	private UserService userService;

	//create field constructor
	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	//create method handler over here
	@GetMapping //get method
	public String showRegistrationForm() {
		return "registration";//for registration.html
	}

	@PostMapping //post method
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto)//this("user") object contains form data
{
	userService.save(registrationDto);
	return "redirect:/registration?success";
}
	
	
}
