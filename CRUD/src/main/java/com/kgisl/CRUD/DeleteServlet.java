// package com.kgisl.CRUD;

// import java.io.IOException;
// import java.util.List;

// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpSession;

// public class DeleteServlet extends HttpServlet {
//     @Override
//     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
//       HttpSession session = req.getSession();
     
//       List<Car> carList= (List<Car>) session.getAttribute("carList");;
//       // List<Car> carList=  (List<Car>);
//       String o= req.getParameter("name");
//       System.out.println(carList);
//       System.out.println(o);
//       // for (Car car : carList) {
//       //   if(o.equals(car.getName())){
//       //       carList.remove(car);
//       //       System.out.println(car);
//       //   }
        
//       // }
//       // RequestDispatcher rd = req.getRequestDispatcher("Car.jsp");
//       // rd.include(req, resp);
//       resp.sendRedirect("Car.jsp");
        
//     }
// }
