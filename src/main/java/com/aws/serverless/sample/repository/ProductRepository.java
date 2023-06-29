package com.aws.serverless.sample.repository;

import com.aws.serverless.sample.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface ProductRepository extends CrudRepository<Product,String> {
}