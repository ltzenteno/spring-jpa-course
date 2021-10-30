package org.ltz.distro.web;

import lombok.RequiredArgsConstructor;
import org.ltz.distro.entity.Product;
import org.ltz.distro.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findByName(@RequestParam(name = "name") final String name) {
        if (name == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        List<Product> products = this.productService.findByName(name);

        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/premium")
    public ResponseEntity<List<Product>> findPremium() {
        return ResponseEntity.status(HttpStatus.OK).body(this.productService.findAllPremium());
    }
}
