package com.pluralsight.Sakila;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActorDataManager {
    private DataSource dataSource;
    private static Scanner scanner = new Scanner(System.in);

    public ActorDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // get all actors
    public List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();

        System.out.println("Please Enter The Last Name Of The Actor You Want To Search:");
        String nameChoice = scanner.nextLine();

        String query = "SELECT * FROM actor WHERE last_name = ?";

        // fetch products from db
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {

            // set prepared statement to wanted param index with user input
            statement.setString(1, nameChoice);

            try ( ResultSet rs = statement.executeQuery()
            ) {
                while (rs.next()) {
                    actors.add(new Actor(rs.getString(1), rs.getString(2), rs.getInt("actor_id")));
                }
                    System.out.println(actors);
            }
        } catch(SQLException e) {
            System.out.println( e.getMessage());
        }

        return actors;
    }
    public List<Film> getAllFilmByActorName() {
        List<Film> actorFilms = new ArrayList<>();

        System.out.println("Please Enter The Last Name Of The Actor You Want To Search:");
        String lastNameChoice = scanner.nextLine();

        System.out.println("Please Enter The First Name Of The Actor You Want To Search:");
        String firstNameChoice = scanner.nextLine();

        String query = "SELECT film.film_id, title, description, release_year, length " +
                "FROM film " +
                "JOIN film_actor " +
                "ON film.film_id = film_actor.film_id " +
                "JOIN actor " +
                "ON actor.actor_id = film_actor.actor_id " +
                "WHERE last_name = ? AND first_name = ?";

        // fetch products from db
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {

            // set prepared statement to wanted param index with user input
            statement.setString(1, lastNameChoice);
            statement.setString(2, firstNameChoice);


            try ( ResultSet rs = statement.executeQuery()
            ) {
                while (rs.next()) {
                    actorFilms.add(new Film(rs.getInt("film_id"), rs.getString("title"),
                            rs.getString("description"), rs.getInt("release_year"),
                            rs.getInt("length")));
                }
                    System.out.println(actorFilms);
            }
        } catch(SQLException e) {
            System.out.println( e.getMessage());
        }

        return actorFilms;
    }

    public List<Film> getAllFilmsByActorId() {
        List<Film> actorFilms = new ArrayList<>();

        System.out.println("Please Enter The Last Name Of The Actor You Want To Search:");
        String actorIdChoice = scanner.nextLine();


        String query =  "SELECT film.film_id, title, description, release_year, length " +
                "FROM film " +
                "JOIN film_actor " +
                "ON film.film_id = film_actor.film_id " +
                "JOIN actor " +
                "ON actor.actor_id = film_actor.actor_id " +
                "WHERE actor.actor_id = ?";

        // fetch products from db
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {

            // set prepared statement to wanted param index with user input
            statement.setString(1, actorIdChoice);


            try ( ResultSet rs = statement.executeQuery()
            ) {
                while (rs.next()) {
                    actorFilms.add(new Film(rs.getInt("film_id"), rs.getString("title"),
                            rs.getString("description"), rs.getInt("release_year"),
                            rs.getInt("length")));
                }
                System.out.println(actorFilms);
            }
        } catch(SQLException e) {
            System.out.println( e.getMessage());
        }

        return actorFilms;
    }
}
