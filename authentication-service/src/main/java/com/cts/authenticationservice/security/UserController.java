package com.cts.authenticationservice.security;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.authenticationservice.model.User;
import com.cts.authenticationservice.repository.UserRepository;

@RestController
//@CrossOrigin(origins="http://localhost:4201")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	AppUserDetailsService appUserDetailsService;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/{name}")
	public UserDetails testFindByUsername(@PathVariable("name") String name) {
		return appUserDetailsService.loadUserByUsername(name);
	}
	
	@PostMapping("/U")
	public String signupUser(@RequestBody @Valid User user){
		return appUserDetailsService.signupUser(user);
	}
	
	@PostMapping("/A")
	public String signupAdmin(@RequestBody @Valid User user){
		return appUserDetailsService.signupAdmin(user);
	}
	
	@GetMapping("/A")
	public List<User> adminDetails(){
		return userRepository.adminDetails();
	}
	
	@PutMapping("")
	public void response(@RequestBody @Valid User user){
		appUserDetailsService.response(user);
	}
}
