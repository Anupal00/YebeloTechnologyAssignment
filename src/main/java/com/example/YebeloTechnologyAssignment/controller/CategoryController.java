package com.example.YebeloTechnologyAssignment.controller;

import com.example.YebeloTechnologyAssignment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FetchNextNumber")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

}
