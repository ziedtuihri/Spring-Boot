package tn.esprit.spring.boycott.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Aspect
@Slf4j
public class LoggingAspect {
    
    @AfterReturning("execution(* tn.esprit.spring.boycott.service.*.ajouter*(..))")
	public void logAfterExecution(JoinPoint joinPoint) {
		log.info("Bienvenue dans l’application Boycott : " + joinPoint.getSignature().getName());
	}

}
