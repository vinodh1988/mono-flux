package com.flux.hotandcold;

import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxReceiver {
   public static void main(String n[]) throws Exception  {
	  Flux<String> flux = HotAndColdPublisher
			  .messageStreamer().delayElements(Duration.ofSeconds(1)).publish().refCount(3);
			  //.share();
	  
	  flux.subscribe(x->System.out.println("Subscriber 1 "+x));
Thread.sleep(2000);
	  
	  flux.subscribe(x->System.out.println("Subscriber 2 "+x));
Thread.sleep(2000);
	  


   
	  
	  flux.subscribe(x->System.out.println("Subscriber 3 "+x));
	  
	  Thread.sleep(300000);
   }
}
