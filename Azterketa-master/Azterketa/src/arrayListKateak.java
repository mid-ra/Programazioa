import java.util.ArrayList;
import java.util.Scanner;

public class arrayListKateak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner (System.in);
		ArrayList <String> arrayListString=new ArrayList<String>();/*Komando honekin deklaratzen 
		dira arrayList bakoitza*/
		String katea;
		System.out.println("Sartu katea: ");
		katea=teklatua.nextLine();
		
		while(!katea.equals("")) {/*String-ak ezin dira int edo double bezala kondizionatu,
		beraz, string-a hutsa ez den bitartean buklean sartzeko jarri behar den 
		kondizioa horrela jarri behar da*/
			arrayListString.add(katea);
			System.out.println("Sartu katea: ");
			katea=teklatua.nextLine();
		}
		teklatua.close();
		System.out.println(arrayListString);
		

	}

}
