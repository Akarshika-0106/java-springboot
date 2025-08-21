package codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.City;

import java.util.List;

public class Theatre {

    private City city;
    private List<Screen> screens;
    private List<Show> shows;


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
