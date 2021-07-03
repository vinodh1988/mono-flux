package com.flux.operators3;

public class MainPro {
   public static void main(String n[]) {
	   String test = FluxProvider.getItem().block();
	   int received =FluxProvider.getElements().log().blockFirst();
	   int last=FluxProvider.getElements().doOnNext(System.out::println).blockLast();
	   System.out.println(test +" is the value received");
	   System.out.println(last+" and first is"+received);
   }
}
