package net.example.search_functionality.repository;
import net.example.search_functionality.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<Users,Long>{

    @Query(value = "SELECT * FROM users WHERE users.full_name LIKE CONCAT('%',:query, '%')",nativeQuery = true )
    List<Users> usersBySearch(String query);

}
