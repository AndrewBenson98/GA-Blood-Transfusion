package Main;

import java.util.HashMap;
import java.util.Map;

public class Population {

	
	
	private Map<String,String[]> matchingBloodTypes;
	
	private void initializeMap()
	{
		matchingBloodTypes= new HashMap<String,String[]>();
		//Populates map
		String [] ABp = {"AB+","AB-","B+","B-","A+","A-","O+","O-"};//AB+
		matchingBloodTypes.put("AB+",ABp );	
		String [] ABn = {"AB-","B-","A-","O-"};//AB-
		matchingBloodTypes.put("AB-",ABn );	
		String [] Bp = {"B+","B-","O+","O-"};//B+
		matchingBloodTypes.put("B+",Bp );	
		String [] Bn = {"B-","O-"};//B-
		matchingBloodTypes.put("B-",Bn );	
		String [] Ap = {"A+","A-","O+","O-"};//A+
		matchingBloodTypes.put("A+",Ap );	
		String [] An = {"A-","O-"};//A-
		matchingBloodTypes.put("A-",An );	
		String [] Op = {"O+","O-"};//O+
		matchingBloodTypes.put("O+",Op );	
		String [] On = {"O-"};//O-
		matchingBloodTypes.put("O-",On );	
	}
	
}
