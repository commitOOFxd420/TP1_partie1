
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
}
