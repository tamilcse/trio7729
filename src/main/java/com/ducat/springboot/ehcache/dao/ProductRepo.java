package com.ducat.springboot.ehcache.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ducat.springboot.ehcache.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}