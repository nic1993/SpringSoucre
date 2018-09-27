package cn.edu.serviceImy;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.entity.Role;
import cn.edu.service.RoleDataSourceService;


@Component(value="roleDataSourceServiceImy")
public class RoleDataSourceServiceImy implements RoleDataSourceService{
 
	@Autowired
	DataSource datasource; 
	@Override
	public Role getRole(Long id) {
		// TODO Auto-generated method stub
		System.out.println(datasource);
		return null;
	}

}
