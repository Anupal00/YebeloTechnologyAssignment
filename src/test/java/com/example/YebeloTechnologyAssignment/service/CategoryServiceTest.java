package com.example.YebeloTechnologyAssignment.service;

import com.example.YebeloTechnologyAssignment.model.Category;
import com.example.YebeloTechnologyAssignment.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryServiceTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void save(){
        List<Category> categoryList = List.of(
                Category.builder().categoryCode("001").value(23L).build(),
                Category.builder().categoryCode("002").value(123L).build(),
                Category.builder().categoryCode("003").value(45L).build(),
                Category.builder().categoryCode("004").value(67L).build(),
                Category.builder().categoryCode("005").value(92L).build()
        );
        categoryRepository.saveAll(categoryList);
    }
}