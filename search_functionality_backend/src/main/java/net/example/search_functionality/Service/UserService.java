package net.example.search_functionality.Service;
import net.example.search_functionality.model.Users;
import java.util.List;

public interface UserService {
    public List<Users> getUsers();
    public List<Users> getUsersBySearch(String query);



}