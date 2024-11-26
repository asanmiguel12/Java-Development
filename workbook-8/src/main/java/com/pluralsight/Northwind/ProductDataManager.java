package com.pluralsight.Northwind;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDataManager {
    private DataSource dataSource;

    public ProductDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // get all products
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        // fetch products from db
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
            ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                products.add(new Product(rs.getInt(1), rs.getString(2)));
            }
        } catch(SQLException e) {
            System.out.println( e.getMessage());
        }

        return products;
    }
}

