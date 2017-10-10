package ex1;

import java.util.Date;

public class Entreprise {

	/**
	 * Siret: int
	 */
	private int siret;

	/**
	 * nom: string
	 */
	private String nom;
	/** getters
	 * @return the siret
	 */
	
	/**
	 * adresse: string
	 */
	private String adresse;
	/**
	 * dateCreation: date
	 */
	private Date dateCreation;
	
	public int getSiret() {
		return siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** getters
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** getters
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** getters
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/** getters
	 * @return the capitalMax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}

	
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * Methods
	 * cette methode affiche le statut
	 */
	public void afficherStatut(){
		System.out.println("");
	}
	
}
