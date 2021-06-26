package com.fluxoperations;

import com.reactor.ConsumerHelper;

public class FluxReceriver {
   public static void main(String n[]) {
	   FluxProvider.getFlux().subscribe(ConsumerHelper.onNext(),
			   ConsumerHelper.onError(),
			   ConsumerHelper.onCompletion());
	   
	   FluxProvider.getFlux().map(x->"length of the string is "+x.length())
	   .subscribe(ConsumerHelper.onNext(),
			   ConsumerHelper.onError(),
			   ConsumerHelper.onCompletion());
   }
}
