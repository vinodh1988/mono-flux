package com.fluxoperations;

import com.reactor.ConsumerHelper;

import reactor.core.publisher.Flux;

public class FluxOperations {
     
	public static void main(String n[]) { 
		Flux.range(0,10)
		.doOnNext(x->{System.out.println("Intercepted and processing"+x);})
		.map(x-> Math.round(Math.random()*10000))
		.filter(x->x%2==0)
		.doOnNext(x->{System.out.println("Second Interceptor"+x);})
		.doOnComplete(()->{System.out.println("Process Wrapped");})
		.subscribe(System.out::println);
		
	};
}
