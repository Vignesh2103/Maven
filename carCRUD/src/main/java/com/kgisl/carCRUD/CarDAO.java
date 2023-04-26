package com.kgisl.carCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CarDAO {
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection connection;
    public CarDAO(String jdbcURL, String jdbcUsername, String jdbcPassword, Connection connection) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
        this.connection = connection;
    }
    protected void connect() throws SQLException{
        if(connection == null || connection.isClosed()){
            connection=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
    protected void disconnect() throws SQLException{
        if(connection != null && !connection.isClosed()){
            connection.close();
        }
    }
    public List<Car> listAllCar() throws SQLException{
        List<Car> carList = new ArrayList<Car>();
        String sql = "SELECT * FROM car";
        connect();
        Statement statement =  connection.createStatement(); 
        ResultSet resultset = statement.executeQuery(sql);
        while(resultset.next()){
            int id = resultset.getInt("id");
            String model = resultset.getString("model");
            String company = resultset.getString("company");
            Double price = resultset.getDouble("price");
        
            Car car = new Car(id, model, company,price);
            carList.add(car);
        }
        resultset.close();
        statement.close();
        disconnect();
        return carList;
    }

    public boolean insertCar(Car car) throws SQLException{
        connect();
        String sql = "INSERT INTO car (model,company,price) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, car.getModel());
        statement.setString(2, car.getComany());
        statement.setDouble(3, car.getPrice());

        boolean rowInserted = statement.executeUpdate(sql)>0;
        statement.close();
        disconnect();
        return rowInserted;

    }
    public boolean updateCar(Car car) throws SQLException{
        String sql = "UPDATE book SET model=?,company=?,price=?,qty = ?";
        sql += " WHERE id = ?";
        connect();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, car.getModel());
        statement.setString(2, car.getComany());
        statement.setDouble(3,car.getPrice());

        boolean rowUpdated = statement.executeUpdate()>0;
        statement.close();
        disconnect();
        
        return  rowUpdated;

    }
    public boolean deleteCar(Car car) throws SQLException{
        String sql = "DELETE FROM book where id = ?";
        connect();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, car.getId());
        boolean rowDeleted = statement.executeUpdate()>0;
        statement.close();
        disconnect();
        return rowDeleted;

    }
}
