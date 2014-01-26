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
	protected float calcPrice() {
		price = weight*material.getPrice();
		return price;
	}

	@Override
	protected float calcVolume() {
		volume = length*height*thickness;
		return volume;
	}

	@Override
	protected float calcWeight() {
		if(material != null) {
			weight = volume*material.getDensity();	
		}
		return weight;
	}

}
