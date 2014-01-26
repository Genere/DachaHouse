package ru.lks.dacha.materials;

import java.util.ArrayList;
import java.util.List;

import ru.lks.dacha.Building;

/**
 * класс для реализации паттерна компоновщик для материалов
 * @author constantine
 *
 */

public abstract class  Material {
	
	/**
	 * список составляющих материала
	 */
	protected List<Material> materialParts = new ArrayList<Material>();

	/**
	 * плотность материала конструкции
	 */
	protected float density;
	
	/**
	 * цена материала за единицу измерения
	 */
	protected float price;
	
	public Material(){
		
	}
	
	/**
	 * конструктор принимает плотность материала и цену за единицу измерения
	 * @param density
	 * @param price
	 */
	
	public Material(float density, float price){
		this.density = density;
		this.price = price;
	}
	
	/**
	 * добавление новой составляющей к материалу
	 * @param material
	 */
	
	public void addMaterialParts(Material material) {
		materialParts.add(material);
	}
	
	public abstract void calcPrice();

	public float getDensity() {
		return density;
	}

	public float getPrice() {
		return price;
	}
	
}
