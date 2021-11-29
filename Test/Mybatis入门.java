import Domain.Customer;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatis入门 {
    public static void main(String[] args) throws Exception{
        //加载配置文件。
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //构建SqlSessionFactory。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建Sqlsession。
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //Select
        Customer customer_select = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);
        System.out.println(customer_select.toString());
        //Find
        List<Customer> customers_find = sqlSession.selectList("Mybatis.Mapper"+".CustomerMapper.findCustomerByName","J");
        for(Customer customerone:customers_find)
            System.out.println(customerone.toString());
        //Insert
        Customer customer_add = new Customer();
        customer_add.setUserName("Roy");
        customer_add.setPasswd("111111");
        customer_add.setJobs("1");
        customer_add.setPhone("1");
        int rows = sqlSession.insert("Mybatis.Mapper"+".CustomerMapper.addCustomer",customer_add);
        System.out.println(rows);
        customers_find = sqlSession.selectList("Mybatis.Mapper"+".CustomerMapper.findCustomerByName","Roy");
        for(Customer customerone:customers_find)
            System.out.println(customerone.toString());
        //Update
        Customer customer_update = new Customer();
        customer_update.setId(8);
        customer_update.setUserName("Roy");
        customer_update.setPasswd("111111");
        customer_update.setJobs("2");
        customer_update.setPhone("2");
        rows = sqlSession.update("Mybatis.Mapper"+".CustomerMapper.updateCustomer",customer_update);
        System.out.println(rows);
        customers_find = sqlSession.selectList("Mybatis.Mapper"+".CustomerMapper.findCustomerByName","Roy");
        for(Customer customerone:customers_find)
            System.out.println(customerone.toString());
        //Delete
        rows = sqlSession.delete("Mybatis.Mapper"+".CustomerMapper.deleteCustomer",8);
        Customer customer_delete = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",8);
        if (customer_delete!=null)
            System.out.println(customer_delete.toString());
        else
            System.out.println("不存在");
        //提交SQL
        sqlSession.commit();
        //关闭Sqlsession。
        sqlSession.close();
    }
}
