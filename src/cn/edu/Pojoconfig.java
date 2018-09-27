package cn.edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages= {"cn.edu","cn.edu.service","cn.edu.serviceImy"})
@ImportResource({"classpath:application.xml"})
public class Pojoconfig {

}
