import java.util.Scanner;

class Marvel
{  
	int hpa,hpv;
	String na,nv;
	String cana1,cana2,cana3,cana4;
	String cvnv1,cvnv2,cvnv3,cvnv4;
	int caa1,caa2,caa3,caa4;
	int cvv1,cvv2,cvv3,cvv4;
	String choicea,choicev;

	Scanner sc = new Scanner(System.in);

	public void setChar()
	{
		System.out.println("Marvel Avenger List : ");
		System.out.println("(1)Iron Man");
		System.out.println("(2)Hulk");
		System.out.println("(3)Thor");
		System.out.println("(4)Captain America");
		System.out.println("(5)Customize Avenger");
		System.out.print("\nChoose Your Marvel Avenger (Number): ");
		choicea=sc.nextLine();

	}

	public void getChar()
	{
    	if(choicea.compareTo("1")==0)
	    {
	    	System.out.println("\nAvenger Choosen : Iron Man");
	    	hpa=220;
	    }
    	else if(choicea.compareTo("2")==0)
    	{
    		System.out.println("\nAvenger Choosen : Hulk");
    		hpa=300;
    	}
    	else if(choicea.compareTo("3")==0)
    	{
    		System.out.println("\nAvenger Choosen : Thor");
    		hpa=200;
    	}
    	else if(choicea.compareTo("4")==0)
    	{
    		System.out.println("\nAvenger Choosen : Captain America");
   			hpa=260;
    	}
    	else if(choicea.compareTo("5")==0)
    	{
    		System.out.println("\nCustomize Avenger : ");
		    System.out.print("Enter Avenger Name (EX : Your Name) : ");
		    na=sc.nextLine();
		    System.out.print("Enter Avenger Hitpoints (Number): ");
		    hpa=sc.nextInt();sc.nextLine();
		    
		    System.out.print("Enter Name of Attack 1 (EX : Thunder) : ");
		    cana1=sc.nextLine();
		    System.out.print("Enter Damage of Attack 1 (Number): ");
		    caa1=sc.nextInt();sc.nextLine();
		    
		    System.out.print("Enter Name of Attack 2 (EX : Telepathy) : ");
		    cana2=sc.nextLine();
		    System.out.print("Enter Damage of Attack 2 (Number): ");
		    caa2=sc.nextInt();sc.nextLine();
		    
		    System.out.print("Enter Name of Attack 3 (EX : Flamethrower) : ");
		    cana3=sc.nextLine();
		    System.out.print("Enter Damage of Attack 3 (Number): ");
		    caa3=sc.nextInt();sc.nextLine();

		    System.out.print("Enter Name of Attack 4 (EX : Punch) : ");
		    cana4=sc.nextLine();
		    System.out.print("Enter Damage of Attack 4 (Number): ");
		    caa4=sc.nextInt();sc.nextLine();
    	}
    	else
    	{
    		System.out.println("Wrong Input");
    		System.out.println("Try Again!!!");
    		setChar();
    		getChar();
    	}
    }

    public void setVill()
    {
	   	System.out.println("\nMarvel Villain List : ");
	    System.out.println("(1)Thanos");
	    System.out.println("(2)Loki");
	   	System.out.println("(3)Customize Villain");
	    System.out.print("\nChoose Your Marvel Villain (Number): ");
	    choicev=sc.nextLine();
    }


	public void getVill()
	{
    	if(choicev.compareTo("1")==0)
	    {
	    	System.out.println("\nVillain Choosen : Thanos");
	    	hpv=480;
	    }
    	else if(choicev.compareTo("2")==0)
    	{
    		System.out.println("\nVillain Choosen : Loki");
    		hpv=240;
    	}
    	else if(choicev.compareTo("3")==0)
    	{
    		System.out.println("\nCustomize Villain : ");
		    System.out.print("Enter Villain Name (EX : Enemy): ");
		    nv=sc.nextLine();
		    System.out.print("Enter Villain Hitpoints (Number): ");
		    hpv=sc.nextInt();sc.nextLine();

		    System.out.print("Enter Name of Attack 1 (EX : Kick) : ");
		    cvnv1=sc.nextLine();
		    System.out.print("Enter Damage of Attack 1 (Number): ");
		    cvv1=sc.nextInt();sc.nextLine();

		    System.out.print("Enter Name of Attack 2 (EX : Uppercut) : ");
		    cvnv2=sc.nextLine();
		    System.out.print("Enter Damage of Attack 2 (Number): ");
		    cvv2=sc.nextInt();sc.nextLine();

		    System.out.print("Enter Name of Attack 3 (EX : Takedown) : ");
		    cvnv3=sc.nextLine();
		    System.out.print("Enter Damage of Attack 3 (Number): ");
		    cvv3=sc.nextInt();sc.nextLine();

		    System.out.print("Enter Name of Attack 4 (EX : Smash) : ");
		    cvnv4=sc.nextLine();
		    System.out.print("Enter Damage of Attack 4 (Number): ");
		    cvv4=sc.nextInt();sc.nextLine();
    	}
    	else
    	{
    		System.out.println("Wrong Input");
    		System.out.println("Try Again!!!");
    		setVill();
    		getVill();
    	}
	}
}


