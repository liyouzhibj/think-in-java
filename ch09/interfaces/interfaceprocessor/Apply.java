package interfaces.interfaceprocessor;

import interfaces.interfaceprocessor.Processor;

public class Apply{
    public static void process(Processor p , Object o){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }    
}