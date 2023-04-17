package ua.com.shop.shop_admin_np_371_372.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id //PK //NN
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AI
    private Long id;
    private Date dataCreated;
    private String payment;
    private String delivery;
    private boolean statusOrder;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<ProductHasOrder> productsHasOrder;
}
