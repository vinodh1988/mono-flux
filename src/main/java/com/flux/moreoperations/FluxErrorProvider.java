package com.flux.moreoperations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Demo on error/exception handling
public class FluxErrorProvider {
    public static Flux<Mono<Integer>> getSeries(){
  
    	 return Flux.create(sink->{
    	  	 int count=0;
    		 while(true) {
    			 int x=(int)(100000+Math.round(Math.random()*100000));
    			 if(x%15==0 && ++count==3)
    				 break;
    			 sink.next(x%15==0?Mono.error(new Exception("15 Exception")):Mono.just(x));
    		 }
    		 sink.complete();
    	 });
    }
}
