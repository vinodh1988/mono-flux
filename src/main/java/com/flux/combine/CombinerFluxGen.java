package com.flux.combine;

import reactor.core.publisher.Flux;

public class CombinerFluxGen {
   public static Flux<Integer> genInteger(){
	   return Flux.just(1,2,3,4);
   }
   
   public static Flux<Integer> genSet2(){
	   return  Flux.just(111,222,333,444,555);
   }
   public static Flux<Integer> genSet3(){
	   return  Flux.just(1111,2222,3333,4444,5555,6666,7777,8888);
   }
}
