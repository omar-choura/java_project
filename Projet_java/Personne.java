package Projet2;

public class Personne {

	private String N;
	private String P;
	private int CIN;
	private Date dn;
	
	public void affiche()
	{
		System.out.println("Nom="+N+"Prenom="+P+"CIN="+CIN+"Date de naissace="+dn.toString());
	}
	
	public String toString() {
	    return ("Nom=" + N + " Prenom=" + P + " CIN=" + CIN + " Date de naissance=" + dn.toString());
	}

	public Personne()
	{
		N="Choura";
		P="Omar";
		CIN=11178026;
		dn=new Date(05,8,2003);
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public Date getDn() {
		return dn;
	}
	public void setDn(Date dt) {
		this.dn = dt;
	}
	public Personne(String n, String p, int cIN, Date dt) {
		N = n;
		P = p;
		CIN = cIN;
		this.dn = dt;
	}
	public Personne(String n, String p, int cIN,int j,int m,int a) {
		N = n;
		P = p;
		CIN = cIN;
		dn = new Date(j,m,a);
		}
}
