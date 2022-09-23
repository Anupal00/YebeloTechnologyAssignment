package com.example.YebeloTechnologyAssignment.controller;

import com.example.YebeloTechnologyAssignment.model.Category;
import com.example.YebeloTechnologyAssignment.model.DemoCategoryCode;
import com.example.YebeloTechnologyAssignment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FetchNextNumber")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> fetchNextNumber(@RequestBody DemoCategoryCode demoCategoryCode){
        return categoryService.fetchNextNumber(demoCategoryCode.getCategoryCode());
    }

}
