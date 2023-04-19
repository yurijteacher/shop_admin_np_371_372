package ua.com.shop.shop_admin_np_371_372.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.shop_admin_np_371_372.entity.Users;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {

    // select * from `user` where username = ?
    List<Users> findAllByUsername(String name);

}
