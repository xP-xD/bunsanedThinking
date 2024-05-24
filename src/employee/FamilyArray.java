package employee;

import java.util.ArrayList;

public class FamilyArray {
	
	private ArrayList<Family> familyArray;
	
	public FamilyArray() {
		familyArray = new ArrayList<Family>();
	}
	
	public void add(Family family){
		this.familyArray.add(family);
	}

	public void delete(int id){

	}

	public Family get(int id){
		
		return this.familyArray.get(id);
	}

	public void update(int id){

	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void finalize() throws Throwable {

	}
}
