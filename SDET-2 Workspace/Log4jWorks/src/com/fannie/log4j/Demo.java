package com.fannie.log4j;
import org.apache.log4j.*;
public class Demo {
//    static Logger log = Logger.getLogger(Demo.class.getName());
	
	
	static Logger log = Logger.getLogger(Demo.class);
	
    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Starting up...");  
        log.setLevel(Level.WARN);
        log.info("This message should not appear!");
        
        new Demo().sayHi();
        try {
            // Divide by zero.
            int x = 5;
            int y = 20 / (5 - x);
        } catch (Exception e) {
            log.error("Oops!", e);
        }
    }
    
    
    public void  sayHi(){
    	log.setLevel(Level.ALL);
    	log.info("THIS IS INFO MESSAGE");
    }
    
    
    
}
