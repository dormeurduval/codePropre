package ex4;

import java.util.List;

public class SavaneAfricaine extends Zone{
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}
