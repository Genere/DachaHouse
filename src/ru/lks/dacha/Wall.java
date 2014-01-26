package ru.lks.dacha;

import ru.lks.dacha.materials.Cement;

public class Wall extends Building {
	
	
	public Wall(float length){
		super(length, 0.1f, 2.8f, new Cement(10,10));
	}
	
	@Override
	protected float calcPrice() {
		
		price = 10 + 25;
		
		return price;
	}

	@Override
	protected float calcVolume() {
		volume = height*length*thickness;
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
