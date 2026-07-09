package com.db.amazon.product.Repository;

import com.db.amazon.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Override
    List<Product> findAll();
    List<Product> findByNameContainingIgnoreCase(String keyword);

    @Query("""
    SELECT p from Product p where lower(p.name) LIKE lower(concat('%',:keyword,'%'))
    and lower(p.description) like lower(concat('%',:description,'%'))
    """)
    List<Product>searchproduct(@Param("keyword") String keyword , @Param("description") String description);


}
