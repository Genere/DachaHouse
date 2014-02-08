package ru.lks.dacha;

import java.util.ArrayList;
import java.util.List;

import ru.lks.dacha.materials.Cement;
import ru.lks.dacha.materials.Material;

/**
 * Интерфейс для поддержания иерархии часть-целое. 
 * Паттерн Компоновщик
 * @author constantine
 *
 */

public abstract class Building {
	 
	protected float height;
	protected float thickness; //толщина
	protected float length;
	
	protected Square square;//площадь
	protected Material material; //материал, из которого изготовлена конструкция 
	protected float weight;//вес
	protected float volume;//объем

	
	public float getVolume() {
		return volume;
	}

	protected float price;
	
	protected List<Building> houseUnits = new ArrayList<Building>();
	
	public Building(){
		
	}
	
	public Building(float lenght){
		this.length = lenght;
		calcVolume();
		calcWeight();
		calcPrice();
	}
	
	public Building(float length, float thickness, float height){
		this.length = length;
		this.height = height;
		this.thickness = thickness;
		calcVolume();
		calcWeight();
		calcPrice();
	}
	
	public Building(Square square){
		this.square = square;
		calcVolume();
		calcWeight();
		calcPrice();
	}
	/**
	 * конструктор принимает длину, толщину, высоту и материал конструкции
	 * @param length
	 * @param thickness
	 * @param height
	 * @param material
	 */
	public Building(float length, float thickness, float height, Material material) {
		this.length = length;
		this.height = height;
		this.thickness = thickness;
		this.material = material;
		
		calcVolume();
		calcWeight();
		calcPrice();
	}

	public Building(Square square, float thickness, Material material) {
		this.square = square;
		this.thickness = thickness;
		this.material = material;
		calcVolume();
		calcWeight();
		calcPrice();
	}

	protected abstract float calcPrice();
	
	protected abstract float calcWeight();
	
	protected abstract float calcVolume();

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
	
	public void getBuildParameters(){
		calcVolume();
		calcWeight();
		calcPrice();
	}

}
