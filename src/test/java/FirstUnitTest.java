import org.junit.jupiter.api.Test;

import com.flux.testable.FluxEmitter;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FirstUnitTest {
   @Test
   public void mytest() {
	   Flux<String> stringflux=FluxEmitter.sendNames();
	   StepVerifier.create(stringflux)
	   .expectNext("Raja")
	   .expectNext("Rahul")
	   .expectNext("Kiran")
	   .verifyComplete();
   }
   
   @Test
   public void mytest2() {
	   Flux<String> stringflux=FluxEmitter.sendNames();
	   StepVerifier.create(stringflux)
	   .expectNextCount(1)
	   .verifyComplete();
   }
}
