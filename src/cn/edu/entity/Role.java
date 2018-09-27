package cn.edu.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("role")
public class Role {

	
	@Value("1")
	private Long id;
	
	public Role(Long id) {
		
		this.id = id;
	}
    
	public Role() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
