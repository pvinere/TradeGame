package spiel;

public class Spieler {
	
	int spielerLP;
	int spielerGS;
	int spielerTag;
	int spielerKG;
	
	Spieler(int lp,int gs,int tag,int kg)
	{
		this.spielerLP = lp;
		this.spielerGS = gs;
		this.spielerTag = tag;
		this.spielerKG = kg;
	}

	//GET
	public int getSpielerLP()
	{
		return spielerLP;
	}
	
	public int getSpielerGS()
	{
		return spielerGS;
	}
	
	public int getSpielerTag()
	{
		return spielerTag;
	}
	
	public int getSpielerKG()
	{
		return spielerKG;
	}
	
	//SET
	
	public void setSpielerLP(int newLP)
	{
		this.spielerLP = newLP;
	}
	
	public void setSpielerGS(int newGS)
	{
		this.spielerGS = newGS;
	}
	public void setSpielerTag(int newTag)
	{
		this.spielerTag = newTag;
	}
	
	public void setSpielerKG(int newKG)
	{
		this.spielerKG = newKG;
	}
	
	

}
