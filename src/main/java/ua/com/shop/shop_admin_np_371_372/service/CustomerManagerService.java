package ua.com.shop.shop_admin_np_371_372.service;


import org.springframework.stereotype.Service;
import ua.com.shop.shop_admin_np_371_372.entity.Customer;
import ua.com.shop.shop_admin_np_371_372.repository.CustomerRepository;

@Service
public class CustomerManagerService {
    private final CustomerRepository customerRepository;

    public CustomerManagerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomerToDB(Customer customer){
        customerRepository.save(customer);
    }
}
