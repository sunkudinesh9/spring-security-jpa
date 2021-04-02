package com.dineshlearnings.springsecurityjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dineshlearnings.springsecurityjpa.model.User;

@RestController
public class HomePage {

	@Autowired
	private UserServerClass usererviceClass;

	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String generalUser() {
		return "<h1>Welcome</h1>";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return "<h1>Welcome User</h1>";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return usererviceClass.addUser(user);
	}
}
