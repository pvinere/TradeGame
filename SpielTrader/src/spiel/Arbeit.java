package spiel;

public class Arbeit {
	
	String name;
	int lohn;
	char typ;
	
	Arbeit(String n, int l,char t)
	{
		this.name = n;
		this.lohn = l;
		this.typ = t;	
	}
	
		//GET
	
		public String getArbeitName()
		{
			return name;
		}
		
		public int getArbeitLohn()
		{
			return lohn;
		}
			
		public char getArbeitTyp()
		{
			return typ;
		}
		
		//SET
		
		public void setArbeitName(String newName)
		{
			this.name= newName;
		}
		
		public void setArbeitLohn(int newLohn)
		{
			this.lohn = newLohn;
		}

		public void setArbeitTyp(char newTyp)
		{
			this.typ= newTyp;
		}
		
		public static Arbeit Arbeit_List(int i)
		{
			Arbeit[] arb = new Arbeit[2];
			
			arb[0] = new Arbeit("Farmer",10,'d');
			arb[1] = new Arbeit("Gesäftsverkäufer",10,'s');
			
			return arb[i];
		}
		
		public static boolean Arbeit_warsch(int t)
		{
			java.util.Random rand = new java.util.Random();
			
			double r = rand.nextInt(10-t);
			
			if(r == 2 || r == 0)
			{
				return true;
			}
			else return false;
				
		}
		
		public static int Arbeit_prob(int pr)
		{
			int z=0;
			
			if(pr == 1)
			{
				z=30;
			}
			else if (pr == 2)
			{
				z=40;
			}
			else if (pr == 3)
			{
				z=50;
			}
			else if (pr == 4)
			{
				z=60;
			}
			else if (pr == 5)
			{
				z=70;
			}
			else if (pr == 6)
			{
				z=80;
			}
			else if (pr == 7)
			{
				z=90;
			}
			else z = 100;
			
			return z;
		}
		
	

}
