package cn.edu.Interceptor;

public class RoleInterceptor implements Interceptor{

	@Override
	public void before(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("开始");
	}

	@Override
	public void after(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("结束");
	}

	@Override
	public void afterReturning(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("一切正常");
	}

	@Override
	public void afterThrowing(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("异常");
	}

}
