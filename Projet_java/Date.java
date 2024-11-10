package Projet2;


public class Date {

	private int j;
	private int m;
	private int a;
	
	public void affiche()
	{
		System.out.println(j+"/"+m+"/"+a);
	}
	
	public String toString() {
	    return j + "/" + m + "/" + a;
	}
	
	public Boolean bissextille()
	{
		return(a%4==0);
	}
	
	public Date()
	{
		j=1;
		m=3;
		a=2031;
	}
	
	public Date(int j1,int m1,int a1)
	{
		this.j=j1;
		this.m=m1;
		this.a=a1;
	}
	
	public void setA(int a1)
	{
		this.a=a1;
	}
	
	public int getA()
	{
		return(a);
	}
	
	public void setM(int M1)
	{
		this.m=M1;
	}
	
	public int getM()
	{
		return(m);
	}
	public void setJ(int j1)
	{
		this.j=j1;
	}
	
	public int getJ()
	{
		return(j);
	}
	
	public boolean compare(Date d)
	{
		boolean b;
		if(this.a>d.a)
			b=true;
		else if(this.a<d.a)
			b=false;
		else
		{
			if(this.m>d.m)
				b=true;
			else if(this.m<d.m)
				b=false;
			else {if(this.j>d.j)
				b=true;
					else
						b=false;
				
			}
		}
	return(b);}
	public int diffMois(Date dt) {
        int mois1 = this.getM() + (this.getA() * 12);
        int mois2 = dt.getM() + (dt.getA() * 12);

        return Math.abs(mois1 - mois2);
    }

	public Date getDn() {
        return new Date(this.getJ(), this.getM(), this.getA());
    }
    public int calculerAge(Date dateActuelle) {
        int age = dateActuelle.getA() - this.getA();
        if (dateActuelle.getM() < this.getM() || (dateActuelle.getM() == this.getM() && dateActuelle.getJ() < this.getJ())) {
            age--;
        }

        return age;
    }
	 
	public static void main(String [] args)
	{
		Date d1=new Date();
		//Date d1=new Date(3,10,2023);
		Date d2=new Date(6,11,2023);
		d1.affiche();
		System.out.println(d2.toString());
		d2.setA(2020);
		//d2.a=2020;
		d2.affiche();
		System.out.println(d1.compare(d2));

	}}