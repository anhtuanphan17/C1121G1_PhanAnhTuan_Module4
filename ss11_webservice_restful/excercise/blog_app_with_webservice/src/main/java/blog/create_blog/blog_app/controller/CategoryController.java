package blog.create_blog.blog_app.controller;

import blog.create_blog.blog_app.model.Category;
import blog.create_blog.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController

public class CategoryController {
    @Autowired
    ICategoryService categoryService;

    @RequestMapping(value = "/category-list", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> showCategoryList() {
        List<Category> categoryList = categoryService.findAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

//
//    @RequestMapping(value = "/create-category", method = RequestMethod.GET)
//    public String showCreateCategoryForm(ModelMap modelMap) {
//        modelMap.addAttribute("category", new Category());
//        return "category/create";
//    }
//
//    @PostMapping("/create-category")
//    public String saveCategory(@ModelAttribute("province") Category category, ModelMap modelMap) {
//        categoryService.save(category);
//
//        modelMap.addAttribute("category", new Category());
//        modelMap.addAttribute("message", "New category created successfully");
//        return "category/create";
//    }
//
//    @GetMapping("/delete-category/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Integer id) {
//        Category category = categoryService.findById(id);
//        ModelAndView modelAndView = new ModelAndView("category/delete");
//        modelAndView.addObject("category", category);
//        return modelAndView;
//
//
//    }
//
//    @PostMapping("/delete-category")
//    public String deleteProvince(@ModelAttribute Category category) {
//        categoryService.delete(category.getCategoryId());
//        return "redirect:/category-list";
//    }


}
