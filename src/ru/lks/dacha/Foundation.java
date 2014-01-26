package ru.lks.dacha;

import ru.lks.dacha.materials.Material;

/**
 * фундамент дома
 * @author constantine
 *
 */

public class Foundation extends Building{


	/**
	 * конструктор принимает длину, толщину, высоту и материал фундамента
	 * @param lenght
	 * @param thickness
	 * @param height
	 * @param material
	 */
	
	public Foundation(float lenght, float thickness, float height, Material material) {
		super(lenght, thickness, height, material);
	}
	
	@Override
	public float calcPrice() {
		price = weight*material.getPrice();
		return price;
	}

	@Override
	public float calcVolume() {
		volume = length*height*thickness;
		return volume;
	}

	@Override
	public float calcWeight() {
		weight = volume*material.getDensity();
		return weight;
	}

}
