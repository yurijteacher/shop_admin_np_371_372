package ua.com.shop.shop_admin_np_371_372.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roleSet;

}
