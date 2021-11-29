import Dao.Impl.UserDaoImpl;
import Dao.UserDao;
import Proxy.JDKProxy;

public class JdkProxy代理 {
    public static void main(String[] args) {
        //创建代理对象。
        JDKProxy jdkProxy = new JDKProxy();
        //创建目标对象。
        UserDao userDaotmp = new UserDaoImpl();
        //获取增强后的目标。
        UserDao userDao = (UserDao) jdkProxy.creatProxy(userDaotmp);

        userDao.addUser();
        userDao.delUser();
    }
}
