import Dao.CustomerDao;
import Domain.Customer;
import Mybatis.Mapper.CustomerMapper;
import Service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring整合Mybatis {
    @Test
    public void selectCustomerById(){
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_mybatis-config.xml");
        //通过容器获取Bean实例
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customerDao.selectCustomerById(1);
        System.out.println(customer);
    }
    @Test
    public void addCustomer(){
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_mybatis-config.xml");
        //通过容器获取Bean实例
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        Customer customer = new Customer();
        customer.setUserName("Zhangsan");
        customer.setPasswd("77777");
        customer.setJobs("1");
        customer.setPhone("1");
        customerService.addCustomer(customer);
    }
}
