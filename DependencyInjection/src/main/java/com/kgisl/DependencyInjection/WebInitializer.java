package com.kgisl.DependencyInjection;

import org.springframework.web
    .servlet.support
    .AbstractAnnotationConfigDispatcherServletInitializer;
public class WebInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        // TODO Auto-generated method stub
        System.out.println("Root");
        return null;
    }
    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        // TODO Auto-generated method stub
        System.out.println("config");
        return new Class[] { MVCconfig.class };
    }
    @Override
    protected String[] getServletMappings()
    {
        // TODO Auto-generated method stub
        System.out.println("map");
        return new String[] { "/" };
    }
}
