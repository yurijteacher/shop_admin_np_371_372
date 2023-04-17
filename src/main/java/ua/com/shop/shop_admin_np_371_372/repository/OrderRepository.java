package ua.com.shop.shop_admin_np_371_372.repository;

import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.shop_admin_np_371_372.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
