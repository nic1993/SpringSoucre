package cn.edu;

import cn.edu.Interceptor.Interceptor;
import cn.edu.Interceptor.ProxyBeanFactory;
import cn.edu.Interceptor.RoleInterceptor;
import cn.edu.entity.Role;
import cn.edu.service.RoleService;
import cn.edu.serviceImy.RoleServiceImy;


public class GameMain {

	public static void main(String[] args) {
		RoleService roleService = new RoleServiceImy();
		Interceptor interceptor = new RoleInterceptor();
		RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);
		Role role = new Role(1L);
		proxy.printRole(role);
		role = null;
		proxy.printRole(role);
	}
}
