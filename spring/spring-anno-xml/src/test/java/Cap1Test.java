import com.enjoy.cap1.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap1Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
		
		
		String[] names = app.getBeanDefinitionNames();
		
		for(String name:names){
			System.out.println(name);
		}
	}
}
