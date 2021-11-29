import Domain.Order;
import Domain.Person;
import Domain.UserTwo;
import Mybatis.Util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mybatis映射 {
    @Test
    public void OnetoOneTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Person person_select = sqlSession.selectOne("Mybatis.Mapper"+".PersonMapper.selectPersonById",1);
        System.out.println(person_select);
        sqlSession.close();
    }
    @Test
    public void OnetoNTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserTwo user = sqlSession.selectOne("Mybatis.Mapper"+".UserTwoMapper.findOrdersByUserId",1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void NtoNTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Order order = sqlSession.selectOne("Mybatis.Mapper"+".OrderMapper.findOrdersWithProduct",1);
        System.out.println(order);
        sqlSession.close();
    }
}
