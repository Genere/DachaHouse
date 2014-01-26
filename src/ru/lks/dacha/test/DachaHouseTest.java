package ru.lks.dacha.test;

import ru.lks.dacha.*;
import ru.lks.dacha.materials.Cement;

public class DachaHouseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Building house = new DachaHouse(new Square(9, 10));
		
		Building found = new Foundation(43, 0.4f, 1.2f, new Cement(10, 10));//фундамент
		Building outWall = new Walls(); //все несущие стены дома
		Building floor1 = new Floor(new Square(9, 10));	//перекрытие 1го этажа
		Building floor2 = new Floor(new Square(9, 10)); //перекрытие 2го этажа
		
		//построение стен
		outWall.addHouseUnits(new Wall(10f));
		outWall.addHouseUnits(new Wall(9f));
		outWall.addHouseUnits(new Wall(9f));
		outWall.addHouseUnits(new Wall(10f));
		
		//построение дома
		house.addHouseUnits(found);	
		house.addHouseUnits(outWall);
		house.addHouseUnits(floor1);
		house.addHouseUnits(floor2);
		
		
		System.out.println(house.getPrice());
		System.out.println(house.getWeight());

	}

}
