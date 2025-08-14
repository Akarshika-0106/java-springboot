package LowLevelDesign.PracticeQuestions.DesignBookMyShow;

import LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.City;
import LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.PaymentCategory;
import LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    private MovieController movieController;
    private TheatreController theatreController;

    public BookMyShow(){
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialise();
        bookMyShow.createBooking("Beautiful Mind", City.DELHI);
        bookMyShow.createBooking("Beautiful Mind", City.DELHI);

    }

    private void createBooking(String movieName, City city){
        Movie movie = movieController.getMovieByName(movieName);
        Map<Theatre, List<Show>> theatreShowsMap = theatreController.getAllShowsForMovie(city, movie);
        Map.Entry<Theatre, List<Show>> entry = theatreShowsMap.entrySet().iterator().next();
        List<Show> shows = entry.getValue();
        Show interestedShow = shows.get(0);
        int seatNumber = 30;
        List<Integer> bookedIds = interestedShow.getBookedSeatIds();
        if(!bookedIds.contains(seatNumber)){
            bookedIds.add(seatNumber);
        }else{
            System.out.println("Seat already booked, try again");
            return;
        }

        Booking booking = new Booking();
        List<Integer> myBookedSeats = new ArrayList<>();
        for (Seat seat: interestedShow.getScreen().getSeats()){
            if(seat.getSeatId() == seatNumber){
                myBookedSeats.add(seat.getSeatId());
            }
        }
        booking.setBookedSeats(myBookedSeats);
        booking.setShow(interestedShow);
        Payment payment = new Payment();
        payment.makePayment(PaymentCategory.UPI);
        booking.setPayment(payment);

        System.out.println("Booking Successful");
    }

    private void initialise(){
        initialiseMovies();
        initialiseTheatres();

    }

    private void initialiseMovies(){
        Movie movie1 = new Movie(1, "Beautiful Mind", 120);
        Movie movie2 = new Movie(1, "Life of Pi", 125);

        movieController.addMovie(City.BANGALORE, movie1);
        movieController.addMovie(City.BANGALORE, movie2);
        movieController.addMovie(City.DELHI, movie1);
        movieController.addMovie(City.DELHI, movie2);
    }

    private void initialiseTheatres(){
        Movie movie1 = movieController.getMovieByName("Beautiful Mind");
        Movie movie2 = movieController.getMovieByName("Life of Pi");

        Theatre pvr = new Theatre();
        pvr.setCity(City.BANGALORE);
        pvr.setScreens(createScreen());
        Show morningPvrShow = createShow(1, movie1, pvr.getScreens().get(0), 10);
        Show eveningPvrShow = createShow(2, movie2, pvr.getScreens().get(0), 7);
        List<Show> pvrShows = new ArrayList<>();
        pvrShows.add(morningPvrShow);
        pvrShows.add(eveningPvrShow);
        pvr.setShows(pvrShows);
        theatreController.addTheatre(City.BANGALORE, pvr);

        Theatre imax = new Theatre();
        imax.setCity(City.DELHI);
        imax.setScreens(createScreen());
        Show morningImaxShow = createShow(1, movie1, pvr.getScreens().get(0), 10);
        Show eveningImaxShow = createShow(2, movie2, pvr.getScreens().get(0), 7);
        List<Show> imaxShows = new ArrayList<>();
        imaxShows.add(morningImaxShow);
        imaxShows.add(eveningImaxShow);
        imax.setShows(imaxShows);
        theatreController.addTheatre(City.DELHI, imax);
    }

    private List<Screen> createScreen(){
        List<Screen> screenList = new ArrayList<>();
        Screen screen = new Screen();
        screen.setScreenId(1);
        screen.setSeats(createSeats());
        screenList.add(screen);
        return screenList;
    }

    private Show createShow(int showId, Movie movie, Screen screen, int startTime){
        Show show = new Show();
        show.setShowId(showId);
        show.setMovie(movie);
        show.setScreen(screen);
        show.setStartTime(startTime);
        return show;
    }

    private List<Seat> createSeats(){
        List<Seat> seatList = new ArrayList<>();
        //Silver
        for(int i=0; i<40; i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seatList.add(seat);
        }

        //Platinum
        for(int i=40; i<70; i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seatList.add(seat);
        }

        //Gold
        for(int i=70; i<100; i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seatList.add(seat);
        }

        return seatList;
    }
}
