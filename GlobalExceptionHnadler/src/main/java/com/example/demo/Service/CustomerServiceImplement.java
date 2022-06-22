package com.example.demo.Service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Exception.CustomernotfoundException;
import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepository;
@Service
public class CustomerServiceImplement implements CustomerService {

	@Autowired

	private CustomerRepository customerrepository;


	public  Customer save(Customer customer)  {
		return customerrepository.save(customer);
	}

	public Customer getCustomer(int cusid) {

		return customerrepository.findById(cusid).orElseThrow(
				()
				-> new CustomernotfoundException(
						"NO CUSTOMER PRESENT WITH ID = " + cusid));

	}

}



