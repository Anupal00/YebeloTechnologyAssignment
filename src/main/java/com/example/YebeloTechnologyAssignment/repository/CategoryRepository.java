package com.example.YebeloTechnologyAssignment.repository;

import com.example.YebeloTechnologyAssignment.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
