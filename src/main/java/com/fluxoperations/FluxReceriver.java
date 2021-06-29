package com.fluxoperations;

import com.reactor.ConsumerHelper;

public class FluxReceriver {
   public static void main(String n[]) {
	  /* FluxProvider.getFlux().subscribe(ConsumerHelper.onNext(),
			   ConsumerHelper.onError(),
			   ConsumerHelper.onCompletion());
	   
	   FluxProvider.getFlux().map(x->"length of the string is "+x.length())
	   .subscribe(ConsumerHelper.onNext(),
			   ConsumerHelper.onError(),
			   ConsumerHelper.onCompletion());*/
	   
	   FluxProvider.getFluxElements()
	       .log()
	       .map(x->x.toUpperCase())
	       .log()
	       .filter(x->x.length()>5)
	       .log()
	       .doOnNext(x->System.out.println("I am carrying out my own task "+x))
	       .subscribe(
			     ConsumerHelper.onNext(),
			     ConsumerHelper.onError(),
			     ConsumerHelper.onCompletion()
			     
			   );
	   
   }
}
