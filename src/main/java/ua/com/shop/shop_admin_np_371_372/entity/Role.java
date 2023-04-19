package ua.com.shop.shop_admin_np_371_372.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roleSet")
    private Set<Users> userSet;

    public Role() {}
    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
