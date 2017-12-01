package projet1;

public class Ville {
	private String nomVille;
	private String nomPays;			//stockage des donn�es
	private int nbreHabitants;
	private char cat�gorie;         //on rend private pour bloquer l'access dans le main						 
	public static int nbreInstances =0;
	private static int nbreInstancesBis =0;
	
	// Constructeur par d�faut (aucun type de retour),meme nom que la classe.
	public Ville() 
	{
		System.out.println("Cr�ation d'une ville !");
		nomVille ="Inconnu";
		nomPays="Inconnu";
		nbreHabitants=0;
		this.setCat�gorie();
		nbreInstances++;
	    nbreInstancesBis++; //on incremente la valeur a chaque appel au constructeur 
		
	}
	
	//constructeur avec parametres
	//ajouter un p pour faire la diff�rence avec le constructeur par d�faut
	//fonctionne tout de meme meme sans "p"
	public Ville(String pNom, String pPays, int pNbre)
	{
		System.out.println("Cr�ation d'une ville avec des parametres !");
		nomVille =pNom;
		nomPays =pPays;
		nbreHabitants=pNbre;
		this.setCat�gorie();
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
	//Retourne la cat�gorie de la ville
	public char getCat�gorie()
	{
		return cat�gorie;
	}
	public static int getNbreInstanceBis()
	{
		return nbreInstancesBis;   //on cree un accessuer pour le private ...Bis,on le declare static 
	}
	
	
	//**************** MUTATEURS*************
	//Permet d'acceder aux variables en �criture
	// d�finit le nom de la ville 
	public void setNomVille(String pVille)
	{
		nomVille =pVille;
	}
	//d�finit le nom du pays
	public void setNomPays(String pPays)
	{
		nomPays=pPays;
	}
	//D�finit le nombre d'habitants
	public void setNbreHabitants(int pNbre)
	{
		nbreHabitants = pNbre;
		this.setCat�gorie();
	}
	//D�finit la cat�gorie de la ville
	private void setCat�gorie()
	{
		int bornesSuperieures[]= {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char cat�gories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G','H'};
		
		int i=0;
		while(i < bornesSuperieures.lenghth && this.nbreHabitants > bornesSuperieures[i])
		{
			i++;
		}
		this.cat�gorie=cat�gories[i];
	}
	
	//Retourne la description de la ville
	  public String decrisToi()
	  {
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de cat�gorie : "+this.cat�gorie;
	  }
	
	  //Retourne une cha�ne de caract�res selon le r�sultat de la comparaison
	  public String comparer(Ville v1)
	  {
	    String str = new String();

	    if (v1.getNombreHabitants() > this.nbreHabitants)
	      str = v1.getNomVille()+" est une ville plus peupl�e que "+this.nomVille;
	     
	    else
	      str = this.nomVille+" est une ville plus peupl�e que "+v1.getNomVille();
	     
	    return str;
	  }
	
}
