import Dao.Impl.UserDaoImpl;
import Dao.UserDao;
import Proxy.CGLIBProxy;
import Proxy.JDKProxy;

public class CGLIBProxy代理 {
    public static void main(String[] args) {
        //创建代理对象。
        CGLIBProxy cglibProxy = new CGLIBProxy();
        //创建目标对象。
        UserDao userDaotmp = new UserDaoImpl();
        //获取增强后的目标。
        UserDao userDao = (UserDao) cglibProxy.creatProxy(userDaotmp);

        userDao.addUser();
        userDao.delUser();
    }
}
