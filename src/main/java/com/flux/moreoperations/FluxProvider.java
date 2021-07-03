package com.flux.moreoperations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxProvider {
    public static Flux<Mono<Integer>> getMapProcess(){
    	return Flux.create(sink->{
    		Integer[] list= {1,2,3,45,345,45,45,45,234,23,2456,34,3456};
    	    for(Integer x:list)
    	    	sink.next(Mono.just(x));
    	    sink.complete();
    	});
    }
    
    public static Flux<Flux<Integer>> getMapProcess2(){
    	return Flux.create(sink->{
    		Integer[][] list= {{1,2,3,45},{345,45,45},{45,234,23},{2456,34,3456}};
    	    for(Integer[] x:list)
    	    	sink.next(Flux.fromArray(x));
    	    sink.complete();
    	});
    }
}
/*
  Flux<Person> ------> Map
  Flux<Flux<Person> --> Map -->Flux<Person> ?- not the right way
                        flatmap
      
*/