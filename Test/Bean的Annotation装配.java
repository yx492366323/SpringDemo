import Controller.UserController;
import Domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean的Annotation装配 {
    public static void main(String[] args) {
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-Annotation.xml");
        //通过容器获取Controller实例
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.saveUser();
    }
}
