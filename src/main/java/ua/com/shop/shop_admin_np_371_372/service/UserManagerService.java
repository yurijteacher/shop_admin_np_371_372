package ua.com.shop.shop_admin_np_371_372.service;


import com.mysql.cj.xdevapi.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.shop.shop_admin_np_371_372.entity.Customer;
import ua.com.shop.shop_admin_np_371_372.entity.Role;
import ua.com.shop.shop_admin_np_371_372.entity.Users;
import ua.com.shop.shop_admin_np_371_372.repository.CustomerRepository;
import ua.com.shop.shop_admin_np_371_372.repository.RoleRepository;
import ua.com.shop.shop_admin_np_371_372.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Service
public class UserManagerService {

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserManagerService(UserRepository userRepository, CustomerRepository customerRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
        this.roleRepository = roleRepository;
    }


    public boolean getLogicByUser(String username) {

//        boolean logic = false;
//        if(!userRepository.findAllByUsername(username).isEmpty()) logic=true;
//        return logic;

        return (!userRepository.findAllByUsername(username).isEmpty()) ? true : false;
    }


    public Users saveNewUserToDB(Users user){

        user.setRoleSet(Collections.singleton(new Role(1L, "ROLE_User")));

//        User user1 = userRepository.save(user);
//        return user1;

        return userRepository.save(user);
    }


    public List<Customer> getCustomerList() {
        return customerRepository.findAll();
    }
}
