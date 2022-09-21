package com.example.movieinfoservice.controller;

import com.example.movieinfoservice.module.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(String movieId){
        return new Movie(movieId,"Test name");
    }
}
