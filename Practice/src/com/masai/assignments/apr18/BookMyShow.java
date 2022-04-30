package com.masai.assignments.apr18;

import com.masai.practice.patterns.User;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {

    static  List<Movie> movieList=new ArrayList<>();
    public static void main(String[] args) {


         createMovie(001,"RRR");
            System.out.println(movieList);

            User user1=new User();
            user1.bookTicket(001);





    }
    public static boolean createMovie(int movieId,String movieName){

        Movie movie=new Movie();

        movie.setMovieId(movieId);
        movie.setMovieName(movieName);


        Admin admin=new Admin();
        return admin.addMovie(movie);

    }

}
// user should be able to book the ticket and cancel the ticket
// user can able to see the list of movies in a city
// List of Theatres associated with movie
// Admin can add or remove the movie
// movie can have list of show timings

class Movie{

    private int movieId;
    private String movieName;

    public Movie() {
    }

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName +
                '}';
    }
}
class Theatre{

    private int theatreId;
    private String theatreName;
    private List<Movie> movieList;

    public Theatre() {
    }

    public Theatre(int theatreId, String theatreName, List<Movie> movieList) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.movieList = movieList;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", movieList=" + movieList +
                '}';
    }
}

class City{

    private String cityName;
    private List<Theatre> theatreList;

    public City() {
    }

    public City(String cityName, List<Theatre> theatreList) {
        this.cityName = cityName;
        this.theatreList = theatreList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", theatreList=" + theatreList +
                '}';
    }
}
abstract class Person{

    private String name;
    private String role;

    public Person() {
    }

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

//class User extends Person{
//
//
//    public boolean bookTicket(int movieId){
//        return false;
//    }
//
//    public boolean cancelTicket(int userid,int movieId){
//        return  false;
//    }
//
//}

class Admin extends Person{


    public boolean addMovie(Movie movie){

        return BookMyShow.movieList.add(movie);

    }

    public boolean removeMovie(List<Movie> movieList){
        return false;
    }


}

enum SeatStatus{AVAILABLE,FILLED}
enum ROLE{USER,ADMIN}
enum BookingStatus{REQUESTED, PENDING, SUCCESSFULL,FAILED}