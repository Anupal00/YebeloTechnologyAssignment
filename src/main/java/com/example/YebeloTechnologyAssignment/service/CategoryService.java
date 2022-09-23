package com.example.YebeloTechnologyAssignment.service;

import com.example.YebeloTechnologyAssignment.model.Category;
import com.example.YebeloTechnologyAssignment.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findByCategoryCode(String categoryCode){
        return categoryRepository.findByCategoryCode(categoryCode);
    }

    public Category save(Category c){
        return categoryRepository.save(c);
    }

    public Category updateByValue(Category category){
        Category c = categoryRepository.findByCategoryCode(category.getCategoryCode());
        Long value = c.getValue();
        long sumOfDigit;
        while(value > 10) {
            sumOfDigit = 0L;
            while (value != 0) {
                long temp = value % 10;
                sumOfDigit += temp;
                value = value / 10;
            }
            value = sumOfDigit;
        }
        long nextValue = c.getValue() + (10-value);
        categoryRepository.updateByValue(nextValue,category.getCategoryCode());
        return categoryRepository.findByCategoryCode(category.getCategoryCode());
    }

    public List<Category> fetchNextNumber(String categoryCode){
        Category category = findByCategoryCode(categoryCode);
        System.out.println(category);
        if(category!=null){
            Category newCategory = updateByValue(category);
            return List.of(category,newCategory);
        }
        else{
            Category x = Category.builder().categoryCode(categoryCode).value(0L).build();
            categoryRepository.save(x);
            Category newCategory = updateByValue(category);
            return List.of(category,newCategory);
        }
    }

}
