package com.nuvissoft.commerce.productsservice.controllers;

import java.util.ArrayList;
import java.util.List;

import com.nuvissoft.commerce.productsservice.data.domain.Product;
import com.nuvissoft.commerce.productsservice.web.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/product")
@CrossOrigin
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {

        return productService.findAll();

    }

    @GetMapping("/byBarcode")
    public ResponseEntity<Product> getProductByBarcode(@RequestParam String barcode){
        Product requestedProduct= this.productService.findByBarcode(barcode);
        if(requestedProduct != null)
            return new ResponseEntity<Product>(requestedProduct, HttpStatus.OK);
        else
            return new ResponseEntity<Product>(requestedProduct, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product newProduct) {
        Product productAdded = productService.addNewProduct(newProduct);

        return new ResponseEntity<Product>(productAdded, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<Product> editProduct(@RequestBody Product toEdit) {

        return new ResponseEntity<Product>(
                productService.updateProduct(toEdit),
                HttpStatus.OK);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<Product> removeProduct(@RequestBody Product toDelete) {

        return new ResponseEntity<Product>(
                this.productService.removeProduct(toDelete),
                HttpStatus.OK);
    }

    @DeleteMapping("/remove/purge")
    public String removeAllThose(@RequestBody List<Product> allProductsToDelete) {
        String message = "Delete done";


        if (productService.removeAllProducts(allProductsToDelete).size() < 1) {
            message = "Nothing deleted";
        }

        return message;
    }

}