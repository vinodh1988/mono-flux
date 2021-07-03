package com.flux.combine;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple3;

public class MainProgram 
{
	  public static void main(String n[]) throws InterruptedException {
		  Flux<Integer> f1=CombinerFluxGen.genInteger().delayElements(Duration.ofMillis(400));
		  Flux<Integer> f2=CombinerFluxGen.genSet2().delayElements(Duration.ofMillis(800));
		  Flux<Integer> f3=CombinerFluxGen.genSet3().delayElements(Duration.ofMillis(600));
		  //Flux<Integer> flux3 = Flux.concat(f1,f2);
		  //Flux<Integer> flux3 = Flux.merge(f1,f2,f3);
		  Flux<Tuple3<Integer,Integer,Integer>> flux3 = Flux.zip(f1,f2,f3);
		  flux3.subscribe(x->System.out.println("Subscribed "+x));
		  Thread.sleep(100000);
		  
	  }
}