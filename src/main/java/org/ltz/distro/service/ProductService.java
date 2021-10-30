package org.ltz.distro.service;

import org.ltz.distro.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findByName(String name);
    List<Product> findAllPremium();
}
