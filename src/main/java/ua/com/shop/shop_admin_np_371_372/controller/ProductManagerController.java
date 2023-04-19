package ua.com.shop.shop_admin_np_371_372.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.shop.shop_admin_np_371_372.entity.Category;
import ua.com.shop.shop_admin_np_371_372.entity.Product;
import ua.com.shop.shop_admin_np_371_372.service.CategoryManagerService;
import ua.com.shop.shop_admin_np_371_372.service.ProductManagerService;

import java.math.BigDecimal;

@Controller
public class ProductManagerController {

    private final ProductManagerService productService;

    private final CategoryManagerService categoryManagerService;

    @Autowired
    public ProductManagerController(ProductManagerService productService, CategoryManagerService categoryManagerService) {
        this.productService = productService;
        this.categoryManagerService = categoryManagerService;
    }

    @GetMapping("/productmanager")
    public String getAllProduct(Model model) {
        model.addAttribute("allProduct", productService.findAllProduct());
        model.addAttribute("allCategory", categoryManagerService.getCategoryList());
        return "productAdminPage";
    }


    @PostMapping("/saveNewProduct")
    public String saveNewProductToDB(@RequestParam(value = "name") String name,
                                     @RequestParam(value = "description") String descr,
                                     @RequestParam(value = "image") String image,
                                     @RequestParam(value = "price") BigDecimal price,
                                     @RequestParam(value = "categoryId") Category category
    ) {

        productService.saveNewProductToDB(name, descr, image, price, category);

        return "redirect:/productmanager";
    }

    @PostMapping("/updateProduct")
    public String updateProduct(
            @RequestParam(value = "id") Long id,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "description") String descr,
            @RequestParam(value = "image") String image,
            @RequestParam(value = "price") String price1,
            @RequestParam(value = "categoryId") Category category
    ) {


        BigDecimal price = new BigDecimal(Double.valueOf(price1.replaceAll("[^0-9]","")));

        productService.updateProduct(id,name, descr, image, price, category);

        return "redirect:/productmanager";
    }


    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam(value = "id") Long id){

        productService.deleteProductById(id);

        return "redirect:/productmanager";
    }


    @PostMapping("/deleteAllProduct")
    public String deleteAllProduct(){

        productService.deleteAllProduct();

        return "redirect:/productmanager";
    }

    @GetMapping("/productmanager/{id}")
    public String getCategoryPageById(@PathVariable("id") Long id,
                                      Model model){

        Product product = productService.findProductById(id);
        model.addAttribute("product", product);

        return "productDet";
    }


}
