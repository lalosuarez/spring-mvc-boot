package org.springframework.springmvcboot.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	private Collection<User> users = new ArrayList<User>(Arrays.asList(
    		new User(1L, "User 1"),
    		new User(4L, "User 2"),
    		new User(3L, "User 3")
    	));
	
    public Collection<User> getAll() {
        return users;
    }
    
    public void add(User obj) {
    	users.add(obj);
    }
}
