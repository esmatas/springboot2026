package com.esmatas.data.repository;

import com.esmatas.data.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CrudRepository
@Repository
public interface IBlogRepository extends JpaRepository<BlogEntity, Long> {

    // Delivery Query

}
