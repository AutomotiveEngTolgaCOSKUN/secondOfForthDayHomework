package interfaceAbstractDemoHomework4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.getDateOfBirth());
		} catch (RemoteException e) {
			return false;
		}
	}

}
