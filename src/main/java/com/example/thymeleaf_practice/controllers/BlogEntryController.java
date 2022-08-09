package com.example.thymeleaf_practice.controllers;

import com.example.thymeleaf_practice.models.BlogEntry;
import com.example.thymeleaf_practice.services.BlogEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class BlogEntryController {

    @Autowired
    BlogEntryService blogEntryService;

    @GetMapping("/task1")
    public String task1(Model model){
        BlogEntry blogEntry = new BlogEntry("Title1","Content1","Java",5,true, LocalDate.now());

        model.addAttribute("entry",blogEntry);


        return "task1";
        }


       // > == &gt;
       // < == &lt;

    @GetMapping("/task2")
    public String task2(Model model){
        BlogEntry blogEntry = new BlogEntry("Title1",
                "Content1","Java",5,
                true, LocalDate.now());

        model.addAttribute("entry",blogEntry);


        return "task2";
    }
    @GetMapping("/task3")
    public String task3(Model model){
        BlogEntry blogEntry = new BlogEntry("Title1",
                "Content1","Python",5,
                true, LocalDate.now());

        model.addAttribute("entry",blogEntry);


        return "task3";
    }

    @GetMapping("/task4")
    public String task4(Model model){
        BlogEntry blogEntry = new BlogEntry("Title1",
                "Content1","Python",5,
                true, LocalDate.now());

        model.addAttribute("entry",blogEntry);
        List<String> names = List.of("Pista", "Józsi");
        model.addAttribute("names", names);


        return "task4";
    }

    @GetMapping("/task5")
    public String task5(){

        return "task5";
    }


    @GetMapping("/task6")
    public String task6(Model model){


        List<BlogEntry> blogs = List.of(
                new BlogEntry("Title1","Content1","Java",5,true,LocalDate.now()),
                new BlogEntry("Title2","Content2","Java",3,true,LocalDate.now()),
                new BlogEntry("Title3","Content3","Python",3,false,LocalDate.now()),
                new BlogEntry("Title4","Content4","Python",4,true,LocalDate.now()),
                new BlogEntry("Title5","Content5","C++",5,true,LocalDate.now()),
                new BlogEntry("Title6","Content6","C++",4,false,LocalDate.now()));


        model.addAttribute("entry",blogs);


        return "task6";
    }
    @PostMapping("/task7")
    public String task8(BlogEntry blogEntry) {
        blogEntryService.saveBlogs(blogEntry);
        return "redirect:/task7";
    }

    @GetMapping("/task7")
    public String task7(Model model){

        List<BlogEntry> blogEntries = blogEntryService.getAll();

        model.addAttribute("newEntry",new BlogEntry());
        model.addAttribute("blogs",blogEntries);

        return "task7";
    }


}
