package com.mohit.royalecommerce.service.impl;

import com.mohit.royalecommerce.model.Product;
import com.mohit.royalecommerce.repo.ProductRepo;
import com.mohit.royalecommerce.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductImplService implements ProductService {

    private final ProductRepo repo;

    public ProductImplService(ProductRepo repo) {
        this.repo = repo;
    }



    public List<Product> getAllProducts() {
        return repo.findAll();
  }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        byte[] imageData;
        imageData = imageFile.getBytes();
        product.setImageData(imageData);
        // product.setImageData(imageFile.getBytes());

        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageType(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }


    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return repo.searchProducts(keyword);
    }







}
