package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComptageStock {

	private int nb;
	private int resultat;
	private Date dateDebutComptage;
	private Date dateFinComptage;
	private Type type;
	
	/**
	 * Methods add new element
	 * @param montant
	 */
	public void ajouterElement(int montant){
		nb++;
		resultat +=montant;
	}
	
	
	/**
	 * Print som
	 *
	 */
	private void afficheTypeSom(){
		if (type!=null && type.equals(Type.SOM)){
			System.out.println("Ce comptage est de type SOMME");
			System.out.println("Nombre d'élements "+nb);
			
			System.out.println("Résultat "+resultat);
		}
	}
	
	/**
	 * Methods
	 * Print Moy
	 */
	private void afficheTypeMoy(){
		if (type!=null && type.equals(Type.MOY)){
			System.out.println("Ce compte est de type MOYENNE");
			System.out.println("Nombre d'élements "+nb);
			
			System.out.println("Résultat "+resultat/nb);
		}
	}
	
	/**
	 * Methods
	 * Print type
	 */
	private void afficheType(){
		afficheTypeSom();
		afficheTypeMoy();

	}
	
	/**
	 * Methods
	 * Print DebutCompatge
	 */
	private void afficheDebutComptage(){
		System.out.println(DateUtils.format(dateDebutComptage));
	}
	
	/**
	 * Methods
	 * Print FinComptage
	 */
	private void afficheFinComptage(){
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le "+dateFinComptage);
			affichFinComptageCloture();
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}


	/** Methods
	 * 
	 */
	private void affichFinComptageCloture() {
		if (nb==0){
			System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
		}
		else {
			System.out.println("Le comptage est clos et est OK.");
		}
	}
	
	/**
	 * Methods
	 * Print statut comptage
	 */
	public void afficheStatutComptage(){
		
		afficheType();
		
		afficheDebutComptage();
		afficheFinComptage();

	}
	
	/**
	 * Methods
	 * @return datefincomptage
	 * @throws ParseException
	 */
	public Date getDateFinComptage() throws ParseException{
		return DateUtils.parse(dateFinComptage);
	}
}
