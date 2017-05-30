package org.springframework.springmvcboot.users;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Collection<User> getAll() {
        return (Collection<User>) userRepository.findAll();
    }
    
    public User add(User obj) {
    	return userRepository.save(obj);
    }
}
