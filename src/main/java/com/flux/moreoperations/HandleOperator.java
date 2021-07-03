package com.flux.moreoperations;

import java.util.function.Consumer;

import com.reactor.ConsumerHelper;

import reactor.core.publisher.Flux;

public class HandleOperator {
   public static void main(String n[]) {
	   //filter + map
	   Flux.range(10, 100)
	            .handle((x,sink)->{
	            	if(x%5==0 || x%7==0 || x%11==0);
	            		
	            	else
	            		sink.next(10000+x);
	            })
	            . map(x->String.valueOf(x)).subscribe(
			     ConsumerHelper.onNext(),
			     ConsumerHelper.onError(),
			     ConsumerHelper.onCompletion()
			   );
	  
   }
}
