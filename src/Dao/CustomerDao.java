package Dao;

import Domain.Customer;

public interface CustomerDao {
    public Customer selectCustomerById(Integer ID);
}
