package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ICustomerServiceImpl implements ICustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Anh", "anh@gmail.com", "Hanoi"));
        customers.put(2, new Customer(2, "John", "john@gmail.com", "US"));
        customers.put(3, new Customer(3, "Alex", "alex@gmail.com", "ID"));
        customers.put(4, new Customer(4, "Adam", "adam@gmail.com", "TH"));
        customers.put(5, new Customer(5, "Rose", "rose@gmail.com", "VN"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
