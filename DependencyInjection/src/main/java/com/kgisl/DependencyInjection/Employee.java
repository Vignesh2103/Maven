package com.kgisl.DependencyInjection;

public class Employee {  
    private int id;  
    private String name;
    
    static {
        System.out.println("Employee");
    }
      
    public Employee() {System.out.println("def cons");}  
      
    public Employee(int id) {
       
        this.id = id;
        
    }  
      
    public Employee(String name) {  this.name = name;}  
      
    public Employee(int id, String name) {
        System.out.println("param");  
        this.id = id;  
        this.name = name;  
    }  
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show(){  
        System.out.println(id+" "+name);  
    } 
    
    public void  getMsg(String message) {
        System.out.println("Welcome All");
      
    }
      
    }  