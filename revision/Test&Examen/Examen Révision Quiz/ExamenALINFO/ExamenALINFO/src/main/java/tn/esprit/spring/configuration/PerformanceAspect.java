package tn.esprit.spring.configuration;/*

package tn.esprit.spring.kaddem.configuration;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Component
@Aspect
@Slf4j
public class PerformanceAspect {

	@Around("execution(* tn.esprit.spring.kaddem.services.*.*(..))")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis(); 
		Object obj = pjp.proceed(); 
		long elapsedTime = System.currentTimeMillis() - start;
		log.info("Method execution time: " + elapsedTime + " milliseconds.");
		return obj; 
	}

}


*/
