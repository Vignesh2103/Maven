package com.kgisl.carCRUD;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp2.BasicDataSource;

@WebServlet("/ds")
public class DataSource extends HttpServlet {
    ArrayList<Car> carList=new ArrayList<Car>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BasicDataSource dataSource = new BasicDataSource();

        //dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/carstore?serverTimezone=UTC");
        dataSource.setMaxActive(10);
        // bds.setDriverClassName("com.mysql.jdbc.Driver");
        // bds.setUrl("");
        // bds.setUrl("");
        // bds.setUrl("");
        // bds.setUsername("root");
        // bds.setPassword("");
        // dataSource.setMax(10);
        // dataSource.setMaxIdle(5);
        // dataSource.setInitialSize(5);
        // dataSource.setValidationQuery("SELECT 1");
        try {
            Connection connection=dataSource.getConnection();
            Statement statement =  connection.createStatement();
            String sql = "SELECT * FROM car"; 
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
            dataSource.close();
            // disconnect();
            // return carList;
            carList.forEach(System.out::println);
        
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
