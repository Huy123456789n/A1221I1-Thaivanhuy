package com.codegym.product_ajax.controller;
import com.codegym.product_ajax.model.Product;
import com.codegym.product_ajax.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping
    public ResponseEntity<Product> createSmartphone(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Iterable<Product>> allPhones() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteSmartphone(@PathVariable Long id) {
        Optional<Product> smartphoneOptional = productService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        productService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }
    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("product",productService.findAll());
        return modelAndView;
    }
}
