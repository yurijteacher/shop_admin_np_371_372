package ua.com.shop.shop_admin_np_371_372.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 14, message = "Кількість символів повинна бути більша 2, але менша 14 символів")
    private String username;
    @Size(min = 2, max = 14, message = "Кількість символів повинна бути більша 2, але менша 14 символів")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roleSet;

}
