import com.study.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在Spring中管理了，我们要使用的时候  可以直接去里面取出来
//        Hello hello = (Hello) context.getBean("hello");
//        System.out.println(hello.toString());

        // 该方式不用强制类型转换
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello.toString());
    }
}
