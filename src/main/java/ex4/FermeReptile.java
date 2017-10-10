package ex4;

import java.util.List;

public class FermeReptile extends Zone{
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.1;
	}
}
