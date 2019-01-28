
public class CV {
	
	
	public String nom;
	public String prenom;
	public String formation;
	public int experiences;
	public String[] competences;
	public String attentes;
	
	// Constructeur CV base
	public CV(){
		
	}
	
	public CV( String pNom, String pPrenom, String pFormation, int pExperiences, String[] pCompetences, String pAttentes){
		
		nom = pNom;
		prenom = pPrenom;
		formation = pFormation;
		experiences = pExperiences;
		competences = pCompetences;
		attentes = pAttentes;
	}
	
	public void affiche(){
		
		System.out.println("Nom : " + nom +
						   "\nPrenom : " +  prenom +
						   "\nFormation : " + formation +
						   "\nAnnées : " + experiences);
		int compteur = 1;
		System.out.println("\nCompétences");
		for(String compet : competences){
			
			System.out.println(compteur + ". " + compet);
			compteur++;
		}
		
		System.out.println("\nAttentes : " + attentes);
		
		System.out.println("-----\n");
						   
	}
	
public static void main(String[] args){
		
	
		CV cvMax = new CV("Ouellette", "Maxime", "Informatique de Gestion" , 1 , new String[]{"Réseau" , "Programmation"} , "Suivre un cours intéressant et utile pour la vie professionnelle.\n");
		CV cvMichaud = new CV("Michaud", "Antoine", "Informatique de Gestion" , 1 , new String []{"Java", "HTML", "Réseau" , "PowerPoint", "Programmation"}, "Un cours qui nous prépareras adéquatement à la vie professionnel\n");
	
		System.out.println("Bienvenue chez Barette!\n");
		
		cvMax.affiche();
		cvMichaud.affiche();
	}
}
