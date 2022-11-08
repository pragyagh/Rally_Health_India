package net.example.search_functionality.Service;

import net.example.search_functionality.model.Users;
import net.example.search_functionality.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{

    @Autowired

    private UserRepository userRepository;

    @Override
    public List<Users> getUsers(){
       return userRepository.findAll();
    }

    @Override
    public List<Users> getUsersBySearch(String query) {
        List<Users> users = userRepository.usersBySearch(query);
        return users;
    }

}