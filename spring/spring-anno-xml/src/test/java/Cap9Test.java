import com.enjoy.cap9.bean.Moon;
import com.enjoy.cap9.bean.Sun;
import com.enjoy.cap9.config.Cap9MainConfig;
import com.enjoy.cap9.dao.TestDao;
import com.enjoy.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
		System.out.println(app);
		System.out.println("&&&&&&&&&&&&&&&&");
		TestService testService = app.getBean(TestService.class);
		testService.println();
		//直接从容器中获取TestDao, 和使用Autowired注解来取比较
		/*TestDao testDao = app.getBean(TestDao.class);
		System.out.println(testDao);*/
		System.out.println();
		TestDao testDao2=(TestDao) app.getBean("testDao2");
		System.out.println(testDao2);
		TestDao testDao1=(TestDao) app.getBean("testDao");
		System.out.println();
		System.out.println(testDao1);
		System.out.println(testDao2==testDao1);

		System.out.println("************");
		
		Moon moon = (Moon)app.getBean(Moon.class);
		System.out.println(moon);

		System.out.println("**********111***************************");

		Sun sun = (Sun)app.getBean(Sun.class);
		System.out.println(sun.getMoon());
		app.close();
		
		
		
		
		
	}
}
