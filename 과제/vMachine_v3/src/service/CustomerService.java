package service;

import dto.CustomerDto;
import repository.CustomerRepository;

public class CustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    public int insertuserdata(CustomerDto dto) {
        return customerRepository.insertuserdata(dto);
    }

    public int logindata(CustomerDto dto) {
        return customerRepository
    }

}
