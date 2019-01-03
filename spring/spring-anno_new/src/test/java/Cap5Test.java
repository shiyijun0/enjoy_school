import com.enjoy.cap5.config.Cap5MainConfig;
import com.enjoy.cap5.config.Teacher;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap5Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
		
		System.out.println("IOC容器创建完成........");

		String name[] =app.getBeanDefinitionNames();

		for (String b:name){
			System.out.print(b+"\t\t");
		}
		System.out.println();
		Teacher student=(Teacher) app.getBean("teacher");
		/*Teacher student1=(Teacher) app.getBean("teacher1");
		System.out.println(student==student1);*/
		System.out.println(student.getAge()+student.getName());
		System.out.println(student.hashCode());
		//System.out.println(student.);
		Class cl=student.getClass();
		//student.people.setName("放电饭锅");
		System.out.println(student.people1.getAge()+"&&&&&&&&&&&&&&&&&&&&&&&&&&"+student.people1.getName());
		/*try {
			*//*Constructor<Student> con=	cl.getDeclaredConstructor(People.class);
			con.setAccessible(true);*//*
			Field field=cl.getDeclaredField("name");
			field.setAccessible(true);
			field.set(student,"食发的");
			System.out.println(student.getName()+"*****67898************");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
//student.setApplicationContext(app);
		System.out.println(student.string()+"&&&&&&&&&&&&&&");
		System.out.println(student.getBeanName());
//student.getApplicationContext();
		app.close();
	}
}
