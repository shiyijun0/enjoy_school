import com.enjoy.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
		System.out.println(app);
		String[] names=app.getBeanDefinitionNames();
		for (String d:names){
			System.out.println("********"+d);
		}
		
		//TestService testService = app.getBean(TestService.class);
		//testService.println();
		//直接从容器中获取TestDao, 和使用Autowired注解来取比较
		//TestDao testDao = app.getBean(TestDao.class);
		//System.out.println(testDao);
		
		/*Moon moon = (Moon)app.getBean(Moon.class); 
		System.out.println(moon);
		
		

		Sun sun = (Sun)app.getBean(Sun.class); 
		System.out.println(sun.getMoon());*/
		app.close();
		
		
		
		
		
	}
}