class Fight extends Marvel
{
	int a1,a2,a3,a4;
	int v1,v2,v3,v4;
	float a,b;
	String avg,vill;
	String na1,na2,na3,na4;
	String nv1,nv2,nv3,nv4;
	String choice;

	void matchup()
	{
		setChar();
		getChar();
		setVill();
		getVill();

		if(choicea.compareTo("1")==0)//Initialize Values When Avenger==Iron Man
		{
			avg="Iron Man";
			na1="Laser Beam";
			na2="Power Drive";
			na3="Thruster Uppercut";
			na4="Repulsor Shot";
			a1=80;
		    a2=60;
		    a3=40;
		    a4=20;
		}
		else if(choicea.compareTo("2")==0)//Initialize Values When Avenger==Hulk
		{
			avg="Hulk";
			na1="Aftershock";
			na2="Meteor";
			na3="Gamma Crusher";
			na4="Tectonic Fury";
		    a1=20;
		    a2=80;
		    a3=40;
		    a4=60;
		}
		else if(choicea.compareTo("3")==0)//Initialize Values When Avenger==Thor
		{
			avg="Thor";
			na1="Bring The Thunder";
			na2="Thunderstruck";
			na3="Crack The Sky";
			na4="Falling Star";
			a1=60;
		    a2=80;
		    a3=20;
		    a4=40;
		}
		else if(choicea.compareTo("4")==0)//Initialize Values When Avenger==Captain America
		{
			avg="Captain America";
			na1="Shield Bash";
			na2="Soldier's Slam";
			na3="Grand Slam";
			na4="Rising Hope";
			a1=80;
		    a2=40;
		    a3=20;
		    a4=60;
		}
		else if(choicea.compareTo("5")==0)//Initialize Values When Avenger==Customize Avenger
		{
			avg=na;
			na1=cana1;
			na2=cana2;
			na3=cana3;
			na4=cana4;
		    a1=caa1;
		    a2=caa2;
		    a3=caa3;
		    a4=caa4;
		}
		else
		{
			//Nothing wont come in this else
		}


		if(choicev.compareTo("1")==0)//Initialize Values When Villain==Thanos
		{
			vill="Thanos";
			nv1="Palm Breaker";
			nv2="Titan's Gaze";
			nv3="Insolence Crusher";
			nv4="Hand Bomb";
			v1=30;
		    v2=10;
		    v3=20;
		    v4=15;
		}
		else if(choicev.compareTo("2")==0)//Initialize Values When Villain==Loki
		{
			vill="Loki";
			nv1="Energy Blast";
			nv2="Scepter";
			nv3="Hypnosis";
			nv4="Telekinesis";
		    v1=50;
		    v2=30;
		    v3=20;
		    v4=35;
		}
		else if(choicev.compareTo("3")==0)//Initialize Values When Villain==Customize Villain
		{
			vill=nv;
			nv1=cvnv1;
			nv2=cvnv2;
			nv3=cvnv3;
			nv4=cvnv4;
			v1=cvv1;
			v2=cvv2;
			v3=cvv3;
			v4=cvv4;
		}
		else
		{
			//Nothing wont come in this else
		}
	}

