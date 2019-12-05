package com.cts.smartshop.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.smartshop.model.Role;
import com.cts.smartshop.model.User;
import com.cts.smartshop.repository.RoleRepository;
import com.cts.smartshop.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService{
	
	@Autowired 
	UserRepository userRepository;
	
	@Autowired 
	RoleRepository roleRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		//System.out.println("in authenticate");
		//System.out.println(user);
		if(user==null) {
			throw new UsernameNotFoundException("user not present");
		}
		else {
			AppUser appUser=new AppUser(user);
			//System.out.println(appUser.getAuthorities());
			return appUser;
		}
	}
	
	public String signup(User user) {
		User user1 = userRepository.findByUsername(user.getUserId());
		if (user1 != null) {
			return "false";
		}
		else {
			Set<Role> roleList = new HashSet<>();
			roleList.add(roleRepository.findById(200).get());
			user.setRoleList(roleList);
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			userRepository.save(user);
			return "true";
		}
	}

}
