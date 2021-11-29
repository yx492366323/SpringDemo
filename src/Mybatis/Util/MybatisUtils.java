package Mybatis.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            //加载配置文件。
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //构建SqlSessionFactory。
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return  sqlSessionFactory.openSession();
    }
}
