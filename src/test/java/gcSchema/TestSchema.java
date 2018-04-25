package gcSchema;
import gcSchema.dto.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSchema {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	        User user = (User) context.getBean("user1");
	        System.out.println(user.getName());
            System.out.println(user.getSex());
	        System.out.println(user.getAge());
	}
}
