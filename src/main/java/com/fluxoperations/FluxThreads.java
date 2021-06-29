package com.fluxoperations;

import com.reactor.ConsumerHelper;

import reactor.core.publisher.Flux;

public class FluxThreads {
   public static void main(String n[]) throws Exception {
	   TaskRunner t=new TaskRunner();
	   
	  Flux<String> flux= Flux.create(t);
	  
	  flux.subscribe(ConsumerHelper.onNext());
	  
	  Runnable logic=t::task;
	  Runnable logic2=t::task2;
	  for(int i=0;i<15;i++) {
		  new Thread(logic).start();
	  }
	  for(int i=0;i<5;i++) {
		  new Thread(logic2).start();
	  }
	  Thread.sleep(2000);
   }
}
