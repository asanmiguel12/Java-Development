package com.pluralsight.NorthwindShippers;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShippersDataManager {
    private DataSource dataSource;

    public ShippersDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // get all shippers
    public List<Shipper> getAllShippers() {
        List<Shipper> shippers = new ArrayList<>();

        // fetch shippers from db
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM shippers");
            ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                shippers.add(new Shipper(rs.getInt(1), rs.getString(2),
                        rs.getString("phone")));
            }
        } catch(SQLException e) {
            System.out.println( e.getMessage());
        }

        return shippers;
    }
}
