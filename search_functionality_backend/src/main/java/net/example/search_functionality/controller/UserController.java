package net.example.search_functionality.controller;
import net.example.search_functionality.Service.UserService;
import net.example.search_functionality.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:3002/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<Users> getUsers()
    {
        return this.userService.getUsers();
    }

    @GetMapping("/usersBySearch")
    public List<Users> getUsersBySearch(@RequestParam("query") String query)
    {
        return this.userService.getUsersBySearch(query);
    }
}
