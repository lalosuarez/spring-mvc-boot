package org.springframework.springmvcboot.users;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UsersService {

    public Collection<Map<String, String>> getUsers() {
    	Collection<Map<String, String>> users = new ArrayList<Map<String, String>>();
        
    	Map<String, String> user1 = new HashMap<String,String>();
    	Map<String, String> user2 = new HashMap<String,String>();
    	Map<String, String> user3 = new HashMap<String,String>();
    	
        user1.put("name", "Luke");
        user2.put("name", "Darth");
        user3.put("name", "Anakin");
        
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        return users;
    }
}
