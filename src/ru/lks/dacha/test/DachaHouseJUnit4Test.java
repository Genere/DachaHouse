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
import ru.lks.dacha.Square;
import ru.lks.dacha.Wall;
import ru.lks.dacha.Walls;
import ru.lks.dacha.materials.Cement;

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
		
		house.getBuildParameters();
		
		System.out.println(house.getPrice());
		System.out.println(house.getWeight());
	}
	
	@Test
	public void test2(){
		Building found = new Foundation(43, 0.4f, 1.2f, new Cement(10, 10));
		System.out.println("Вес фундамента: " + found.getWeight());
	}

}
