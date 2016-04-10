package Java7;
import java.util.Scanner;

public class SwitchAufStringsDemo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String eingabe;
		
		while(true){
			eingabe = in.nextLine();
			
			if(eingabe.equalsIgnoreCase("STARTEN")){
				System.out.println("Programm gestartet...");
			} else if (eingabe.equalsIgnoreCase("STOPPEN")){
				System.out.println("Programm gestoppt...");
				break;
			} else {
				System.out.println("irgendwas anderes...");
			}
		}
		in.close();
	}
}
