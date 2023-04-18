package ua.com.shop.shop_admin_np_371_372.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.shop.shop_admin_np_371_372.service.CategoryManagerService;

@Controller
public class HomeController {
    private  final CategoryManagerService categoryService;

    @Autowired
    public HomeController(CategoryManagerService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/products")
    public String getProductAdmin(){
        return "productAdminPage";
    }

    @GetMapping("/categories")
    public String getCategoryAdmin(){
        return "categoryAdminPage";
    }

    @GetMapping("/orders")
    public String getOrdersAdmin(){
        return "order";
    }

    @GetMapping("/customers")
    public String getCustomersAdmin(){
        return "customer";
    }
}
