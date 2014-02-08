/**
 * 
 */
package ru.lks.dacha.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ru.lks.dacha.Building;
import ru.lks.dacha.DachaHouse;
import ru.lks.dacha.Floor;
import ru.lks.dacha.Foundation;
import ru.lks.dacha.OutWall;
import ru.lks.dacha.Square;
import ru.lks.dacha.Wall;
import ru.lks.dacha.Walls;
import ru.lks.dacha.materials.Breack;
import ru.lks.dacha.materials.Cement;
import ru.lks.dacha.materials.Material;

/**
 * @author constantine
 *
 */
public class DachaHouseJUnit4Test {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Building house = new DachaHouse(new Square(9, 10));
		
		Material cement = new Cement(1000, 6);
		Building found = new Foundation(43, 0.4f, 1.2f, cement);//фундамент
		Building outWall = new Walls(); //все несущие стены дома
		Building floor1 = new Floor(new Square(9, 10), 0.3f, cement);	//перекрытие 1го этажа
		Building floor2 = new Floor(new Square(9, 10), 0.3f, cement); //перекрытие 2го этажа
		
		Material breack = new Breack(2000, 2);
		//построение внешних стен первого этажа
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		
		//построение внешних стен второго этажа
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, breack));
		
		//построение дома
		house.addHouseUnits(found);	
		house.addHouseUnits(outWall);
		house.addHouseUnits(floor1);
		house.addHouseUnits(floor2);
		
		house.getBuildParameters();
		
		System.out.println("Вес дома " + house.getWeight() + " кг");
		System.out.println("Цена дома " + house.getPrice() + " руб.");
	}
	
	@Test
	public void test2(){
		Building found = new Foundation(43, 0.4f, 1.2f, new Cement(1000, 6));
		System.out.println("Вес фундамента: " + found.getWeight() + " кг");
		System.out.println("Цена фундамента: " + found.getPrice() + " руб.");
		
		
		Material cement = new Cement(1000, 6);
		Building floor1 = new Floor(new Square(9, 10), 0.3f, cement);
		System.out.println("Вес перекрытия: " + floor1.getWeight() + " кг");
		System.out.println("Цена перекрытия: " + floor1.getPrice() + " руб.");
	}

}
