package com.mohit.royalecommerce.service;

import com.mohit.royalecommerce.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface ProductService  {



    Product addProduct(Product product, MultipartFile imagefile) throws IOException;

    List<Product> getAllProducts();

    Product getProductById(int id);

    Product updateProduct(int id, Product product, MultipartFile imagefile) throws IOException;

    void deleteProduct(int id);

    List<Product> searchProducts(String keyword);

//    @Autowired
//    private ProductRepo repo;
//
//
//    public List<Product> getAllProducts() {
//        return repo.findAll();
//    }
//
//    public Product getProductById(int id) {
//        return repo.findById(id).orElse(null);
//
//    }
//
//
//    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
//        product.setImageName(imageFile.getOriginalFilename());
//        product.setImageType(imageFile.getContentType());
//        byte[] imageData;
//        imageData = imageFile.getBytes();
//        product.setImageData(imageData);
//       // product.setImageData(imageFile.getBytes());
//
//        return repo.save(product);
//    }
//
//    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
//       product.setImageData(imageFile.getBytes());
//       product.setImageType(imageFile.getOriginalFilename());
//       product.setImageType(imageFile.getContentType());
//        return repo.save(product);
//    }
//
//
//    public void deleteProduct(int id) {
//        repo.deleteById(id);
//    }
//
//    public List<Product> searchProducts(String keyword) {
//        return repo.searchProducts(keyword);
//    }
}
