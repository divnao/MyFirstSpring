import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import springdemo.WelcomeService;


/**
 *  feature: just for test git function is available or not.
 */
public class Main {

    public static void main(String[] args) {

        // first spring demo
        Resource r = new FileSystemResource("hello.xml");
        BeanFactory f = new XmlBeanFactory(r);
        Person p = (Person) f.getBean("p"); // the 'p' configurated in 'hello.xml', the value of property `id`
        String say = p.sayHello();
        System.out.print(say);

        // second spring demo
        ApplicationContext ac = new ClassPathXmlApplicationContext("sec.xml");
        WelcomeService ws = (WelcomeService) ac.getBean("ws");
        System.out.println(ws.getMes());

        System.out.println("hello huh!");
    }

}
