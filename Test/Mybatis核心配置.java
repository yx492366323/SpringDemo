import Domain.Customer;
import Domain.UserOne;
import Mybatis.Util.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.test.context.TestConstructor;

import java.io.InputStream;
import java.util.List;

public class Mybatis核心配置 {
    public static void main(String[] args) throws Exception{
        //创建Sqlsession。
        SqlSession sqlSession = MybatisUtils.getSession();
        //Select
        Customer customer_select = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);

        System.out.println(customer_select.toString());
        sqlSession.close();
    }
    @Test
    public void cacheOneTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer_select = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);
        System.out.println(customer_select);
        customer_select = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);
        System.out.println(customer_select);
        sqlSession.close();
    }
    @Test
    public void cacheTwoTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer_select = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);
        System.out.println(customer_select);
        sqlSession.commit();

        sqlSession = MybatisUtils.getSession();
        customer_select = sqlSession.selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);
        System.out.println(customer_select);
        sqlSession.close();
    }
    @Test
    public void resultMap(){
        SqlSession sqlSession = MybatisUtils.getSession();
        List<UserOne> users = sqlSession.selectList("Mybatis.Mapper"+".UserOneMapper.selectAllUsers");
        for(UserOne userone:users)
            System.out.println(userone);
        sqlSession.close();
    }
}
