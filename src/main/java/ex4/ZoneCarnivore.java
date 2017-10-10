package ex4;

import java.util.List;

public class ZoneCarnivore extends Zone {
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}
