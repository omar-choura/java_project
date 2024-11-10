package Projet2;

public class DateTime extends Date{
	private int H;
	private int min;
	private int S;
	
	public DateTime()
	{
		super();
		H=10;
		min=0;
		S=0;
	}
	public DateTime(int a1,int m1,int j1,int H1,int min1,int S1)
	{
		super(a1,m1,j1);
		H=H1;
		min=min1;
		S=S1;
	}
	
	public void setH(int H1)
	{
		H=H1;
	}
	public int getH()
	{
		return(H);
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getS() {
		return S;
	}
	public void setS(int s) {
		S = s;
	}
	public void affiche()
	{
		super.affiche();
		System.out.println(H+":"+min+":"+S);
	}
	public String ToString()
	{
		return(super.toString()+" "+H+":"+min+":"+S);
	}
	
	public static void main(String []args)
	{
		DateTime dt1= new DateTime();
		DateTime dt2= new DateTime(21,11,2023,11,30,0);
		dt1.affiche();
		System.out.println(dt2.ToString());
		if(dt1.compare(dt2)==true)
			System.out.println("le meme jour");
		dt1.affiche();
		dt2.affiche();
	}
}
