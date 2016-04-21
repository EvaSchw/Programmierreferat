package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import exceptions.HerstellerNullException;
import exceptions.PreisUnterNullException;
import klassen.Fahrzeug;
import klassen.Motorrad;
import klassen.PKW;

public class StreamsDemo {
	
public static void main(String[] args) {
	List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
	try {
		fahrzeuge.add(new PKW("BMW", 100, 10000, 3));
		fahrzeuge.add(new PKW("KIA", 90, 8000, 5));
		fahrzeuge.add(new Motorrad("Toyota", 80, 9000));
		fahrzeuge.add(new PKW("Porsche", 150, 15000, 2));
		fahrzeuge.add(new PKW("BMW", 110, 11000, 5));
		fahrzeuge.add(new PKW("Tesla", 700, 120000, 5));
		fahrzeuge.add(new PKW("KIA", 60, 10000, 5));
		fahrzeuge.add(new Motorrad("Toyota", 80, 9000));
		fahrzeuge.add(new PKW("Porsche", 150, 15000, 2));
		fahrzeuge.add(new PKW("Mercedes", 110, 71000, 5));
	} catch (HerstellerNullException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (PreisUnterNullException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Map<Integer, List<Fahrzeug>> collect = fahrzeuge.stream().collect(Collectors.groupingBy(f -> f.getLeistung()));
	System.out.println(collect.get(100));
}

}
