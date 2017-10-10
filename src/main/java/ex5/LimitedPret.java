/**
 * 
 */
package ex5;

import java.util.Date;

public class LimitedPret extends Pret {

	protected Date dateFin;
	
	/**
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public LimitedPret(double capital, double taux, Date dateDebut, Date dateFin) {
		super(capital,taux,dateDebut);
		this.dateFin = dateFin;
	}
	
	/** Getter for dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
