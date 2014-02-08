package ru.lks.dacha.test;

import ru.lks.dacha.*;
import ru.lks.dacha.materials.Breack;
import ru.lks.dacha.materials.Cement;
import ru.lks.dacha.materials.Material;

public class DachaHouseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Building house = new DachaHouse(new Square(9, 10));
		
		Material cement = new Cement(1000, 6);
		Building found = new Foundation(43, 0.4f, 1.2f, cement);//фундамент
		Building outWall = new Walls(); //все несущие стены дома
		Building floor1 = new Floor(new Square(9, 10), 0.3f, cement);	//перекрытие 1го этажа
		Building floor2 = new Floor(new Square(9, 10), 0.3f, cement); //перекрытие 2го этажа
		
		Material breack = new Breack(10, 10);
		//построение стен
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		
		//построение дома
		house.addHouseUnits(found);	
		house.addHouseUnits(outWall);
		house.addHouseUnits(floor1);
		house.addHouseUnits(floor2);
		
		
		System.out.println(house.getPrice());
		System.out.println(house.getWeight());

	}

}
