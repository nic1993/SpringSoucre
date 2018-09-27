package cn.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.entity.Role;
import cn.edu.service.RoleService;
import cn.edu.serviceImy.RoleDataSourceServiceImy;
import cn.edu.serviceImy.RoleServiceImy;
import cn.edu.serviceImy.Test;



public class AnnotationMain {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(Pojoconfig.class);
//		RoleService role = context.getBean(RoleService.class);

		ApplicationContext context2 = new ClassPathXmlApplicationContext("application.xml");
		RoleService  roleServiceImy = (RoleService) context2.getBean("roleServiceImy");
		Role role = (Role) context2.getBean("role");
	    roleServiceImy.printRole(role);
//		System.out.println(role);
	}
}
