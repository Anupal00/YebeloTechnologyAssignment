package com.example.YebeloTechnologyAssignment.service;

import com.example.YebeloTechnologyAssignment.model.Category;
import com.example.YebeloTechnologyAssignment.model.DemoCategoryCode;
import com.example.YebeloTechnologyAssignment.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findByCategoryCode(DemoCategoryCode demoCategoryCode){
        return categoryRepository.findByCategoryCode(demoCategoryCode.getCategoryCode());
    }

    public Category save(Category c){
        return categoryRepository.save(c);
    }

}
