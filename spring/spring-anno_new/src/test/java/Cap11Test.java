import com.enjoy.cap11.config.Cap11MainConfig;
import com.enjoy.cap11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//InternalAutoProxyCreator
public class Cap11Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap11MainConfig.class);

		OrderService bean = app.getBean(OrderService.class);
		bean.addOrder();
		
		app.close();
	
		
	}
}
