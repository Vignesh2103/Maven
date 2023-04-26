package com.kgisl.CRUD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.Action;

@WebServlet(name = "Servlet1", urlPatterns = { "/serv", "/delete","/edit","/update" })
public class CarServlet extends HttpServlet {
    static ArrayList<Car> carList = new ArrayList<Car>();

    @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  List<String> lits = new ArrayList<>();
            //  ArrayList<Car> carList = new ArrayList<Car>();

            //  carList.add(new Car(001, "BMW", 2000f));
            //  carList.add(new Car(002, "BENZ", 4000f));
            //  carList.add(new Car(003, "BUGGATI", 6000f));
            //  carList.add(new Car(004, "ROLLS ROYCE", 8000f));
            //  carList.add(new Car(005, "LABORGHINI", 9000f));
            //  carList.add(new Car(006, "AUDI", 10000f));
            //  carList.add(new Car(007, "FORD-GT", 12000f));
            String action = req.getServletPath();
            System.out.println(action);
            if(action.equals("/delete")){
                int id = Integer.parseInt(req.getParameter("id"));
                ListIterator <Car> iterator = carList.listIterator();
                while (iterator.hasNext()) {
                    Car car = iterator.next();
                    if (car.getId() == id) { 
                        iterator.remove();
                        break; 
                    }
                }

            }
            if (action.equals("/edit")) {
                int id = Integer.valueOf(req.getParameter("id"));
                // String name=req.getParameter("name");
                // Float prize = Float.parseFloat(req.getParameter("prize"));
                // System.out.println(id);
                // System.out.println(name);
                // System.out.println(prize);
              
                for (Car car : carList) {
                   if(id == car.getId()){
                    req.setAttribute("id", id);
                    String name=car.getName();
                    Float prize = car.getPrize();
                    req.setAttribute("name", name);
                    req.setAttribute("prize", prize);
                    // RequestDispatcher rd = req.getRequestDispatcher("Car.jsp");
                    // rd.forward(req, resp);
                    break;
                   }
                   else{
                        continue;
                   }
                    
                }
                
            }
            if(action.equals("/update")){
                int  id =   Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                Float prize = Float.parseFloat(req.getParameter("prize"));
                for (Car car : carList) {
                    if(id == car.getId()){
                        car.setName(name);
                        car.setPrize(prize);
                    }
                    
                }
            }
            req.setAttribute("carList", carList);
            RequestDispatcher rd = req.getRequestDispatcher("Car.jsp");
            rd.forward(req, resp);   

          

     }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String i = req.getParameter("id");
        String name = req.getParameter("name");
        String pr = req.getParameter("prize");
        int id = Integer.parseInt(i);
        Float prize = Float.parseFloat(pr);

        carList.add(new Car(id, name, prize));
        // HttpSession session = req.getSession();
        // session.setAttribute("carList", carList);
        doGet(req, resp);

    }

}
