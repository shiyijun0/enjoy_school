package com.enjoy.cap5.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@PropertySource(value = "classpath:/st.properties")
//@ImportResource(value = "classpath:st.properties")
@Import(Student.class)
@ComponentScan
public class Cap5MainConfig {
	@Bean("person")
	public Person person(){
		System.out.println("给容器中添加person.......");
		return new Person("person",20);
	}
	
	@Conditional(WinCondition.class)
	@Bean("lison")
	public Person lison(){
		System.out.println("给容器中添加lison.......");
		return new Person("Lison",58);
	}
	@Conditional(LinCondition.class)
	@Bean("james")//bean在容器中的ID为james, IOC容器MAP,  map.put("id",value)
	public Person james(){
		System.out.println("给容器中添加james.......");
		return new Person("james",20);
	}

	@Conditional(Window.class)
	@Bean
	public Person lison1(){
		System.out.println("给容器中添加lison1.......");
		return new Person("Lison1",58);
	}
	@Conditional(linux.class)
	@Bean//bean在容器中的ID为james, IOC容器MAP,  map.put("id",value)
	public Person james1(){
		System.out.println("给容器中添加james1.......");
		return new Person("james1",20);
	}

	/*@Bean(initMethod = "init",destroyMethod = "destroy")
	public Teacher teacher1(){
		return new Teacher();
	}*/
     @Bean
	public People people(){
	System.out.println("普通人*************");
	return new People("东风风光",34);
}
	@Bean
	public People people1(){
		System.out.println("普通人*************");
		return new People();
	}
}
