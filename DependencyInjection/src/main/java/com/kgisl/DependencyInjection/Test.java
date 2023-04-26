package com.kgisl.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@Controller
public class Test {
    @Autowired
    private Employee employee;
    static{
        System.out.println("Test");
    }

    @RequestMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/m")
    public String home() {

        // ApplicationContext context = new
        // AnnotationConfigApplicationContext(EmployeeConfig.class);

        // EmployeeConfig employee = context.getBean(EmployeeConfig.class);
   
        // employee.show();


        ApplicationContext fieldContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        EmployeeConfig emp = fieldContext.getBean(EmployeeConfig.class);
        employee.getMsg("Hello");
       
        



        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Employee employee2 = context.getBean(Employee.class);

        // employee2.show();

        // GenericApplicationContext context1 = new GenericApplicationContext();
        // context1.registerBean(EmployeeConfig.class);

        // // Refresh the context to load the bean definitions
        // context1.refresh();

        // // Retrieve the Employee bean from the context
        // EmployeeConfig employe = context1.getBean("e",EmployeeConfig.class);

        // // Call the show method on the Employee instance
        // employe.show();

        return "index";
    }

}
