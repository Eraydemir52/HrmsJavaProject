package kodlamaio.hrmsProject.adapter.personValidator;




import kodlamaio.hrmsProject.entities.concretes.JobHunter;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class RealPersonCheckAdapter implements CheckPersonService{

	
	@Override
	public boolean checkPerson(JobHunter jobhunter) {
		
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result = false;
		try {
			
			result=proxy.TCKimlikNoDogrula(Long.parseLong(jobhunter.getNationalIdentity()),jobhunter.getFirstName().toUpperCase(),
					jobhunter.getLastName().toUpperCase(),jobhunter.getBirthDate().getYear());
			
		} catch (Exception e) {
			
			System.out.println("Üye billgileri hatalı.");
			
		}
		
		
		
		return result;
	}

}
