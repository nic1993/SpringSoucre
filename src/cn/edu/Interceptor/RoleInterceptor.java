package cn.edu.Interceptor;

public class RoleInterceptor implements Interceptor{

	@Override
	public void before(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("��ʼ");
	}

	@Override
	public void after(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void afterReturning(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("һ������");
	}

	@Override
	public void afterThrowing(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("�쳣");
	}

}
