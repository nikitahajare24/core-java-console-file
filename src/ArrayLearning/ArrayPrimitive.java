package ArrayLearning;

public class ArrayPrimitive {

	public static void main(String args[]) {
		int[]rollNumber = new int [10];//Array
		for (int i=0;i<10;i++)
		{
			rollNumber[i]=i+100;
		}
		String[]names= new String[10];
		        names[0]="A";
				names[1]="B";
				names[2]="C";
				names[3]="D";
				names[4]="E";
				names[5]="F";
				names[6]="G";
				names[7]="H";
				names[8]="I";
				names[9]="J";
				
				
				String[]adress= new String[10];
				adress[0]="Pune";
			    adress[1]="Khed";
				adress[2]="Nagar";
				adress[3]="Baramati";
				adress[4]="Sambhajinagar";
				adress[5]="Nagpur";
				adress[6]="Junnar";
				adress[7]="Buldhana";
				adress[8]="Beed";
				adress[9]="Dhule";
				for(int i=0;i<10;i++)
				{
					System.out.println("\nRollNumber:"+rollNumber[i]+""+"\nName:"+names[i]+"\nAdress:"+adress[i]);
					
				}
	       }
	}
