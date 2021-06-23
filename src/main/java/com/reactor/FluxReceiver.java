package com.reactor;

import reactor.core.publisher.Flux;

public class FluxReceiver {
 public static void main(String n[]) {
	 Flux<String> flux=FluxProvider.getNames();
	 
	 flux.subscribe(
			   ConsumerHelper.onNext(),
			   ConsumerHelper.onError(),
			   ConsumerHelper.onCompletion()
			 );
	 
   }
}
