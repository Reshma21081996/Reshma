package com.cts.smartshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.smartshop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
		@Query("from User u where u.contactNumber=?1")
		User findByUsername(String contact);
		
		@Query("from User u where u.userId=?1")
		User findUser(String name);
		
		/*@Query("select users from User users where users.username=?1")
		User getMenuItems(String name);*/

}
