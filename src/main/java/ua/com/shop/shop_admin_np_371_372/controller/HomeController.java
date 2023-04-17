package ua.com.shop.shop_admin_np_371_372.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.shop.shop_admin_np_371_372.service.CategoryService;

@Controller
public class HomeController {
    private  final CategoryService categoryService;

    @Autowired
    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/products")
    public String getProductAdmin(){
        return "product";
    }

    @GetMapping("/categories")
    public String getCategoryAdmin(){
        return "category";
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
