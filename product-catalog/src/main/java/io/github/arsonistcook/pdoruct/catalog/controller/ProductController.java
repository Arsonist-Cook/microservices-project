package io.github.arsonistcook.pdoruct.catalog.controller;

import io.github.arsonistcook.pdoruct.catalog.model.Product;
import io.github.arsonistcook.pdoruct.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product body) {
        return productRepository.save(body);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Iterable<Product>> listAll() {
        return ResponseEntity.ok().body(productRepository.findAll());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productId) {
        Optional<Product> result;
        result = productRepository.findById(productId);

        return ResponseEntity.of(result);
    }
}
