package myPackage;

public class CompteEpargne extends Compte{
	
	public CompteEpargne() {
		super();
	}

	public void remunerer() {
		deposer(get_solde()*0.032);
	}

}
