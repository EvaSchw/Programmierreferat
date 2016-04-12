import java.util.ArrayList;
import java.util.List;

import Java8.FilterFunktion;
import Java8.Filtern;
import exception.HerstellerNullException;
import exceptions.PreisUnterNullException;
import klassen.Fahrzeug;
import klassen.Motorrad;
import klassen.PKW;

public class Start
{
	public static void main(String[] args) throws HerstellerNullException, PreisUnterNullException
	{
		List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
		fahrzeuge.add(new PKW("BMW", 100, 10000, 3));
		fahrzeuge.add(new PKW("KIA", 90, 8000, 5));
		fahrzeuge.add(new Motorrad("Toyota", 80, 9000));
		fahrzeuge.add(new PKW("Porsche", 150, 15000, 2));
		fahrzeuge.add(new PKW("BMW", 110, 11000, 5));
		
		//1. Variante
//		Filtern.filterMotorrad(fahrzeuge);
//		2. Variante
//		Filtern.filterInterface(fahrzeuge, new FilterFunktion()
//		{
//			@Override
//			public boolean erfuelltFilterKriterium(Fahrzeug f)
//			{
//				return (f.getPreis() < 10000);
//			}
//		});
		
		//Variante Mit Lambda-Expression
//		Filtern.filterInterface(fahrzeuge, f -> f.getLeistung() >= 100);
		
		//Methoden-Referencen-Vergleich
//		Filtern.filterInterface(fahrzeuge, f -> f.getHersteller() == "BMW" || f.getHersteller() == "Audi"
//											|| f.getHersteller() == "Mercedes");
		
		//Methode verwenden
		Filtern.filterInterface(fahrzeuge, Filtern::istVonDeutschemHersteller);
		
		for(Fahrzeug z: fahrzeuge)
			System.out.println(z);
	}

}
