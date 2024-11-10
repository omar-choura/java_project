package Projet2;

public class Compte {
    private Personne titulaire;
    private int numeroCompte;
    private double solde;
    private AgenceBancaire agenceBancaire;
    private Date dateCreation;
    private double depassation;
    private double montantversement;
    private double montantretrait;
    private Operation[] operations;
    private int operationCount;

	public Compte(Personne titulaire, int numeroCompte, double solde, AgenceBancaire agenceBancaire, Date dateCreation,int maxOperations) {
        this.titulaire = titulaire;
        this.numeroCompte = numeroCompte;
        this.solde=0;
        this.agenceBancaire = agenceBancaire;
        this.dateCreation = dateCreation;
        this.operations = new Operation[maxOperations];
        this.operationCount = 0;
    }
	
	public void affiche() {
	    System.out.println("Titulaire : " + titulaire + " Numéro de compte : " + numeroCompte + " Solde : " + getSolde()
	            + " Agence bancaire : " + agenceBancaire + " Date de création : ");
	    dateCreation.affiche();
	}

	public String toString() {
	    return "Titulaire : " + titulaire + " Numéro de compte : " + numeroCompte + " Solde : " + getSolde()
	            + " Agence bancaire : " + agenceBancaire + " Date de création : " + dateCreation.toString();
	}
    

	public Personne getTitulaire() {
		return titulaire;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}
	 public void setDepassation(double depassation) {
			this.depassation = depassation;
	}
	
	 public double getDepassation() {
		return depassation;
	}

	public void versement(double montant) {
	        setSolde(getSolde() + montant);
	    }

	    public void retrait(double montant) {
	        if (montant <= getSolde()) {
	            setSolde(getSolde() - montant);
	        } else {
	            System.out.println("Opération de retrait non autorisée. Solde insuffisant.");
	        }
	    }
	    public double fraisBancairesTrimestriels() {
			for(int i=1;i<12;i++)
				if(i%3==0)
					setSolde(getSolde() - 15);
			return getSolde();
	    }

		public double getSolde() {
			return solde;
		}

		public void setSolde(double solde) {
			this.solde = solde;
		}
		
		public double getmontantversement() {
			return montantversement;
		}

		public void setmontantversement(double montant) {
			this.montantversement = montant;
		}

		public double getMontantretrait() {
			return montantretrait;
		}

		public void setMontantretrait(double montantretrait) {
			this.montantretrait = montantretrait;
		}

		public void extrait()
		{
			System.out.println("versement de "+montantversement+"retrait de"+montantretrait);
		}

		public Date getDateCreation() {
			return dateCreation;
		}

		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
    
		 public void extraitBancaire() {
		        for (int i = 0; i < operationCount; i++) {
		            Operation operation = operations[i];
		            System.out.println("Date: " + operation.getOperation().ToString() + ", Type: " + operation.getTypeoperation() +
		                    ", Montant: " + operation.getMontantoperation() + ", Agence: " + operation.getAgenceoperation());
		        }
		    }
			void addOperation(Operation operation) {
		        if (operationCount < operations.length) {
		            operations[operationCount++] = operation;
		        } else {
		            System.out.println("Maximum number of operations reached.");
		        }
		    }}
