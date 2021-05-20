
package com.ocp.day15;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class LanbdaDemo {
    public static void main(String[] args) {
        Integer [] radius = {5,-10,15};
        Supplier<Double> supplier = ()->Math.PI;
        
        Stream.of(radius).filter(t -> t>0)//predicate
                                   .mapToDouble(x -> Math.pow(x, 2)*supplier.get())//Function 
                                    .forEach(t ->System.out.printf("%.2f\n",t ));
                
    }
    
}
