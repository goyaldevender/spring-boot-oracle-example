package com.springframework.services;

import com.springframework.commands.ProductForm;
import com.springframework.domain.Product;

import java.util.List;

/**
 * Created by Devender on 5/13/18.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
