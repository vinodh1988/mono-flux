package com.reactor;

import reactor.core.publisher.Mono;

public class MonoProvider {
   public static Mono<String>  getString() {
	  
	   return Mono.just("Hello World");
   }
}
