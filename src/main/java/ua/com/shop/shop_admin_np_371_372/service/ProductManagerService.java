package ua.com.shop.shop_admin_np_371_372.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.shop.shop_admin_np_371_372.entity.Category;
import ua.com.shop.shop_admin_np_371_372.entity.Product;
import ua.com.shop.shop_admin_np_371_372.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductManagerService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductManagerService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveNewProductToDB(String name, String description, String image, BigDecimal price, Category category){

        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setImage(image);
        product.setPrice(price);
        product.setCategories(category);

        productRepository.save(product);
    }

    public void updateProduct(Long id, String name, String description, String image, BigDecimal price, Category category){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setImage(image);
        product.setPrice(price);
        product.setCategories(category);

        productRepository.save(product);
    }


    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }

    public void deleteAllProduct(){
        productRepository.deleteAll();
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public Product findProductById(Long id){
        return productRepository.findById(id).get();
    }

    public Product findProductByName(String name){
        return productRepository.findByName(name);
    }

    public boolean sizeProductByCategory(Category category){
        List<Product> products  = productRepository.findAllByCategories(category);
        if(products.size()>0){
            return true;
        } else {
            return false;
        }
    }
}
