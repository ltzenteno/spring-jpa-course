package org.ltz.distro.service.impl;

import lombok.AllArgsConstructor;
import org.ltz.distro.entity.Product;
import org.ltz.distro.repository.ProductRepository;
import org.ltz.distro.repository.specification.ProductSpecifications;
import org.ltz.distro.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findByName(String name) {
        return this.productRepository.findAll(ProductSpecifications.nameLike(name));
    }

    @Override
    public List<Product> findAllPremium() {
        return this.productRepository.findAll(ProductSpecifications.isPremium());
    }
}
