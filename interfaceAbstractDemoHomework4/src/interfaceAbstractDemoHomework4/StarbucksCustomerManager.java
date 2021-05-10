package interfaceAbstractDemoHomework4;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override

	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db" + customer.getFirstName() + customer.getFirstName());

		} else {

			System.out.println("Not a valid person");
		}
	}

}
