package ua.com.shop.shop_admin_np_371_372.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.shop.shop_admin_np_371_372.repository.CustomerRepository;
import ua.com.shop.shop_admin_np_371_372.repository.UserRepository;

@Service
public class UserManagerService {

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public UserManagerService(UserRepository userRepository, CustomerRepository customerRepository) {
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
    }




}
