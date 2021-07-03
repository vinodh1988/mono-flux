package com.flux.hotandcold;

import com.github.javafaker.Faker;

import reactor.core.publisher.Flux;

public class HotAndColdPublisher {
   public static  Flux<String> messageStreamer(){
	   Faker faker=new Faker();
 return  Flux.create(sink->{
		   try
		   {
			  int i=0;
			  while(true) {
		    
		      sink.next(faker.name().firstName());
		      //sink.next(String.valueOf(i)); 
		      if(++i==10) break;
			  } 		      
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
	   });
	   
	   //return Flux.just(1,2,3,4,5,6,7,8,9).delayElements(Duration.ofSeconds(1)).share();
	   
   }
}
