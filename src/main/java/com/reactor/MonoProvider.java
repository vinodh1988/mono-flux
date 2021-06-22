package com.reactor;

import reactor.core.publisher.Mono;

public class MonoProvider {
   public static Mono<String>  getString() {
	  
	   return Mono.just("Hello World");
   }
   
   public static Mono<String> getResult(int source){
	   if(source%2==0)
	   {
		   return Mono.just("Processed "+source);
	   }
	   else if(source%3==0) {
		   return Mono.empty();
	   }
	   else {
		   return Mono.error(new Exception("Things are not going good"));
	   }
   }
}
