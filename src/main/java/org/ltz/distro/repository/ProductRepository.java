package org.ltz.distro.repository;

import common.repository.IGenericRepository;
import org.ltz.distro.entity.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends IGenericRepository<Product, Long>, JpaSpecificationExecutor<Product>, ProductRepositoryCustom {
}
