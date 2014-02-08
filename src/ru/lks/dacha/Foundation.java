package ru.lks.dacha;

import ru.lks.dacha.materials.Material;

/**
 * фундамент дома
 * @author constantine
 *
 */

public class Foundation extends PlainBuilding{


	/**
	 * конструктор принимает длину, толщину, высоту и материал фундамента
	 * @param lenght
	 * @param thickness
	 * @param height
	 * @param material
	 */
	
	public Foundation(float length, float thickness, float height, Material material) {
		super(length, thickness, height, material);
	}

}
