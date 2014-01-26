package ru.lks.dacha;

import ru.lks.dacha.materials.Cement;

public class Floor extends Building {
	

	public Floor(Square square){
		super(square, new Cement(10,10));
	}

	@Override
	protected float calcPrice() {
		// TODO Auto-generated method stub
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
