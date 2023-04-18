package ua.com.shop.shop_admin_np_371_372.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.shop_admin_np_371_372.entity.Category;
import ua.com.shop.shop_admin_np_371_372.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // select * from `product` where name = ?
    Product findByName(String name);
    List<Product> findAllByCategories(Category category);
}
