package com.kgisl.webPage;



import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
   
    public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Session created.");
        
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
        HttpSession session = arg0.getSession();
        // TODO Auto-generated method stub HttpSession session = se.getSession();
        String username = (String) session.getAttribute("username");
        if (username != null) {
            System.out.println("Session destroyed for user " + username);
        }
        
    }
}

