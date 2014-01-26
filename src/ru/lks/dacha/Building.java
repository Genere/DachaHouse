package ru.lks.dacha;

import java.util.ArrayList;
import java.util.List;

/**
 * Интерфейс для поддержания иерархии часть-целое. 
 * Паттерн Компоновщик
 * @author constantine
 *
 */

public abstract class Building {
	 
	protected float height = 2.8f;
	protected float thickness; //толщина
	protected float length;
	
	protected Square square;//площадь
	protected float weight;//вес
	protected float volume;//объем
	protected float density; //плотность
	
	protected float price;
	
	protected List<Building> houseUnits = new ArrayList<Building>();
	
	public Building(){
		
	}
	
	public Building(float lenght){
		this.length = lenght;
	}
	
	public Building(Square square){
		this.square = square;
	}
	
	public abstract float calcPrice();
	
	public abstract float calcWeight();
	
	public abstract float calcVolume();

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Building> getHouseUnits() {
		return houseUnits;
	}

	public void setHouseUnits(List<Building> houseUnit) {
		this.houseUnits = houseUnit;
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void addHouseUnits(Building unit){
		houseUnits.add(unit);
	}

}
