package codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<City, List<Movie>> cityListMap;
    List<Movie> allMovies;

    public MovieController(){
        cityListMap = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(City city, Movie movie){
        List<Movie> movies = cityListMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        allMovies.add(movie);
        cityListMap.put(city, movies);
    }

    public List<Movie> getMoviesByCity(City city){
        return cityListMap.get(city);
    }

    public Movie getMovieByName(String movie){
        for(Movie m: allMovies){
            if(m.getMovieName().equals(movie)){
                return m;
            }
        }
        return null;
    }
}
