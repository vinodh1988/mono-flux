package com.reactor;

import reactor.core.publisher.Mono;

public class Receiver {
   public static void main(String n[]) {
	   //System.out.println(MonoProvider.getString());
	   Mono<String> mono = MonoProvider.getString();
	   mono.subscribe(x->{
		   System.out.println("Received and Processing "+x);
	   });
	   
	  
   }
}
