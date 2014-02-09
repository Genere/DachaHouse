/**
 * 
 */
package ru.lks.dacha.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

	ApplicationContext apCon;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
//		apCon = new ClassPathXmlApplicationContext("/SpringDescriptors/dacha.xml");
		apCon = new ClassPathXmlApplicationContext("SpringDescriptors/dacha.xml");
	}
	
	@Test
	public void springTest(){
		Building house = (Building)apCon.getBean("house");
		house.getBuildParameters();
		Building found = (Building)apCon.getBean("found");
		Building outWall = (Building)apCon.getBean("outWalls");
		Building floor1 = (Building)apCon.getBean("floor1");
		Building floor2 = (Building)apCon.getBean("floor2");
		

		System.out.println("Вес фундамента: " + found.getWeight() + " кг");
		System.out.println("Цена фундамента: " + found.getPrice() + " руб.");
		
		System.out.println("Вес перекрытия цоколя: " + floor1.getWeight() + " кг");
		System.out.println("Цена перекрытия цоколя: " + floor1.getPrice() + " руб.");
		
		System.out.println("Вес перекрытия первого этажа: " + floor2.getWeight() + " кг");
		System.out.println("Цена перекрытия первого этажа: " + floor2.getPrice() + " руб.");
		
		System.out.println("Вес несущих стен: " + outWall.getWeight() + " кг");
		System.out.println("Цена несущих стен: " + outWall.getPrice() + " руб.");
		
		System.out.println("Вес дома " + house.getWeight() + " кг");
		System.out.println("Цена дома " + house.getPrice() + " руб.");
	}
	
	@Ignore
	@Test
	public void test() {
		Building house = new DachaHouse(new Square(9, 10));
		
		Material cement = new Cement(1000, 6);
		Building found = new Foundation(43, 0.4f, 1.2f, cement);//фундамент
		Building outWall = new Walls(); //все несущие стены дома
		Building floor1 = new Floor(new Square(9, 10), 0.2f, cement);	//перекрытие 1го этажа
		Building floor2 = new Floor(new Square(9, 10), 0.2f, cement); //перекрытие 2го этажа
		
//		Material wallMaterial = new Breack(2000, 2);
		Material wallMaterial = new Breack(500, 6.5f);
		//построение внешних стен первого этажа
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		
		//построение внешних стен второго этажа
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		outWall.addHouseUnits(new Wall(10f, 0.4f, 2.8f, wallMaterial));
		
		//построение дома
		house.addHouseUnits(found);	
		house.addHouseUnits(outWall);
		house.addHouseUnits(floor1);
		house.addHouseUnits(floor2);
		
		house.getBuildParameters();
		
		System.out.println("Вес фундамента: " + found.getWeight() + " кг");
		System.out.println("Цена фундамента: " + found.getPrice() + " руб.");
		
		System.out.println("Вес перекрытия цоколя: " + floor1.getWeight() + " кг");
		System.out.println("Цена перекрытия цоколя: " + floor1.getPrice() + " руб.");
		
		System.out.println("Вес перекрытия первого этажа: " + floor2.getWeight() + " кг");
		System.out.println("Цена перекрытия первого этажа: " + floor2.getPrice() + " руб.");
		
		System.out.println("Вес несущих стен: " + outWall.getWeight() + " кг");
		System.out.println("Цена несущих стен: " + outWall.getPrice() + " руб.");
		
		System.out.println("Вес дома " + house.getWeight() + " кг");
		System.out.println("Цена дома " + house.getPrice() + " руб.");
	}
	
	@Ignore
	@Test
	public void test2(){
		Material cement = new Cement(1000, 6);
		Building found = new Foundation(43, 0.4f, 1.2f, cement);
		System.out.println("Вес фундамента: " + found.getWeight() + " кг");
		System.out.println("Цена фундамента: " + found.getPrice() + " руб.");
		
		
		
		Building floor1 = new Floor(new Square(9, 10), 0.3f, cement);
		System.out.println("Вес перекрытия: " + floor1.getWeight() + " кг");
		System.out.println("Цена перекрытия: " + floor1.getPrice() + " руб.");
	}

}
