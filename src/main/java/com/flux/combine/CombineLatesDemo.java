package com.flux.combine;

import java.time.Duration;

import reactor.core.publisher.Flux;

public class CombineLatesDemo {
   public static Flux<String> getElements(){
	   return Flux.just("Ram","Rajesh","Rahul","Ravi","Rakesh","Roger","Garry")
			   .delayElements(Duration.ofSeconds(1));
   }
   
   public static Flux<Integer> getElements2(){
	   return Flux.just(1,2,3,4,5,6,4,34)
			   .delayElements(Duration.ofSeconds(2));
   }
}
