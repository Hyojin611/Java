package dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerDto {
    private String cusId;
    private String password;
    private String name;
    private String phoneNumber;
    private int balance;


    public CustomerDto(){}

    public CustomerDto(String cusId, String password, String name, String phoneNumber, int balance) {
        this.cusId = cusId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public CustomerDto(String user1, String 홍길동, int i) {
    }

    public class CustomerRepository {
        private List<CustomerDto> customers;

        public CustomerRepository() {
            customers = new ArrayList<>();
            // 초기 회원들 추가 (예시)
            customers.add(new CustomerDto("user1", "홍길동", 1000));
            customers.add(new CustomerDto("user2", "김철수", 2000));
        }

        // 회원 추가
        public boolean addCustomer(CustomerDto customer) {
            return customers.add(customer);
        }

        // 모든 회원 조회
        public List<CustomerDto> getAllCustomers() {
            return customers;
        }
    }


    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "cusId='" + cusId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
