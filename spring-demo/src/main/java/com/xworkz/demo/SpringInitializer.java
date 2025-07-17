package com.xworkz.demo;

import com.xworkz.business.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public SpringInitializer() {
        System.out.println("SpringInitializer Running");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses Running");

        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses Running");

        return new Class[]{Configuration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings Running");

        return new String[0];
    }
}
