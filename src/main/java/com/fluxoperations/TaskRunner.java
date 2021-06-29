package com.fluxoperations;

import java.util.function.Consumer;

import reactor.core.publisher.FluxSink;

public class TaskRunner implements Consumer<FluxSink>{
FluxSink<String> sink;
	@Override
	public void accept(FluxSink t) {
		// TODO Auto-generated method stub
		sink=t;
	}
   
	public void task() {
    sink.next(Thread.currentThread().getName()+"  and message is "+Math.round(Math.random()*10000)); 
	}
	
	public void task2() {
	 sink.next("Hey hello!!!"+Thread.currentThread().getName());	
	}
}
