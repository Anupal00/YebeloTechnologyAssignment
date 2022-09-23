package com.example.YebeloTechnologyAssignment.repository;

import com.example.YebeloTechnologyAssignment.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category findByCategoryCode(String categoryCode);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update category set value = ?1 where category_code = ?2",nativeQuery = true)
    int updateByValue(Long value,String categoryCode);
}
