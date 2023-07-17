package dev.goat.reactproject.services;

import dev.goat.reactproject.domain.Movie;
import dev.goat.reactproject.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
