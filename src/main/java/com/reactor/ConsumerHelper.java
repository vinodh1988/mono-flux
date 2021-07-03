package com.reactor;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerHelper {
   public static Consumer<String> onNext() {
	   return (x)->System.out.println("Processing "+x);
   }
   
   public static Consumer<Throwable> onError() {
	   return x->System.out.println(x.getMessage());
   }
   
   public static Runnable onCompletion() {
	   return ()->System.out.println("Process Completed");
   }
   
   public static Consumer<String> onNext2() {
	 
	   return (x)->System.out.println("Super Processing "+x);
   }
  
}
