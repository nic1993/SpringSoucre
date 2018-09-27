package cn.edu.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RoleAspect {

	@Before("execution(* cn.edu.serviceImy.RoleServiceImy.printRole(..))")
	public void before() {
		System.out.println("before....");
	}
	
	@After("execution(* cn.edu.serviceImy.RoleServiceImy.printRole(..))")
	public void after() {
		System.out.println("after....");
	}
	
	@AfterReturning("execution(* cn.edu.serviceImy.RoleServiceImy.printRole(..))")
	public void afterReturning() {
		System.out.println("afterReturning....");
	}
	
	@AfterThrowing("execution(* cn.edu.serviceImy.RoleServiceImy.printRole(..))")
	public void afterThrowing() {
		System.out.println("afterThrowing....");
	}
}
