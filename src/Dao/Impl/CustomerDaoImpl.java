package Dao.Impl;
import Dao.CustomerDao;
import Domain.Customer;
import Mybatis.Mapper.CustomerMapper;
import Service.CustomerService;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    private CustomerService customerService;
//    private CustomerMapper customerMapper;
    public Customer selectCustomerById(Integer ID){
        return this.getSqlSession().selectOne("Mybatis.Mapper"+".CustomerMapper.selectCustomerById",1);
    }
}
