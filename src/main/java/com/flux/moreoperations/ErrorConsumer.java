package com.flux.moreoperations;

import com.reactor.ConsumerHelper;

import reactor.core.publisher.Mono;

public class ErrorConsumer {
    public static void main(String n[]) {
    	FluxErrorProvider.getSeries().flatMap(x->x)
    	    //  .onErrorReturn(-999999)
    	   //   .onErrorResume(e->Mono.just(-23794))
    	      .onErrorContinue((err,obj)->{
    	    	  System.out.println(err.getMessage());
    	    	  System.out.println("Running some alternate logic");
    	      })
    	      .map(x->String.valueOf(x))
    	      .subscribe(
    			   ConsumerHelper.onNext(),
    			   ConsumerHelper.onError(),
    			   ConsumerHelper.onCompletion()
    			);
    }
}
