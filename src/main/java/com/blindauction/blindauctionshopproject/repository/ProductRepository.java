package com.blindauction.blindauctionshopproject.repository;

import com.blindauction.blindauctionshopproject.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>  {
    List<Product> findAllByOrderByModifiedAtDesc();
    Page<Product> findAllByOrderByModifiedAtDesc(Pageable pageable);
}
