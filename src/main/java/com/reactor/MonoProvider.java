package com.reactor;

import reactor.core.publisher.Mono;

public class MonoProvider {
   public static Mono<String>  getString() {
	  
	   return Mono.just("Hello World");
   }
   
   public static Mono<String> getResult(int source){
	   if(source%2==0)
	   {
		   return Mono.just("Processed "+source);
	   }
	   else if(source%3==0) {
		   return Mono.empty();
	   }
	   else {
		   return Mono.error(new Exception("Things are not going good"));
	   }
   }
   
  public static Mono<String> delayed(){
	  
	  Mono<String> mono= Mono.defer(
			  ()->{
	              try
	                {
		             
	                  Thread.sleep(3000);
	                  return Mono.just("Processed information and this runs late");
	                }
	              catch(InterruptedException e) {
	            	  return Mono.error(e);
	              }
			  });
	  return mono;
  }
  
  public static Mono<String> callThis(){
	   Mono<String> mono = Mono.create(
			     x -> {
			    	 System.out.println("Running async logic");
			    	 x.success("DONE ---> This is the processed information");
			     }
			   );
	   
	   return mono;
  }
}
