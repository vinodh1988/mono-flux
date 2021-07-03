package com.flux.operators3;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxProvider {
   public static Flux<Integer> getElements(){
	   return Flux.just(1,23,24,2324,234,2323,23,223,23);
   }
   public static Mono<String> getItem(){
	   return Mono.just("India");
   }
   
   //Switch Functions Demo
   public static Flux<Integer> returnValues(){
	  return Flux.just(23,2351,34343,231,25341,23411,123,5461,3411);
   }
   
   public static Flux<Integer> alternateSource(){
	   return Flux.just(23,23478,434,3455,122,23,22);
   }
}
