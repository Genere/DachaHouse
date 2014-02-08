package ru.lks.dacha;

import ru.lks.dacha.materials.Cement;
import ru.lks.dacha.materials.Material;

public class Wall extends PlainBuilding {
	
	/**
	 * конструктор принимает длину
	 * @param length
	 */
	public Wall(float length, float thickness, float height, Material material){
		super(length, thickness, height, material);
	}
	

}
