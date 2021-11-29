package Service.Impl;

import Domain.Customer;
import Mybatis.Mapper.CustomerMapper;
import Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    public void addCustomer(Customer customer){
        this.customerMapper.addCustomer(customer);
        //模拟故障
        int i = 1/0;
    }
}
