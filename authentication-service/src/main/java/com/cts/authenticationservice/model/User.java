package com.cts.authenticationservice.model;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@Column(name="user_id")
	String userId;
	@Column(name="first_name")
	String firstName;
	@Column(name="last_name")
	String lastName;
	@Column(name="age")
	int age;
	@Column(name="contact_number")
	String contactNumber;
	@Column(name="user_type")
	String userType;
	@Column(name="status")
	String status;
	@Column(name="gender")
	String gender;
	@Column(name="password")
	String password;	


	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "ur_us_id"), 
        inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	private Set<Role> roleList;

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}
	

	/* @ManyToMany(fetch=FetchType.EAGER)
	 @JoinTable(name = "cart",
	 	joinColumns = @JoinColumn(name = "ct_us_id"), 
	    inverseJoinColumns = @JoinColumn(name = "ct_pr_id"))
	 private Set<MenuItem> menuList;
	 
	public Set<MenuItem> getMenuList() {
		return menuList;
	}

	public void setMenuList(Set<MenuItem> menuList) {
		this.menuList = menuList;
	}*/

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", contactNumber=" + contactNumber + ", userType=" + userType + ", status=" + status + ", gender="
				+ gender + ", password=" + password + ", roleList=" + roleList + "]";
	}

	
}
