/**
 * 
 */
package ex5;

import java.util.Date;

/**
 * @author joris
 *
 */
public final class CapitalPret extends LimitedPret {

	private double capitalRestantDu;
	
	/**
	 * @param capital
	 * @param capitalRestantDu
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public CapitalPret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		super(capital,taux,dateDebut,dateFin);
		this.capitalRestantDu = capitalRestantDu;

	}
	
	/** Getter for capitalRestantDu
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}
	
	/** Setter
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}
}
