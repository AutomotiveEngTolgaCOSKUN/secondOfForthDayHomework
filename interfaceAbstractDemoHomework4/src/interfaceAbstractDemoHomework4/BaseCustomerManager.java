package interfaceAbstractDemoHomework4;

public class BaseCustomerManager implements CustomerService {
	@Override
	public void save(Customer customer) {

		System.out.println("Saved to db : " + customer.getFirstName() + " " + customer.getLastName());

	}

}
