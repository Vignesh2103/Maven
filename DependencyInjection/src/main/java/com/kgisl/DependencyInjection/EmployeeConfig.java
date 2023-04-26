package com.kgisl.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    static{
        System.out.println("EmployeeConfig");
    }

    @Autowired
    private Employee employee;

    // @Bean
    // public Employee e() {
    //     return new Employee(10);

    // }

    // @Bean
    // public Employee obj() {
    //      employee = new Employee();
    //     employee.setId(20);
    //     employee.setName("Arun");
    //     return employee;
    // }

    @Bean
    public Employee f(){
        employee= new Employee();
        employee.getMsg("-----Welcome All-----");
        return employee;
       
    }



    void show(){  
        //  System.out.println(e().getId()+" "+e().getName());  
        // System.out.println(obj().getId()+" "+obj().getName());
    }  

   
    
}
