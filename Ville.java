package projet1;

public class Ville {
	private String nomVille;
	private String nomPays;			//stockage des données
	private int nbreHabitants;
	private char catégorie;         //on rend private pour bloquer l'access dans le main						 
	public static int nbreInstances =0;
	private static int nbreInstancesBis =0;
	
	// Constructeur par défaut (aucun type de retour),meme nom que la classe.
	public Ville() 
	{
		System.out.println("Création d'une ville !");
		nomVille ="Inconnu";
		nomPays="Inconnu";
		nbreHabitants=0;
		this.setCatégorie();
		nbreInstances++;
	    nbreInstancesBis++; //on incremente la valeur a chaque appel au constructeur 
		
	}
	
	//constructeur avec parametres
	//ajouter un p pour faire la différence avec le constructeur par défaut
	//fonctionne tout de meme meme sans "p"
	public Ville(String pNom, String pPays, int pNbre)
	{
		System.out.println("Création d'une ville avec des parametres !");
		nomVille =pNom;
		nomPays =pPays;
		nbreHabitants=pNbre;
		this.setCatégorie();
		nbreInstances++;
	    nbreInstancesBis++;//on incremente la valeur a chaque appel au constructeur
	}
	
	//***************** ACCESSEURS ********************
	//Permet d'acceder a nos variable en lecture
	
	//Retourne le nom de la ville 
	public String getNomVille()
	{
		return nomVille;
	}
	
	//Retourne le nom du pays 
	public String getNomPays()
	{
		return nomPays;
	}
	
	//retourne le nombre d'habitants
	public int getNombreHabitants()
	{
		return nbreHabitants;
	}
	//Retourne la catégorie de la ville
	public char getCatégorie()
	{
		return catégorie;
	}
	public static int getNbreInstanceBis()
	{
		return nbreInstancesBis;   //on cree un accessuer pour le private ...Bis,on le declare static 
	}
	
	
	//**************** MUTATEURS*************
	//Permet d'acceder aux variables en écriture
	// définit le nom de la ville 
	public void setNomVille(String pVille)
	{
		nomVille =pVille;
	}
	//définit le nom du pays
	public void setNomPays(String pPays)
	{
		nomPays=pPays;
	}
	//Définit le nombre d'habitants
	public void setNbreHabitants(int pNbre)
	{
		nbreHabitants = pNbre;
		this.setCatégorie();
	}
	//Définit la catégorie de la ville
	private void setCatégorie()
	{
		int bornesSuperieures[]= {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char catégories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G','H'};
		
		int i=0;
		while(i < bornesSuperieures.lenghth && this.nbreHabitants > bornesSuperieures[i])
		{
			i++;
		}
		this.catégorie=catégories[i];
	}
	
	//Retourne la description de la ville
	  public String decrisToi()
	  {
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.catégorie;
	  }
	
	  //Retourne une chaîne de caractères selon le résultat de la comparaison
	  public String comparer(Ville v1)
	  {
	    String str = new String();

	    if (v1.getNombreHabitants() > this.nbreHabitants)
	      str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille;
	     
	    else
	      str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille();
	     
	    return str;
	  }
	
}
