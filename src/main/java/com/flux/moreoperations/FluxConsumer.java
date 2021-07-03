package com.flux.moreoperations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxConsumer {
   public static void main(String n[]) {
	   
	  //map and flat map difference
	  Flux<Flux<Integer>> flux= FluxProvider.getMapProcess2();
	  
	  flux
	  .map(x->x)
	  .subscribe(System.out::println);
	  
	  flux
	  .flatMap(x->x)
	  .subscribe(System.out::println);
   }
}
