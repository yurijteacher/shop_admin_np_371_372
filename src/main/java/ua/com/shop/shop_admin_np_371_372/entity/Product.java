package ua.com.shop.shop_admin_np_371_372.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;

    @OneToMany(mappedBy = "product")
    private List<ProductHasOrder> productHasOrders;

}
