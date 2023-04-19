package ua.com.shop.shop_admin_np_371_372.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.shop_admin_np_371_372.entity.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
