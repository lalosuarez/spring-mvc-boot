package org.springframework.springmvcboot.restapi;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.springmvcboot.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class UsersRestController {
	
	@Autowired
	private UsersService usersService;
	
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public Collection<Map<String, String>> getUsers() {
        return usersService.getUsers();
    }
}
