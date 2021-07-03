package com.flux.operators3;

public class SwitchDemo {
   public static void main(String[] args) {
	     FluxProvider.returnValues()
	     .filter(x->x%2==0)
	     .switchIfEmpty(FluxProvider.alternateSource())
	     .filter(x->x%2==0)
	     .subscribe(x->System.out.println("Received"+x));
    }
}
