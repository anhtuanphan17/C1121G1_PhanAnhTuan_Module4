package blog.create_blog.blog_app.controller;

import blog.create_blog.blog_app.model.Blog;
import blog.create_blog.blog_app.service.IBlogService;
import blog.create_blog.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService categoryService;

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String showListBlog(ModelMap modelMap) {
//        modelMap.addAttribute("blogList", this.iBlogService.findAll());
//        return "list";
//    }

    @GetMapping("/home")
    public ResponseEntity<Page<Blog>> searchBlogByName(@PageableDefault(value = 2) Pageable pageable,
                                                           @RequestParam Optional<String> searchWord) {
        String keywordValue = searchWord.orElse("");
        Page<Blog> blogList = this.iBlogService.findAllPaging(keywordValue,pageable);

        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }



    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ResponseEntity<Blog> viewDetails(@PathVariable int id) {
        Blog blog =iBlogService.findById(id);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

//    @RequestMapping(value = "/listbycategory/{name}", method = RequestMethod.GET)
//    public ResponseEntity<List<Blog>> blogListByCategoryId(@PathVariable String name){
//        List<Blog> blogList = iBlogService.findAllByCategory_CategoryNameContaining(name);
//        return new ResponseEntity<>(blogList,HttpStatus.OK);
//    }

    @RequestMapping(value = "/listbycategory/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> blogListByCategoryId(@PathVariable String name){
        List<Blog> blogList = iBlogService.findAllBlogByCategoryName(name);
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public String showCreateForm(ModelMap modelMap) {
//        modelMap.addAttribute("categoryList",categoryService.findAll());
//        modelMap.addAttribute("blogs", new Blog());
//        return "create";
//    }

//    @RequestMapping(value = "create", method = RequestMethod.POST)
//    public ResponseEntity<Void> create(@RequestBody Blog blogs) {
//        iBlogService.save(blogs);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public String showEditForm(@PathVariable Integer id, ModelMap modelMap) {
//        modelMap.addAttribute("blogs", iBlogService.findById(id));
//        return "edit";
//
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public String edit(@ModelAttribute Blog blogs) {
//        iBlogService.save(blogs);
//        return "redirect:home";
//    }
//
//    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
//    public String showDeleteForm(@PathVariable int id, ModelMap modelMap) {
//        modelMap.addAttribute("blogs", iBlogService.findById(id));
//        return "delete";
//    }
//
//    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    public String detele(@ModelAttribute Blog blogs) {
//        iBlogService.delete(blogs);
//        return "redirect:home";
//    }
//

}
