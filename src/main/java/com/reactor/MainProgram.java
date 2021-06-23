package com.reactor;

import reactor.core.publisher.Mono;

public class MainProgram {
    public static void main(String n[]) {
    	
    	Thread t=new Thread(()->{
    		  int i=3;
    	      while(i<=50) {
    	    	  try
    	    	  {
    	    		  backactivity(i);
    	    		  Thread.sleep(1000);
    	    		  i+=3;
    	          }
    	          catch(Exception e) {
    	        	  e.printStackTrace();
    	          }
    	      }
    	
    	});
    	
    	t.start();
    	Mono<String> mono1=MonoProvider.delayed();
    	Mono<String> mono2=MonoProvider.getResult((int)Math.round(Math.random()*10000));
    	Mono<String> mono3=MonoProvider.callThis();
    	 mono1.subscribe(
			      ConsumerHelper.onNext(),
			      ConsumerHelper.onError(),
			      ConsumerHelper.onCompletion()
			  );
    	 mono2.subscribe(
			      ConsumerHelper.onNext(),
			      ConsumerHelper.onError(),
			      ConsumerHelper.onCompletion()
			  );
    	 mono3.subscribe(
			      ConsumerHelper.onNext(),
			      ConsumerHelper.onError(),
			      ConsumerHelper.onCompletion()
			  );
    }
    
    public static void backactivity(int a) {
    	System.out.println("Activity is running ->"+a);
    }
}

