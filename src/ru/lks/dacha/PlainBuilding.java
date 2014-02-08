package ru.lks.dacha;

import ru.lks.dacha.materials.Material;

public class PlainBuilding extends Building {

	public PlainBuilding(float length, float thickness, float height, Material material) {
		super(length, thickness, height, material);
	}

	public PlainBuilding(Square square, float thickness, Material material) {
		super(square, thickness, material);
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
