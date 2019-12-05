package com.cts.authenticationservice.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.authenticationservice.model.Role;
import com.cts.authenticationservice.model.User;
import com.cts.authenticationservice.repository.RoleRepository;
import com.cts.authenticationservice.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService{
	
	@Autowired 
	UserRepository userRepository;
	
	@Autowired 
	RoleRepository roleRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		//System.out.println("in authenticate");
		System.out.println(user);
		if(user==null) {
			throw new UsernameNotFoundException("User not present");
		}
		else if(user.getStatus().equals("P")) {
			throw new UsernameNotFoundException("Admin approval pending ... ");
		}
		else if(user.getStatus().equals("D")) {
			throw new UsernameNotFoundException("Request denied");
		}
		else {
			AppUser appUser=new AppUser(user);
			//System.out.println(appUser.getAuthorities());
			return appUser;
		}
	}
	
	public String signupUser(User user) {
		User user1 = userRepository.findByUsername(user.getUserId());
		System.out.println(user1);
		if (user1 != null) {
			return "false";
		}
		else {
			Set<Role> roleList = new HashSet<>();
			roleList.add(roleRepository.findById(2).get());
			user.setRoleList(roleList);
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			user.setStatus("A");
			user.setUserType("U");
			userRepository.save(user);
			return "true";
		}
	}
	
	public String signupAdmin(User user) {
		User user1 = userRepository.findByUsername(user.getUserId());
		if (user1 != null) {
			return "false";
		}
		else {
			Set<Role> roleList = new HashSet<>();
			roleList.add(roleRepository.findById(1).get());
			user.setRoleList(roleList);
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			user.setStatus("P");
			user.setUserType("A");
			userRepository.save(user);
			return "true";
		}
	}
	
	public void response (User user) {
		userRepository.save(user);
	}

}
