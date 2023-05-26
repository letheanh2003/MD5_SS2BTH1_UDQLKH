package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.dao.ICustomerDao;
import rikkei.academy.model.Customer;

import java.util.List;
@Service
public class CustomerServiceIMPL implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerDao.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerDao.remove(id);
    }
}
