package codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {

    Map<City, List<Theatre>> cityTheatreMap;
    List<Theatre> allTheatres;

    public TheatreController(){
        cityTheatreMap = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre theatre){
        List<Theatre> theatres = cityTheatreMap.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityTheatreMap.put(city, theatres);
        allTheatres.add(theatre);
    }

    public List<Theatre> findTheatreByCity(City city){
        return cityTheatreMap.getOrDefault(city, new ArrayList<>());
    }

    public Map<Theatre, List<Show>> getAllShowsForMovie(City city, Movie movie){
        Map<Theatre, List<Show>> theatreShowsMap = new HashMap<>();
        List<Theatre> theatreList = cityTheatreMap.getOrDefault(city, new ArrayList<>());

        for(Theatre theatre: theatreList){
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> allShows = theatre.getShows();
            for(Show show: allShows){
                if(show.getMovie().getMovieId() == movie.getMovieId()){
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()){
                theatreShowsMap.put(theatre, givenMovieShows);
            }
        }
        return theatreShowsMap;
    }
}
