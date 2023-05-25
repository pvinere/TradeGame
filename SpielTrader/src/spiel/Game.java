package spiel;

import java.awt.Color;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel ,startButtonPanel,exitButtonPanel,mainTextPanel,wahlButtonPanel,spielerPanel,zuruckButtonPanel;
	JLabel titleNameLabel , lpLabel, lpLabelNum , gsLabel, gsLabelNum , tagLabel , tagLabelNum,gewLabel,gewLabelNum;
	Font titleFont = new Font("Times New Roman",Font.PLAIN, 90);
	Font buttonFont = new Font("Times New Roman",Font.PLAIN,25);
	Font mainTextFont = new Font("Times New Roman",Font.PLAIN,25);
	Font statsTextFont = new Font("Impact",Font.PLAIN,25);
	JButton startButton ,exitButton, wahl1 , wahl2, wahl3 ,wahl4, wahl5,wahl6,wahl_zuruck;
	JTextArea mainTextArea;
	String position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ExitHandler exHandler = new ExitHandler();
	WahlHandler wahlHanlder = new WahlHandler();
	
	int LP = 100;
	int GS = 100;
	int Tag = 1;
	int KG = 0;
	Spieler s1 = new Spieler(LP,GS,Tag,KG);
	
	int pr = 1;
	int dist = 0;
	int pr_item = 1;
	int in = 0;
	Ort mainOrt = new Ort("Berlin",0,'s',0);
	
	ArrayList<Items> inv = new ArrayList<Items>();
	
	int[] count = {0,0,0,0,0,0,0,0,0};
		
	static Ort[] orts  = new Ort[5];
	
	public static void main(String[] args) {
		
		orts[0] = new Ort("Berlin",0,'s',0);
		orts[1] = new Ort("Frankfurt",1,'s',1);
		orts[2] = new Ort("Wernshausen",2,'d',2);
		orts[3] = new Ort("Schmalkalden",3,'d',3);
		orts[4] = new Ort("Suhl",4,'d',4);
		
		new Game();

	}
	
	public Game(){
		
		//window
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		//panel
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		
		//label
		titleNameLabel = new JLabel("THE TRADER");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		//startButtonPanel
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		//startButton
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(buttonFont);
		startButton.setFocusPainted(false); //um kein Box in die Mitte
		startButton.addActionListener(tsHandler);
		
		//exitButtonPanel;
		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(5, 460, 200, 100);
		exitButtonPanel.setBackground(Color.black);
		
		//exitButton
		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButton.setFont(buttonFont);
		exitButton.setFocusPainted(false); //um kein Box in die Mitte
		exitButton.addActionListener(exHandler);
		
		//add Stuff zum Stuff 
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		exitButtonPanel.add(exitButton);
		
		
		//add zum Bild
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(exitButtonPanel);

	}

	public void createScreen()
	{
		//altes menu disable
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		exitButtonPanel.setVisible(false);
		
		
		//text panel
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		//text 
		mainTextArea = new JTextArea("TEST_TEST_TEST_TEST_TEST_TEST_TEST_TEST_TEST");
				
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(mainTextFont);
		mainTextArea.setLineWrap(true);//text lap
		mainTextPanel.add(mainTextArea);
		mainTextArea.setEditable(false);
		
		wahlButtonPanel = new JPanel();
		wahlButtonPanel.setBounds(250, 350, 300, 150);
		wahlButtonPanel.setBackground(Color.black);
		wahlButtonPanel.setLayout(new GridLayout(6,1));
		con.add(wahlButtonPanel);
		
		//1 WahlButton
		wahl1 = new JButton("Button 1");
		wahl1.setBackground(Color.black);
		wahl1.setForeground(Color.white);
		wahl1.setFont(buttonFont);
		wahlButtonPanel.add(wahl1);
		wahl1.setFocusPainted(false);//um kein Box in die Mitte
		wahl1.addActionListener(wahlHanlder);
		wahl1.setActionCommand("w1");
		
		//2WahlButton
		wahl2 = new JButton("Button 2");
		wahl2.setBackground(Color.black);
		wahl2.setForeground(Color.white);
		wahl2.setFont(buttonFont);
		wahlButtonPanel.add(wahl2);
		wahl2.setFocusPainted(false);//um kein Box in die Mitte
		wahl2.addActionListener(wahlHanlder);
		wahl2.setActionCommand("w2");
		
		//3 WahlButton
		wahl3 = new JButton("Button 3");
		wahl3.setBackground(Color.black);
		wahl3.setForeground(Color.white);
		wahl3.setFont(buttonFont);
		wahlButtonPanel.add(wahl3);
		wahl3.setFocusPainted(false);//um kein Box in die Mitte
		wahl3.addActionListener(wahlHanlder);
		wahl3.setActionCommand("w3");
		
		//4 WahlButton
		wahl4 = new JButton("Button 4");	
		wahl4.setBackground(Color.black);
		wahl4.setForeground(Color.white);
		wahl4.setFont(buttonFont);
		wahlButtonPanel.add(wahl4);
		wahl4.setFocusPainted(false);//um kein Box in die Mitte
		wahl4.addActionListener(wahlHanlder);
		wahl4.setActionCommand("w4");
		
		//5 WahlButton
		wahl5 = new JButton("Button 5");	
		wahl5.setBackground(Color.black);
		wahl5.setForeground(Color.white);
		wahl5.setFont(buttonFont);
		wahlButtonPanel.add(wahl5);
		wahl5.setFocusPainted(false);//um kein Box in die Mitte
		wahl5.addActionListener(wahlHanlder);
		wahl5.setActionCommand("w5");
		
		//6 WahlButton
		wahl6 = new JButton("Button 6");	
		wahl6.setBackground(Color.black);
		wahl6.setForeground(Color.white);
		wahl6.setFont(buttonFont);
		wahlButtonPanel.add(wahl6);
		wahl6.setFocusPainted(false);//um kein Box in die Mitte
		wahl6.addActionListener(wahlHanlder);
		wahl6.setActionCommand("w6");
			
		//Spieler Panel
		
		spielerPanel = new JPanel();
		spielerPanel.setBounds(100,15,600,50);
		spielerPanel.setBackground(Color.black);
		spielerPanel.setLayout(new GridLayout(1,4));
		con.add(spielerPanel);
		
		//Lebenspunkte Label
		lpLabel = new JLabel("LP:");
		lpLabel.setFont(statsTextFont);
		lpLabel.setForeground(Color.white);
		spielerPanel.add(lpLabel);
		//Lebenspunkte Label NUMMER
		lpLabelNum = new JLabel();
		lpLabelNum.setFont(statsTextFont);
		lpLabelNum.setForeground(Color.white);
		spielerPanel.add(lpLabelNum);
		
		//Gold Label
		gsLabel = new JLabel("GOLD: ");
		gsLabel.setFont(statsTextFont);
		gsLabel.setForeground(Color.white);
		spielerPanel.add(gsLabel);	
		//Gold Label NUMMER
		gsLabelNum = new JLabel();
		gsLabelNum.setFont(statsTextFont);
		gsLabelNum.setForeground(Color.white);
		spielerPanel.add(gsLabelNum);
		
		//Gewicht Label
		gewLabel = new JLabel("KG: ");
		gewLabel.setFont(statsTextFont);
		gewLabel.setForeground(Color.white);
		spielerPanel.add(gewLabel);	
		//Gewicht Label NUMMER
		gewLabelNum = new JLabel();
		gewLabelNum.setFont(statsTextFont);
		gewLabelNum.setForeground(Color.white);
		spielerPanel.add(gewLabelNum);

		//Tag Label
		tagLabel = new JLabel("Tag: ");
		tagLabel.setFont(statsTextFont);
		tagLabel.setForeground(Color.white);
		spielerPanel.add(tagLabel);
		//Tag Label NUMMER
		tagLabelNum = new JLabel();
		tagLabelNum.setFont(statsTextFont);
		tagLabelNum.setForeground(Color.white);
		spielerPanel.add(tagLabelNum);
		
		playerSetup();
		
	}

	public void playerSetup()
	{
		
		lpLabelNum.setText(""+ s1.spielerLP);
		gsLabelNum.setText(""+ s1.spielerGS);
		tagLabelNum.setText(""+ s1.spielerTag);
		gewLabelNum.setText(""+ s1.spielerKG);
		
		firstText();
	}

	public void EndGameForever()
	{
		System.exit(0);
	}
	
	public void NewTag(int tag)
	{
		
		int lb_verlohren = 0;
		
		pr_item++;
		
		if(tag == 0)
		{
			lb_verlohren = 0;
		}
		
		else if(tag == 1)
		{
			lb_verlohren = 5;
		}
		else if(tag == 2)
		{
			lb_verlohren = 10;
		}
		else if(tag == 3)
		{
			lb_verlohren = 15;
		}
		else 
		{
			lb_verlohren = 20;
		}
		
		if(s1.getSpielerLP()>0)
		{
			s1.setSpielerTag(s1.spielerTag = s1.spielerTag + tag);
			s1.setSpielerLP(s1.spielerLP = s1.spielerLP - lb_verlohren);
			playerSetup();
			contText();
		}
		else Ende_Text();
		
		if(s1.getSpielerTag()==100)
		{
			Win_Text();
		}

	}
	
	public void NewGame()
	{
		
		s1.setSpielerTag(Tag);
		s1.setSpielerLP(LP);
		s1.setSpielerGS(GS);
		s1.setSpielerKG(KG);
		pr=1;
		pr_item=1;
		count[0]=0;
		count[1]=0;
		count[2]=0;
		count[3]=0;
		count[4]=0;
		count[5]=0;
		count[6]=0;
		count[7]=0;
		count[8]=0;
		
		tagLabel.setVisible(true);
		tagLabelNum.setVisible(true);
		gewLabel.setVisible(true);
		gewLabelNum.setVisible(true);
		gsLabel.setVisible(true);
		gsLabelNum.setVisible(true);
		lpLabel.setVisible(true);
		lpLabelNum.setVisible(true);
		
		playerSetup();
		firstText();
	}
	
	public void firstText() {
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		position = "firstText";

		mainTextArea.setText("Hallo Verkäufer, willkommen in unserer Region!"
				+ "\nHier kannst du Waren kaufen und verkaufen"
				+ "\nDu kannst auch in die Dörfer und Städte der Region reisen"
				+ "\nWenn du kein Geld mehr hast, kannst du auch arbeiten "
				+ "\nGrade bist du in " + mainOrt.getOrtName()
				+ "\nWas willst du machen?");
		wahl1.setText("Kaufen");
		wahl2.setText("Verkaufen");
		wahl3.setText("Arbeiten");
		wahl4.setText("Inventory");
		wahl5.setText("Wandern");
		wahl6.setText("End Game");
	}
	
	public void contText()
	{
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		position = "contText";
		
		if(mainOrt.getOrtTyp()=='s')
		{
			mainTextArea.setText("Jetzt bist du in der Stadt"
					+ "\nIn der Stadt kannst du Essen kaufen!"
					+ "\nDu bist jetzt in " + mainOrt.getOrtName());
		}	
		else
		{
			mainTextArea.setText("Jetzt bist du im Dorf"
					+ "\nUm Essen zu kaufen muss du in einem Stadt sein !" 
					+ "\nDu bist jetzt in " + mainOrt.getOrtName());
		}		
		wahl1.setText("Kaufen");
		wahl2.setText("Verkaufen");
		wahl3.setText("Arbeiten");
		wahl4.setText("Inventory");
		wahl5.setText("Wandern");
		wahl6.setText("End Game");
		
	}
		
	public void invText()
	{
		position = "invText";
		mainTextArea.setText("Hier sind deine Sachen: (Seite 1)"
				+ "\n"
				+ "\nWeizen: " + count[0] + " Stück  || " + count[0] * Items.Items_list(0).getItemGew() + " KG"
				+ "\nMais: " + count[1] + " Stück  || "+ count[1] * Items.Items_list(1).getItemGew()+ " KG"
				+ "\nKartoffeln: " + count[2] + " Stück  || "+ count[2] * Items.Items_list(2).getItemGew()+ " KG"
				+ "\nRueben: " + count[3] + " Stück  || "+ count[3] * Items.Items_list(3).getItemGew()+ " KG"
				+ "\n"
				+ "\nEssen: " + count[8] + " Stück  || "+ count[8] * Items.Items_list(8).getItemGew()+ " KG"
				
				);
		wahl4.setText("Zurück");
		wahl3.setText("Seite 2");
		wahl2.setText("Essen");
		wahl1.setVisible(false);
		wahl5.setVisible(false);
		wahl6.setVisible(false);
	}
	
	public void invText_2()
	{
		position = "invText_2";
		mainTextArea.setText("Hier sind deine Sachen: (Seite 2)"
				+ "\n"
				+ "\nTopfe: " + count[4] + " Stück || " + count[4] * Items.Items_list(4).getItemGew()+ " KG"
				+ "\nGeschirr: " + count[5] + " Stück  || " + count[5] * Items.Items_list(5).getItemGew()+ " KG"
				+ "\nHacke: " + count[6] + " Stück  || " + count[6] * Items.Items_list(6).getItemGew()+ " KG"
				+ "\nHammer: " + count[7] + " Stück  || " + count[7] * Items.Items_list(7).getItemGew()+ " KG"
				+ "\n"
				+ "\nEssen: " + count[8] + " Stück  || " + count[8] * Items.Items_list(8).getItemGew()+ " KG");
		
		wahl3.setText("Seite 1");
		wahl4.setText("Zurück");
		wahl2.setText("Essen");
		wahl1.setVisible(false);
		wahl5.setVisible(false);
		wahl6.setVisible(false);
	}
	
	public void kaufText_Stadt()
	{
		
		
		String ware1 = Items.Items_list(4).getItemName();
		String ware2 = Items.Items_list(5).getItemName();
		String ware3 = Items.Items_list(6).getItemName();
		String ware4 = Items.Items_list(7).getItemName();
		String ware5 = Items.Items_list(8).getItemName();
		 
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		position = "kaufText_Stadt";
	
		mainTextArea.setText("Hier kannst du Sachen von dem Stadt kaufen."
				+ "\nWas willst du kaufen?" 
				+ "\n "
				+ "\n "+ Items.Items_list(4).getItemName() + " | Preis:"  + Items.Items_list(4).getItemPreis() + " | Gewicht : " + Items.Items_list(4).getItemGew()
				+ "\n "+ Items.Items_list(5).getItemName() + " | Preis:"  + Items.Items_list(5).getItemPreis() + " | Gewicht : " + Items.Items_list(5).getItemGew()
				+ "\n "+ Items.Items_list(6).getItemName() + " | Preis:"  + Items.Items_list(6).getItemPreis() + " | Gewicht : " + Items.Items_list(6).getItemGew()
				+ "\n "+ Items.Items_list(7).getItemName() + " | Preis:"  + Items.Items_list(7).getItemPreis() + " | Gewicht : " + Items.Items_list(7).getItemGew()
				+ "\n "+ Items.Items_list(8).getItemName() + " | Preis:"  + Items.Items_list(8).getItemPreis() + " | Gewicht : " + Items.Items_list(8).getItemGew()
				);

		wahl1.setText(ware1);
		wahl2.setText(ware2);
		wahl3.setText(ware3);
		wahl4.setText(ware4);
		wahl5.setText(ware5);
		wahl6.setText("Fertig für heute!");
		

}

	public void kaufText_Dorf()
	{
		String ware1 = Items.Items_list(0).getItemName();
		String ware2 = Items.Items_list(1).getItemName();
		String ware3 = Items.Items_list(2).getItemName();
		String ware4 = Items.Items_list(3).getItemName();
		
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(false);
		
		position = "kaufText_Dorf";
		
		mainTextArea.setText("Hier kannst du Sachen von dem Dorf kaufen."
				+ "\nWas willst du kaufen?" 
				+ "\n "
				+ "\n "+ Items.Items_list(0).getItemName() + " | Preis:"  + Items.Items_list(0).getItemPreis() + " | Gewicht : " + Items.Items_list(0).getItemGew()
				+ "\n "+ Items.Items_list(1).getItemName() + " | Preis:"  + Items.Items_list(1).getItemPreis() + " | Gewicht : " + Items.Items_list(1).getItemGew()
				+ "\n "+ Items.Items_list(2).getItemName() + " | Preis:"  + Items.Items_list(2).getItemPreis() + " | Gewicht : " + Items.Items_list(2).getItemGew()
				+ "\n "+ Items.Items_list(3).getItemName() + " | Preis:"  + Items.Items_list(3).getItemPreis() + " | Gewicht : " + Items.Items_list(3).getItemGew()
				
				);
		
		wahl1.setText(ware1);
		wahl2.setText(ware2);
		wahl3.setText(ware3);
		wahl4.setText(ware4);
		wahl5.setText("Fertig für heute!");
		
	}
		
	public void arbeitText_Stadt(){
		
		int z = Arbeit.Arbeit_prob(pr);
		
		position = "arbeitText_Stadt";
		mainTextArea.setText("Willst du ein Arbeit suchen?"
				+ "\nDie Wahrscheinlichkeit, einen Job zu finden ist " + z + "%");
		wahl4.setText("Ja");
		wahl5.setText("Nein");
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl1.setVisible(false);
		wahl6.setVisible(false);
	}
	
	public void arbeitFound() {
	
		position = "arbeitFound";
		
		if(mainOrt.getOrtTyp()=='s')
		{
			mainTextArea.setText("Du hast einen Job in der Stadt "+ mainOrt.getOrtName() + " \nals " +Arbeit.Arbeit_List(1).getArbeitName() + " gefunden ! " 
					+"\nDu kriegst " + Arbeit.Arbeit_List(1).getArbeitLohn() 
					+" Gold als Lohn.");
		}
		else 
		{
			mainTextArea.setText("Du hast einen Job in dem Dorf " + mainOrt.getOrtName() + " \nals " +Arbeit.Arbeit_List(0).getArbeitName() + " gefunden ! " 
					+"\nDu kriegst " + Arbeit.Arbeit_List(0).getArbeitLohn() 
					+" Gold als Lohn.");
		}
			
		wahl4.setText("Danke!");
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl5.setVisible(false);
		wahl6.setVisible(false);
		
	}
	
	public void arbeitNotFound()
	{
		position = "arbeitNotFound";
		mainTextArea.setText("Heute hast du keinen Job gefunden."
				+ "\nVersuche es morgen!");
		wahl4.setText("Nächsten Tag");
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl5.setVisible(false);
		wahl6.setVisible(false);
	
	}

	public void wandernText()
	{
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		position = "wandernText";

		mainTextArea.setText("Wo willst du wandern?"
				+ "\nBerlin distanz:" +" "+ orts[0].getOrtDistanz() + " Tagen"
				+ "\nFrankfurt distanz:" +" "+ orts[1].getOrtDistanz() + " Tagen"
				+ "\nWernshausen distanz:"  +" "+ orts[2].getOrtDistanz() + " Tagen"
				+ "\nSchmalkalden distanz:" +" "+ orts[3].getOrtDistanz() + " Tagen"
				+ "\nSuhl distanz:"   +" "+ orts[4].getOrtDistanz()+ " Tagen"); 
		
		wahl1.setText("Berlin (St)");
		wahl2.setText("Frankfurt (St)");
		wahl3.setText("Wernshausen (St)");
		wahl4.setText("Schmalkalden (Dr)");
		wahl5.setText("Suhl (Dr)");
		wahl6.setText("Zurück!");
		
	}
		
	public void wandernAction(int x)
	{		
		if(x == 0)
		{
			mainOrt.setOrtName("Berlin");
			mainOrt.setOrtTyp('s');
			mainOrt.setOrtId(0);
			
			orts[0] = new Ort("Berlin",0,'s',0);
			orts[1] = new Ort("Frankfurt",5,'s',1);
			orts[2] = new Ort("Wernshausen",3,'s',2);
			orts[3] = new Ort("Schmalkalden",1,'d',3);
			orts[4] = new Ort("Suhl",4,'d',4);
			
		}
		else if(x == 1)
		{
			mainOrt.setOrtName("Frankfurt");
			mainOrt.setOrtTyp('s');
			mainOrt.setOrtId(1);
			
			orts[0] = new Ort("Berlin",5,'s',0);
			orts[1] = new Ort("Frankfurt",0,'s',1);
			orts[2] = new Ort("Wernshausen",1,'s',2);
			orts[3] = new Ort("Schmalkalden",4,'d',3);
			orts[4] = new Ort("Suhl",2,'d',4);
			
		}
		else if (x == 2)
		{
			mainOrt.setOrtName("Wernshausen");
			mainOrt.setOrtTyp('d');
			mainOrt.setOrtId(2);
			
			orts[0] = new Ort("Berlin",3,'s',0);
			orts[1] = new Ort("Frankfurt",1,'s',1);
			orts[2] = new Ort("Wernshausen",0,'s',2);
			orts[3] = new Ort("Schmalkalden",4,'d',3);
			orts[4] = new Ort("Suhl",3,'d',4);
		}
		else if (x == 3)
		{
			mainOrt.setOrtName("Schmalkalden");
			mainOrt.setOrtTyp('d');
			mainOrt.setOrtId(3);
			
			orts[0] = new Ort("Berlin",1,'s',0);
			orts[1] = new Ort("Frankfurt",4,'s',1);
			orts[2] = new Ort("Wernshausen",4,'s',2);
			orts[3] = new Ort("Schmalkalden",0,'d',3);
			orts[4] = new Ort("Suhl",3,'d',4);
		}
		else
		{
			mainOrt.setOrtName("Suhl");
			mainOrt.setOrtTyp('d');
			mainOrt.setOrtId(4);
			
			orts[0] = new Ort("Berlin",4,'s',0);
			orts[1] = new Ort("Frankfurt",2,'s',1);
			orts[2] = new Ort("Wernshausen",3,'s',2);
			orts[3] = new Ort("Schmalkalden",3,'d',3);
			orts[4] = new Ort("Suhl",0,'d',4);
		}
		
		
	}
	
	public void Win_Text()
	{
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl4.setVisible(false);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		tagLabel.setVisible(false);
		tagLabelNum.setVisible(false);
		gewLabel.setVisible(false);
		gewLabelNum.setVisible(false);
		gsLabel.setVisible(false);
		gsLabelNum.setVisible(false);
		lpLabel.setVisible(false);
		lpLabelNum.setVisible(false);
		
		position = "Win_Text";
		mainTextArea.setText("\tDU HAST GEWONNEN !!!"
				+ "\n"
				+ "\nDein Ergebnis ist:"
				+ "\nLebenspunkte: " + s1.getSpielerLP()
				+ "\nGoldstücke: " + s1.getSpielerGS());
		
		wahl5.setText("Restart");
		wahl6.setText("Close");
	}
	
	public void Ende_Text()
	{
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl4.setVisible(false);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		tagLabel.setVisible(false);
		tagLabelNum.setVisible(false);
		gewLabel.setVisible(false);
		gewLabelNum.setVisible(false);
		gsLabel.setVisible(false);
		gsLabelNum.setVisible(false);
		lpLabel.setVisible(false);
		lpLabelNum.setVisible(false);
		
	
		position = "Ende_Text";
		
		if(s1.getSpielerLP()==100)
		{
			mainTextArea.setText("Du hast zu viel gegessen und "
					+ "hast kein mehr Lust \nzu arbeiten! "
					+ "\nDU HAST VERLOREN !!!"
					+ "\nDein Score ist: " + s1.getSpielerGS()+ " Goldstücke");
			
			wahl5.setText("Restart");
			wahl6.setText("Close");
		}
		else 
		{
			mainTextArea.setText("Deine Lebenspunkte sind 0! DU HAST VERLOREN !!!"
					+ "\nDein Score ist: " + s1.getSpielerGS() + " Goldstücke");
			
			wahl5.setText("Restart");

			wahl6.setText("Close");
			
		}
			
		
	}
	
	public void Essen()
	{
		
		if(count[8]>0 && s1.getSpielerLP()==95)
		{
			count[8]--;
			s1.setSpielerLP(s1.getSpielerLP()+5);
			playerSetup();
			invText();
		}
		else if(count[8]>0 && s1.getSpielerLP()==90){
			count[8]--;
			s1.setSpielerLP(s1.getSpielerLP()+10);
			playerSetup();
			invText();
		}
		else if(count[8]>0 && s1.getSpielerLP()==85){
			count[8]--;
			s1.setSpielerLP(s1.getSpielerLP()+15);
			playerSetup();
			invText();
		}
		else if(count[8]>0 && s1.getSpielerLP()<=80)
		{
			count[8]--;
			s1.setSpielerLP(s1.getSpielerLP()+20);
			playerSetup();
			invText();
		}
		else if(count[8]!=0&&s1.getSpielerLP()==100)
		{
			Ende_Text();
		}
		
	}
	
	public void Quit_Game()
	{
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		tagLabel.setVisible(false);
		tagLabelNum.setVisible(false);
		gewLabel.setVisible(false);
		gewLabelNum.setVisible(false);
		gsLabel.setVisible(false);
		gsLabelNum.setVisible(false);
		lpLabel.setVisible(false);
		lpLabelNum.setVisible(false);
		
		position = "Quit_Game";
		
		mainTextArea.setText("Bist du sicher, dass du das Spiel schließen willst?");
		
		wahl4.setText("New Game");
		wahl5.setText("Zurück");
		wahl6.setText("Quit game!");
		
	}
	
	public void verkauf_text()
	{
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		position = "verkauf_text";
		
		if(mainOrt.getOrtTyp() == 's')
		{
			
			mainTextArea.setText("Du bist jetzt in der Stadt!"
					+ "\nHier kannst du deine Sachen verkaufen."
					+ "\nDer Preis für Produkte aus den Dörfern "
					+ "\nwird nach der Entfernung berechnet"
					+ "\nHier sind die Sachen aus dem Dorf (Seite 1)");
			
			wahl1.setText("Weizen");
			wahl2.setText("Mais");
			wahl3.setText("Karfoffeln");
			wahl4.setText("Ruben");
			wahl5.setText("Seite 2");
			wahl6.setText("Ferig fur heute!");
						
		}
		
		else
		{
			mainTextArea.setText("Du bist jetzt im Dorf!"
				+ "\nHier kannst du deine Sachen verkaufen."
				+ "\nDer Preis der Produkte wird nach dem "
				+ "\nInteresse der Dorfbewohner berechnet "
				+ "\nHier sind die Sachen aus der Stadt (Seite 1)");
		
			wahl1.setText("Topfe");
			wahl2.setText("Geschirr");
			wahl3.setText("Hacke");
			wahl4.setText("Hammer");
			wahl5.setText("Seite 2");
			wahl6.setText("Ferig fur heute!");
		}
	}
	
	public void verkauf_text2()
	{
		
		wahl1.setVisible(true);
		wahl2.setVisible(true);
		wahl3.setVisible(true);
		wahl4.setVisible(true);
		wahl5.setVisible(true);
		wahl6.setVisible(true);
		
		position = "verkauf_text2";
		
		
			if(mainOrt.getOrtTyp()=='s') 
			{
				mainTextArea.setText("Du bist jetzt in der Stadt!"
						+ "\nHier kannst du deine Sachen verkaufen."
						+ "\nDer Preis für Produkte aus den Dörfern "
						+ "\nwird nach der Entfernung berechnet"
						+ "\nHier sind die Sachen aus der Stadt (Seite 2)");
			
			
			
			wahl1.setText("Topfe");
			wahl2.setText("Geschirr");
			wahl3.setText("Hacke");
			wahl4.setText("Hammer");
			wahl5.setText("Seite 1");
			wahl6.setText("Ferig fur heute!");
						
			}
		
			else {
				mainTextArea.setText("Du bist jetzt im Dorf!"
						+ "\nHier kannst du deine Sachen verkaufen."
						+ "\nDer Preis der Produkte wird nach dem "
						+ "\nInteresse der Dorfbewohner berechnet "
						+ "\nHier sind die Sachen aus dem Dorf (Seite 2)");
		
			wahl1.setText("Weizen");
			wahl2.setText("Mais");
			wahl3.setText("Karfoffeln");
			wahl4.setText("Ruben");
			wahl5.setText("Seite 1");
			wahl6.setText("Ferig fur heute!");
		
			}
		
		
	}
	
	public void verkauf_stadt(int i)
	{
		int max =-100;
		
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl4.setVisible(false);
	
		position = "verkauf_stadt";
		
		if(orts[2].getOrtDistanz()<orts[3].getOrtDistanz() && orts[2].getOrtDistanz()<orts[4].getOrtDistanz())
		{
			max = orts[2].getOrtDistanz();
		}
		else if(orts[3].getOrtDistanz()<orts[2].getOrtDistanz() && orts[3].getOrtDistanz()<orts[4].getOrtDistanz())
		{
			max = orts[3].getOrtDistanz();
		}
		else if(orts[4].getOrtDistanz()<orts[2].getOrtDistanz() && orts[4].getOrtDistanz()<orts[3].getOrtDistanz())
		{
			max = orts[4].getOrtDistanz();
		}

		double prs = 0;
		if(i<4) 
		{
			prs = Items.Items_list(i).getItemPreis() * (1 + (0.5 * max));
		}
		else
		{
			prs = Items.Items_list(i).getItemPreis() * (1 + pr_item/4);
		}
		
		if(count[i] == 0)
		{
			mainTextArea.setText("Du hast 0 Stück " + Items.Items_list(i).getItemName() + ""
					+ "\nDu kannst nicht Verkaufen!");
			
			wahl5.setVisible(false);
			wahl6.setText("Zuruck");
		}
		else
		{
			mainTextArea.setText("Du hast "+count[i]+ " Stück " + Items.Items_list(i).getItemName() + ""
					+ "\nWillst du es für " + (int)prs + " Goldstücke verkaufen"
							+ "\nDie Entfernung ist: " + max);
			
			wahl5.setText("Ja");
			wahl6.setText("Zurück");
			
		}
		
	}
	
	public void verkauf_dorf(int i)
	{
		
		
		wahl1.setVisible(false);
		wahl2.setVisible(false);
		wahl3.setVisible(false);
		wahl4.setVisible(false);
	
		position = "verkauf_dorf";
		
		int prs = 0;
		prs = Items.Items_list(i).getItemPreis() * (1 + (pr_item/4));
		
		if(count[i] == 0)
		{
			mainTextArea.setText("Du hast 0 Stück " + Items.Items_list(i).getItemName() + ""
					+ "\nDu kannst nicht Verkaufen");
			
			wahl5.setVisible(false);
			wahl6.setText("Zurück");
		}
		else
		{
			mainTextArea.setText("Du hast "+count[i]+ " Stück " + Items.Items_list(i).getItemName() + ""
					+ "\nWillst du es für " + (int)prs + " Goldstücke verkaufen?" + " "
							+ "\nDas Interesse ist: " + pr_item/4);
			
			wahl5.setText("Ja");
			wahl6.setText("Zurück");
			
		}
		
		
	}
	
	public void verkauf_ak_stadt(int i)
	{
		int max =-100;
		
		if(orts[2].getOrtDistanz()<orts[3].getOrtDistanz() && orts[2].getOrtDistanz()<orts[4].getOrtDistanz())
		{
			max = orts[2].getOrtDistanz();
		}
		else if(orts[3].getOrtDistanz()<orts[2].getOrtDistanz() && orts[3].getOrtDistanz()<orts[4].getOrtDistanz())
		{
			max = orts[3].getOrtDistanz();
		}
		else if(orts[4].getOrtDistanz()<orts[2].getOrtDistanz() && orts[4].getOrtDistanz()<orts[3].getOrtDistanz())
		{
			max = orts[4].getOrtDistanz();
		}

		double prs = 0;
		if(i<4) 
		{
			prs = Items.Items_list(i).getItemPreis() * (1 + (0.5 * max));
		}
		else
		{
			prs = Items.Items_list(i).getItemPreis() * (1 + pr_item/4);
		}
		
		s1.setSpielerGS(s1.getSpielerGS()+(int)prs);
		s1.setSpielerKG(s1.getSpielerKG()-Items.Items_list(i).getItemGew());
		count[i]--;
	}
	
	public void verkauf_ak_dorf(int i)
	{
		int prs = 0;
		prs = Items.Items_list(i).getItemPreis() * (1 + (pr_item/4));
		
		s1.setSpielerGS(s1.getSpielerGS()+(int)prs);
		s1.setSpielerKG(s1.getSpielerKG()-Items.Items_list(i).getItemGew());
		count[i]--;
		
	}
	
	public class TitleScreenHandler implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
	
			createScreen();
		}

	}
	
	public class ExitHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}

	}
	
	public class WahlHandler implements ActionListener{
			
		public void actionPerformed(ActionEvent event)
		{
			
			String deinWahl = event.getActionCommand();
			
			
			
			switch(position)
			{
			
				case "firstText":
					switch(deinWahl){
						
						case "w1" : 
							
							if(mainOrt.getOrtTyp()=='s')
								{
								kaufText_Stadt();
									break;
								}
						    else {
						    	kaufText_Dorf();
						    	break;
						    }
					
						case "w2" : verkauf_text();break;
					
						case "w3" : arbeitText_Stadt();break;
						
						case "w4" : invText();  break;
						
						case "w5" : wandernText();break;
						
						case "w6" : Quit_Game();break;
						
					}
					break;
				
				case "contText":
					switch(deinWahl){
					
					case "w1" : 
						
						if(mainOrt.getOrtTyp()=='s')
							{
							kaufText_Stadt();
								break;
							}
					    else {
					    	kaufText_Dorf();
					    	break;
					    }
				
					case "w2" : verkauf_text();break;
				
					case "w3" : arbeitText_Stadt();break;
					
					case "w4" : invText();  break;
					
					case "w5" : wandernText();break;
					
					case "w6" : Quit_Game();break;
					
				}
				break;
					
					
				case "invText" :
					switch(deinWahl)
					{
					case "w1" : break;
					
					case "w2" : Essen();break;
					
					case "w3" : invText_2();break;
					
					case "w4" : contText(); break;
					
					case "w5" : break;
					
					case "w6" : break;
					}
					break;
					
				case "invText_2" :
					switch(deinWahl)
					{
					case "w1" : break;
					
					case "w2" : Essen();break;
					
					case "w3" : invText();break;
					
					case "w4" : contText(); break;
					
					case "w5" : break;
					
					}
					break;
				
				
				case "kaufText_Stadt" :	

					switch(deinWahl)
					{
					
					case "w1" : {
						if(Items.Items_list(4).getItemPreis()<=s1.getSpielerGS() && Items.Items_list(4).getItemGew()<101-s1.getSpielerKG()) {
						count[4]++;
						s1.setSpielerKG(s1.getSpielerKG() + Items.Items_list(4).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(4).getItemPreis());
						playerSetup();
						kaufText_Stadt();
						break;}
						else break;
						
					}

					case "w2" : {
						if(Items.Items_list(5).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(5).getItemGew()<101-s1.getSpielerKG()) {
						count[5]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(5).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(5).getItemPreis());
						playerSetup();
						kaufText_Stadt();
						
						break;}
						else break;
						}
					
					case "w3" : {
						if(Items.Items_list(6).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(6).getItemGew()<101-s1.getSpielerKG()) {
						count[6]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(6).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(6).getItemPreis());
						playerSetup();
						kaufText_Stadt();
						break;
					}
						else break;
						}
										
					case "w4" : {
						if(Items.Items_list(7).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(7).getItemGew()<101-s1.getSpielerKG()) {
						count[7]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(7).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(7).getItemPreis());
						playerSetup();
						kaufText_Stadt();
						
						break;}
						else break;
						}
					
					case "w5" : {
						if(Items.Items_list(8).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(8).getItemGew()<101-s1.getSpielerKG()) {
						count[8]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(8).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(8).getItemPreis());
						playerSetup();
						kaufText_Stadt();
			
						break;}
						else break;
						}
		
					case "w6" : {
								if(s1.getSpielerLP()>5 && s1.getSpielerTag() <= 100)
									{NewTag(1); break;}
									else {Ende_Text();break;}
								}

					}
					break;
	
				case "kaufText_Dorf" :
					switch(deinWahl)
					{
					case "w1" : {
							if(Items.Items_list(0).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(4).getItemGew()<101-s1.getSpielerKG()) {
							count[0]++;
							s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(0).getItemGew());
							s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(0).getItemPreis());
							playerSetup();
							kaufText_Dorf();
					break;}
							else break;
									
					}
					
					case "w2" : {
						if(Items.Items_list(1).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(4).getItemGew()<101-s1.getSpielerKG()) {
						count[1]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(1).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(1).getItemPreis());
						playerSetup();
						kaufText_Dorf();
						
					break;}
					else break;
					}
					case "w3" : {
						if(Items.Items_list(2).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(4).getItemGew()<101-s1.getSpielerKG()) {
						count[2]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(2).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(2).getItemPreis());
						playerSetup();
						kaufText_Dorf();
					break;}
					else break;
					}
						

					case "w4" : {
						if(Items.Items_list(3).getItemPreis()<=s1.getSpielerGS()&& Items.Items_list(4).getItemGew()<101-s1.getSpielerKG()) {
						count[3]++;
						s1.setSpielerKG(s1.getSpielerKG()+ Items.Items_list(3).getItemGew());
						s1.setSpielerGS(s1.getSpielerGS()-Items.Items_list(3).getItemPreis());
						playerSetup();
						kaufText_Dorf();
					break;}
					else break;
				
					}
	
					case "w5" : {
						if(s1.getSpielerLP()>5 && s1.getSpielerTag() <= 100)
						{NewTag(1); break;}
						else {Ende_Text();break;}
					}
					case "w6" : break;
					
					
					}break;
					
				case "Ende_Text" :
					switch(deinWahl)
					{
					case "w5" : NewGame(); break;
					
					case "w6" : EndGameForever();break;
					}
					break;
					
				case "Win_Text" :
					switch(deinWahl)
					{
					case "w5" : NewGame(); break;
					
					case "w6" : EndGameForever();break;
					}
					break;
					
				case  "arbeitText_Stadt" :
					switch(deinWahl)
					{
					case "w4" : if(Arbeit.Arbeit_warsch(pr)==true)
								{
									arbeitFound();
									pr = 1;
									break;
								}
								else
								{								
									arbeitNotFound();
									break;
								}
								
						
	
					case "w5" : contText();break;
					
					}
					break;
					
				case "arbeitFound" :
					switch(deinWahl)
					{
					case "w4" : {
							if(s1.getSpielerLP()>1 && s1.getSpielerTag() <= 100) {
							s1.setSpielerGS(s1.spielerGS = s1.spielerGS + Arbeit.Arbeit_List(1).lohn);
							NewTag(1);
							contText();break;
							}
							else
							{
								Ende_Text();break;
							}
								
							
						}
					
					}
					break;
					
				case "arbeitNotFound" :
					switch(deinWahl)
					{
					case "w4" : {
						
						if(s1.getSpielerLP()>1 && s1.getSpielerTag() <= 100) {
							NewTag(1);
							pr++;
							break;
						}
						
						else
						{
							Ende_Text();break;
						}
						}
					
					}
					break;
					
				case "wandernText" :
					switch(deinWahl)
					{
					case "w1" : {
								  NewTag(orts[0].getOrtDistanz());
								  wandernAction(0);
								  NewTag(orts[0].getOrtDistanz());	  
								  break;
					
								}
					case "w2" : { 
						
						 		  NewTag(orts[1].getOrtDistanz());
								  wandernAction(1);
								  NewTag(orts[1].getOrtDistanz()); 
								  break;
								
						
						}
					case "w3" : { 
						
								  NewTag(orts[2].getOrtDistanz());
								  wandernAction(2);
								  NewTag(orts[2].getOrtDistanz());  
							      break;
							      
						
						}
					case "w4" : { 
						
						 		  NewTag(orts[3].getOrtDistanz());
								  wandernAction(3);
								  NewTag(orts[3].getOrtDistanz());
							      break;}
					case "w5" : { 
								  NewTag(orts[4].getOrtDistanz());
								  wandernAction(4);
								  NewTag(orts[4].getOrtDistanz());
                                  break;}
					
					
					case "w6" : contText();break;
					
					}
					break;
					
				case "Quit_Game":
				{
					switch(deinWahl)
					{
					
					case "w4" : NewGame();break;
					
					case "w5" : {
						
						wahl1.setVisible(true);
						wahl2.setVisible(true);
						wahl3.setVisible(true);
						wahl4.setVisible(true);
						wahl5.setVisible(true);
						wahl6.setVisible(true);
						tagLabel.setVisible(true);
						tagLabelNum.setVisible(true);
						gewLabel.setVisible(true);
						gewLabelNum.setVisible(true);
						gsLabel.setVisible(true);
						gsLabelNum.setVisible(true);
						lpLabel.setVisible(true);
						lpLabelNum.setVisible(true);

						NewTag(0);break;
					}
					
					case "w6" : EndGameForever();break;
					
					
					}
				}break;
				
				case "verkauf_text2" : 
					
					switch(deinWahl)
					{
					case "w1" : {
						
						if(mainOrt.getOrtTyp()=='s')
						{
							in = 4;
							verkauf_stadt(4);break;
						}
						else
						{
							in = 0;
							verkauf_dorf(0);break;
						}

					}
					
					case "w2" : {
						
						if(mainOrt.getOrtTyp()=='s')
						{
							in = 5;
							verkauf_stadt(5);break;
						}
						else
						{
							in = 1;
							verkauf_dorf(1);break;
						}

					}
					
					case "w3" : {
						
						if(mainOrt.getOrtTyp()=='s')
						{
							in = 6;
							verkauf_stadt(6);break;
						}
						else
						{
							in = 2;
							verkauf_dorf(2);break;
						}

					}
					
					case "w4" : {
						
						if(mainOrt.getOrtTyp()=='s')
						{
							in = 7;
							verkauf_stadt(7);break;
						}
						else
						{
							in = 3;
							verkauf_dorf(3);break;
						}

					}
					
					case "w5" : verkauf_text();break;
				
					case "w6" : {
						if(s1.getSpielerLP()>5 && s1.getSpielerTag() <= 100)
						{NewTag(1); break;}
						else {Ende_Text();break;}
						}
					}break;
				
				
				
				case "verkauf_text" :
				
					switch(deinWahl)
					{
						case "w1" : {
							
							if(mainOrt.getOrtTyp()=='s')
							{
								in = 0;
								verkauf_stadt(0);break;
									
							}
							else
							{
								in = 4;
								verkauf_dorf(4);break;
							}
	
						}
						
						case "w2" : {
							
							if(mainOrt.getOrtTyp()=='s')
							{
								in = 1;
								verkauf_stadt(1);break;
							}
							else
							{
								in = 5;
								verkauf_dorf(5);break;
							}
	
						}
						
						case "w3" : {
							
							if(mainOrt.getOrtTyp()=='s')
							{
								in = 2;
								verkauf_stadt(2);break;
							}
							else
							{
								in = 6;
								verkauf_dorf(6);break;
							}
	
						}
						
						case "w4" : {
							
							if(mainOrt.getOrtTyp()=='s')
							{
								in = 3;
								verkauf_stadt(3);break;
							}
							else
							{
								in = 7;
								verkauf_dorf(7);break;
							}
	
						}
						
						case "w5" : verkauf_text2();break;
					
						case "w6" : {
							if(s1.getSpielerLP()>5 && s1.getSpielerTag() <= 100)
							{NewTag(1); break;}
							else {Ende_Text();break;}
						}
					
					}break;
				
				case "verkauf_stadt" :
					
					switch(deinWahl)
					{
						case "w5" : {
							
							verkauf_ak_stadt(in);
							NewTag(0);
							verkauf_text();break;
							
						}
					
						case "w6" : verkauf_text();break;
					
					}break;
					
				case "verkauf_dorf" :
					switch(deinWahl)
					{
					
						case "w5" : {
							
							verkauf_ak_dorf(in);
							NewTag(0);
							verkauf_text();break;
						}
					
						case "w6" : verkauf_text();break;
						
					}break;
			}
		}
	
	}
	
	}