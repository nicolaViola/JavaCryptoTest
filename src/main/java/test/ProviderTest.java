package test;

import java.security.Provider;
import java.security.Security;
import java.security.Provider.Service;
import java.util.Set;

public class ProviderTest {

	public static void main(String[] args) {

		Provider[] providers = Security.getProviders();
		for(Provider provider : providers) {
			System.out.println("---  " + provider.getName() + " " + provider.getVersion());
			
			Set<Service> services = provider.getServices();
			
			for(Service service : services) {
				System.out.println("* " + service.getAlgorithm());
			}
		}
		
	}

}
