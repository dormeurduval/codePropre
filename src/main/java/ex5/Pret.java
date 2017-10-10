package ex5;

import java.util.Date;

public class Pret {

	protected Strategy strategy;
	protected double capital;
	protected double taux;
	protected Date dateDebut;
	
	public Pret(double capital, double taux, Date dateDebut) {
		super();
		this.strategy = new PretATerme();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}

	/** Getter for strategy
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/** Setter
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/** Getter for capital
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/** Setter
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}



	/** Getter for taux
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Getter for dateDebut
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	
}
