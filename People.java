package Main;

import java.util.ArrayList;
import java.util.Map;

public class People {

	private ArrayList<String> bloodTypes;
	private String[] assignedBlood;
	private ArrayList<String> availableBlood;
	private int fitness;
	private Map<String,String[]> matchingBloodTypes;
	
	
	public People(ArrayList<String> bloodTypes, ArrayList<String> availableBlood, Map<String,String[]> matchingBloodTypes) {
		this.bloodTypes = bloodTypes;
		this.availableBlood=availableBlood;
		this.matchingBloodTypes=matchingBloodTypes;
		assignedBlood = new String [bloodTypes.size()];
//		initializeMap();
		initialize();
	}

	/**
	 * Assigns every person a possible blood type
	 * @param availableBlood
	 */
	private void initialize() {
		for (int i = 0; i < bloodTypes.size(); i++) {
			assign(bloodTypes.get(i),i);
		}
	}

	private void calculateFitness() {
		int count=0;
		for(int i =0;i<assignedBlood.length;i++)
		{
		
		}
	}

	/*
	 * Randomly assigns a blood type given the blood type and index to assign it
	 * at
	 */
	private void assign(String bloodtype,int index) {
		bloodtype=bloodtype.trim();
		
		switch(bloodtype)
		{
		case "AB+":		String [] temp =matchingBloodTypes.get("AB+");
						String type =temp[(int)Math.random()*temp.length];
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "AB-":  	temp =matchingBloodTypes.get("AB-");
						type =temp[(int)Math.random()*temp.length];
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "B+":  	temp =matchingBloodTypes.get("B+");
						type =temp[(int)Math.random()*temp.length];				
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "B-":  	temp =matchingBloodTypes.get("B-");
						type =temp[(int)Math.random()*temp.length];				
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "A+":  	temp =matchingBloodTypes.get("A+");
						type =temp[(int)Math.random()*temp.length];				
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "A-":  	temp =matchingBloodTypes.get("A-");
						type =temp[(int)Math.random()*temp.length];				
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "O+":  	temp =matchingBloodTypes.get("O+");
						type =temp[(int)Math.random()*temp.length];				
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		case "O-":  	temp =matchingBloodTypes.get("O-");
						type =temp[(int)Math.random()*temp.length];				
						assignedBlood [index]= type;
						availableBlood.remove(type);
						break;
		default : 		assignedBlood [index]=null;
						break;
		}	
	}

	public ArrayList<String> getBloodTypes() {
		return bloodTypes;
	}

	public String[] getAssignedBlood() {
		return assignedBlood;
	}

	public int getFitness() {
		calculateFitness();
		return fitness;
	}

	public ArrayList<String> getAvailableBlood() {
		return availableBlood;
	}
}
