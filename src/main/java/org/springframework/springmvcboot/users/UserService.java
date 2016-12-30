package org.springframework.springmvcboot.users;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
    public Collection<User> getAll() {
        return (Collection<User>) userRepository.findAll();
    }
    
    public void add(User obj) {
    	userRepository.save(obj);
    }
}
