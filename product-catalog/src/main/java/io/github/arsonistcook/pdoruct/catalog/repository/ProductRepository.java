package io.github.arsonistcook.pdoruct.catalog.repository;

import io.github.arsonistcook.pdoruct.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
