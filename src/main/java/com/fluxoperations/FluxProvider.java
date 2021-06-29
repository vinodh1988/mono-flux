package com.fluxoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

public class FluxProvider {
    public static Flux<String> getFlux(){
    	
   
    return	Flux.create((fluxSink)->{
    		try {
				BufferedReader br=Files.newBufferedReader(Paths.get("e:/result.txt"));
				Stream<String> lines=br.lines();
				lines.forEach(x->fluxSink.next(x));
				fluxSink.complete();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Flux.error(e);
			}
    	});
    }
    
    
    public static Flux<String> getFluxElements(){
    	List<String> list=new ArrayList<String>();
    	list.add("India");
    	list.add("Nicholas");
    	list.add("haarissson");
    	list.add("Christopher");
    	list.add("jay");
    	return Flux.fromIterable(list).doOnNext(
    			x->System.out.println("As an Emitter i did my job i am giving"+x
    			));
    }
}
