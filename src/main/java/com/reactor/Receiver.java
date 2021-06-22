package com.reactor;

import reactor.core.publisher.Mono;

public class Receiver {
   public static void main(String n[]) {
	  Mono<String> mono=MonoProvider.getResult((int)Math.round(Math.random()*10000));
	   
	  mono.subscribe(
			      ConsumerHelper.onNext(),
			      ConsumerHelper.onError(),
			      ConsumerHelper.onCompletion()
			  );
	   //System.out.println(MonoProvider.getString());
	  /* Mono<String> mono = MonoProvider.getString();
	   mono.subscribe(x->{
		   System.out.println("Received and Processing "+x);
	   });*/
	   
	  
   }
}
