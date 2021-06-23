package com.reactor;

import reactor.core.publisher.Flux;

public class FluxProvider {
   public static Flux<String> getNames(){
	   return Flux.just("raj","Rahul","Kiran","Entity","Roger");
   }
	
}
