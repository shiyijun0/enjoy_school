import com.enjoy.cap6.bean.Monkey;
import com.enjoy.cap6.config.Cap6MainConfig;
import com.enjoy.cap6.config.JamesFactoryBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {
	@Test
	public void test01() throws Exception{
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
		
		System.out.println("IOC容器创建完成........");
		
		
		Object bean1 = app.getBean("jamesFactoryBean");
		Object bean2 = app.getBean("jamesFactoryBean");//取Money
		System.out.println("bean的类型="+bean1.getClass());
		System.out.println(bean1 == bean2);
		
		

		Object bean3 = app.getBean("&jamesFactoryBean");//取jamesFactoryBean
		Monkey monkey=(Monkey)bean1;
		JamesFactoryBean jamesFactoryBean=(JamesFactoryBean) bean3;
		System.out.println(monkey.getName());
		System.out.println(jamesFactoryBean.getObject().getName());
		
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for(String name:beanDefinitionNames){
			System.out.println(name);
		}
		
		
		
		
		
	}
}
