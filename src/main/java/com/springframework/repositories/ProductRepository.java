package com.springframework.repositories;

import com.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Devender on 5/13/18.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
