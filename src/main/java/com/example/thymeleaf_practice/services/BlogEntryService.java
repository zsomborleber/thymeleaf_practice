package com.example.thymeleaf_practice.services;

import com.example.thymeleaf_practice.models.BlogEntry;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class BlogEntryService {

    List<BlogEntry> blogs = List.of(
            new BlogEntry("Title1","Content1","Java",5,true, LocalDate.now()),
            new BlogEntry("Title2","Content2","Java",3,true,LocalDate.now()),
            new BlogEntry("Title3","Content3","Python",3,false,LocalDate.now()),
            new BlogEntry("Title4","Content4","Python",4,true,LocalDate.now()),
            new BlogEntry("Title5","Content5","C++",5,true,LocalDate.now()),
            new BlogEntry("Title6","Content6","C++",4,false,LocalDate.now()));

    int counter = 0;

    public List<BlogEntry> getAll() {
        return blogs;
    }

    public BlogEntry saveBlogs(BlogEntry blogEntry) {

        blogs.add(blogEntry);

        return blogEntry;
    }


}
