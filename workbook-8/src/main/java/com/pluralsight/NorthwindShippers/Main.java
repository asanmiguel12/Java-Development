package com.pluralsight.NorthwindShippers;

import com.pluralsight.Sakila.ActorFilmDataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import static com.pluralsight.NorthwindShippers.ShippersDAO.insertIntoDirectShippers;

public class Main {
    public static void main(String[] args) {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/northwind");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);


        insertIntoDirectShippers(bds);
    }
}
