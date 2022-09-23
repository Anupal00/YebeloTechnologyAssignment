package com.example.YebeloTechnologyAssignment.service;

import com.example.YebeloTechnologyAssignment.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


}
