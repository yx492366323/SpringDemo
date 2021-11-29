package Dao.Impl;

import Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("userDao.addUser()");
    }

    @Override
    public void delUser() {
        System.out.println("userDao.delUser()");
    }

    @Override
    public void saveUser() {
        System.out.println("UserDao.saveUser()");
    }

}
