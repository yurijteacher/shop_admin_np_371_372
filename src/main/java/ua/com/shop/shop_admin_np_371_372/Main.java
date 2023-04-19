package ua.com.shop.shop_admin_np_371_372;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.com.shop.shop_admin_np_371_372.entity.Role;
import ua.com.shop.shop_admin_np_371_372.repository.RoleRepository;

@SpringBootApplication
public class Main {

    private final RoleRepository roleRepository;

    public Main(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @Bean
    public void saveRolesToDB() {

        if (roleRepository.findAll().isEmpty()) {
            roleRepository.save(new Role(1L, "ROLE_User"));
            roleRepository.save(new Role(2L, "ROLE_Manager"));
            roleRepository.save(new Role(3L, "ROLE_Admin"));
        }
    }

}
