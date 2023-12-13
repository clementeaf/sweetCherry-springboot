package com.api.crud;

import com.api.crud.models.Product;
import com.api.crud.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void run(String... args) {
        initializeData();
    }

    private void initializeData() {
        for (int i = 1; i <= 10; i++) {
            Product product = new Product();
            product.setTitle("Product " + i);
            product.setPrice(10 * i);
            product.setQuantity(i * 5);
            product.setDescription("Description for Product " + i);
            productRepository.save(product);
        }
    }
}
