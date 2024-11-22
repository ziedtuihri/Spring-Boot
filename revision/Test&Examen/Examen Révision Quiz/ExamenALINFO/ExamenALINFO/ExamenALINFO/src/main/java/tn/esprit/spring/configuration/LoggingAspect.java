package tn.esprit.spring.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Component
@Aspect
@Slf4j
public class LoggingAspect {

	@Before("execution(* tn.esprit.spring.services.*.ajouter*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
		log.info("Debut methode : " + joinPoint.getSignature().getName() + " : ");
	}

}
