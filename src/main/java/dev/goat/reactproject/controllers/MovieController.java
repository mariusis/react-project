package dev.goat.reactproject.controllers;

import dev.goat.reactproject.domain.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.goat.reactproject.services.MovieService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllMovies(){
        return new ResponseEntity<List<String>>(movieService.allMovies().stream().map(Movie::getTitle).collect(Collectors.toList()), HttpStatus.OK);
    }
}
