import com.enjoy.cap2.config.Cap2MainConfig;
import com.enjoy.cap2.controller.OrderController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap2Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
		
		
		String[] names = app.getBeanDefinitionNames();
		
		for(String name:names){
			System.out.println(name);
		}
		OrderController controller=(OrderController)app.getBean("orderController");
		System.out.println(controller.i);
	}
}
