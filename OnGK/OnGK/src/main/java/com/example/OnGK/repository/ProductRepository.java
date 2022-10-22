package com.example.OnGK.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.OnGK.entity.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	@Query(value = "select * from product", nativeQuery = true)
	public List<Product> findAllProduct();
}
