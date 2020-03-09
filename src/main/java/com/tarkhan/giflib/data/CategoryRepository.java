package com.tarkhan.giflib.data;

import com.tarkhan.giflib.model.Category;
import com.tarkhan.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Android"),
            new Category(2,"Books"),
            new Category(3,"Robots")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for(Category category: ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

}
