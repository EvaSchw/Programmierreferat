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
		
		
		
		for(Fahrzeug z: fahrzeuge)
			System.out.println(z);
	}

}
