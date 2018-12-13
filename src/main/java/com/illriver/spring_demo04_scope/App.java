package com.illriver.spring_demo04_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    public static void main( String[] args ) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
    	DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
    	DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
    	
    	DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
    	DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
    	
    	System.out.println("s1是否与s2相同"+s1.equals(s2));
    	System.out.println("p1是否与p2相同"+p1.equals(p2));
    	
    	context.close();
    }
}
