package com.flux.testable;

import reactor.core.publisher.Flux;

public class FluxEmitter {
   public static Flux<String> sendNames(){
	   return Flux.just("Raja","Rahul","Kiran");
   }
}
