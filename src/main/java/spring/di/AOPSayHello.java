package spring.di;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPSayHello {
	@After("execution(** spring.di.SgtPeppers.play(..))")
	public void sayHello(){
		System.out.println("==============>hello!");
	}
}