	void fightScene()//Main Loop Hearth of Program
	{
		System.out.println("\n"+avg+" vs "+vill);
		System.out.println(avg+" Attacks");
		System.out.println("(1)."+na1);
		System.out.println("(2)."+na2);
		System.out.println("(3)."+na3);
		System.out.println("(4)."+na4);
		System.out.println("\n"+avg+"'s Base HP is "+hpa);
		System.out.println(vill+"'s Base HP is "+hpv);
		//Main Loop
		while(hpa>0||hpv>0)
		{
			System.out.print("\nEnter Attack Choice (Number) : ");
			choice=sc.nextLine();

			switch(choice)
			{
				case "1":
						hpa=hpa-v1;
						hpv=hpv-a1;
						a=hpv;
						b=hpa;
						System.out.println("\n"+avg+" Used "+na1);
						if(a<0)
						{
							System.out.println(vill+"'s HP Left : 0");
						}
						else
						{
							System.out.println(vill+"'s HP Left : "+hpv);
						}
						System.out.println("\n"+vill+" Used "+nv1);
						if(b<0)
						{
							System.out.println(avg+"'s HP Left : 0");
						}
						else
						{
							System.out.println(avg+"'s HP Left : "+hpa);
						}
						break;

				case "2":
						hpa=hpa-v2;
						hpv=hpv-a2;
						a=hpv;
						b=hpa;
						System.out.println("\n"+avg+" Used "+na2);
						if(a<0)
						{
							System.out.println(vill+"'s HP Left : 0");
						}
						else
						{
							System.out.println(vill+"'s HP Left : "+hpv);
						}
						System.out.println("\n"+vill+" Used "+nv2);
						if(b<0)
						{
							System.out.println(avg+"'s HP Left : 0");
						}
						else
						{
							System.out.println(avg+"'s HP Left : "+hpa);
						}
						break;
				case "3":
						hpa=hpa-v3;
						hpv=hpv-a3;
						a=hpv;
						b=hpa;
						System.out.println("\n"+avg+" Used "+na3);
						if(a<0)
						{
							System.out.println(vill+"'s HP Left : 0");
						}
						else
						{
							System.out.println(vill+"'s HP Left : "+hpv);
						}
						System.out.println("\n"+vill+" Used "+nv3);
						if(b<0)
						{
							System.out.println(avg+"'s HP Left : 0");
						}
						else
						{
							System.out.println(avg+"'s HP Left : "+hpa);
						}
						break;
				case "4":
						hpa=hpa-v4;
						hpv=hpv-a4;
						a=hpv;
						b=hpa;
						System.out.println("\n"+avg+" Used "+na4);
						if(a<0)
						{
							System.out.println(vill+"'s HP Left : 0");
						}
						else
						{
							System.out.println(vill+"'s HP Left : "+hpv);
						}
						System.out.println("\n"+vill+" Used "+nv4);
						if(b<0)
						{
							System.out.println(avg+"'s HP Left : 0");
						}
						else
						{
							System.out.println(avg+"'s HP Left : "+hpa);
						}
						break;
				//Cheat Code Hidden Cases
				case "H":
						hpa=hpa+100;
						System.out.println("\nCheat Code Activated");
						System.out.println("Avenger's HP increased");
						System.out.println(avg+"'s HP Left : "+hpa);
						break;
				case "X":
						hpv=0;
						System.out.println("\nCheat Code Activated");
						System.out.println(vill+"'s HP Left : 0");
						break;
			}
			//Result Interpreter
			if(hpv<=0 && hpa<=0)
			{
				System.out.println("\n"+avg+" and "+vill+" Killed Each Other");
				System.out.println("It's A Tie!!!!!");
				break;
			}
			else if(hpa<=0)
		    {
		    	System.out.println("\n"+vill+" Killed "+avg);
		    	System.out.println("Sorry You Lost!!!!");
		    	break;
		    }
			else if(hpv<=0)
		    {
		    	System.out.println("\n"+avg+" Killed "+vill);
		    	System.out.println("Congratulations You Won!!!!!");
		    	break;
		    }
		}
	}

}

class Avengers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String choicemm;
	    
		do
		{
			System.out.println("\n\t\t\t\t\t\tMain Menu");
			System.out.println("(1)Play Game");
			System.out.println("(2)Game Guide");
			System.out.println("(3)Battle Log");
			System.out.println("(4)Cheat Codes");
			System.out.println("(5)Rate Game");
			System.out.println("(6)Credits");
			System.out.println("(7)Exit Game");
			System.out.print("\nEnter Your Action from Main Menu : ");
			choicemm=sc.nextLine();
			System.out.println("");

			switch (choicemm)
			{
			case "1":
				Fight f1 = new Fight();
			    f1.matchup();
			    f1.fightScene();
			case "2":
				//Game Guide Database Connectivity
			    break;
			case "3":
				//Battle Log Database Connectivity
			    break;
			case "4":
				//Cheat Code Retrieval System
			    break;
			case "5":
				//rate Game
			    break;
			case "6":
			    System.out.println("Credits : ");
			    System.out.println("Project By : Mihir Rajesh Panchal");
			    System.out.println("Project Name : Marvel Avengers Fighting Simulator Game");
			    System.out.println("SAP ID : 57498200018");
			    System.out.println("Roll No : T018");
			    System.out.println("Written In : Java");
			    break;
			case "7":
					System.exit(0);
					break;
			default:
				    System.out.println("Wrong Input");
				    System.out.println("Try Again!!!");
				    break;
			}
		}while(choicemm!="7");
	}
}