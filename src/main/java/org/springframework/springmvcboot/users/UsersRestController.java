package org.springframework.springmvcboot.users;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class UsersRestController {
	
	@Autowired
	private UsersService usersService;
	
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public Collection<User> getUsers() {
        return usersService.getAll();
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
    public void add(@RequestBody User obj) {
        usersService.add(obj);
    }    
}
