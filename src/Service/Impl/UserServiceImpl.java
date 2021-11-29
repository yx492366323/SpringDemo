package Service.Impl;

import Dao.Impl.UserDaoImpl;
import Dao.UserDao;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    //声明重写父类方法，或者实现接口类方法，没有也行。
    @Override
    public void addUser(){
        this.userDao.addUser();
        System.out.println("UserService.addUser()");
    }
    @Override
    public void delUser(){
        this.userDao.delUser();
        System.out.println("UserService.delUser()");
    }
    @Override
    public void saveUser(){
        this.userDao.saveUser();
        System.out.println("UserService.saveUser()");
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao=userDao;
    }
}
