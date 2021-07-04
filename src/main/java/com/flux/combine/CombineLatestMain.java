package com.flux.combine;

import reactor.core.publisher.Flux;

public class CombineLatestMain {
   public static void main(String n[]) throws InterruptedException {
	   Flux<String> x=CombineLatesDemo.getElements();
	   Flux<Integer> y=CombineLatesDemo.getElements2();
	   Flux<String> z=Flux.combineLatest(x, y,(a,b)->"Processed"+a+b );
	   z.subscribe(System.out::println);
	   Thread.sleep(20000);
   }
}
