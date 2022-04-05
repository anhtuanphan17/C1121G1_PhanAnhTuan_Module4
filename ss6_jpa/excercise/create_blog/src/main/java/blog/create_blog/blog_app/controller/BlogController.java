package blog.create_blog.blog_app.controller;

import blog.create_blog.blog_app.model.Blog;
import blog.create_blog.blog_app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String showListBlog(ModelMap modelMap){
        modelMap.addAttribute("blogList",this.iBlogService.findAll());
        return "list";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String showCreateForm(ModelMap modelMap){
        modelMap.addAttribute("blogs", new Blog());
        return "create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@ModelAttribute Blog blogs){
        iBlogService.save(blogs);

        return "redirect:home";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String showEditForm(@PathVariable Integer id,ModelMap modelMap){
        modelMap.addAttribute("blogs",iBlogService.findById(id));
        return "edit";

    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(@ModelAttribute Blog blogs){
    iBlogService.save(blogs);
    return "redirect:home";

    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String showDeleteForm(@PathVariable int id,ModelMap modelMap){
        modelMap.addAttribute("blogs",iBlogService.findById(id));
        return "delete";
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public String detele(@ModelAttribute Blog blogs){
        iBlogService.delete(blogs);
        return "redirect:home";
    }

    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public String viewDetails(@PathVariable int id, ModelMap modelMap){
        modelMap.addAttribute("blogs",iBlogService.findById(id));
        return "view";
    }
}
