package com.fluxoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;

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
}
