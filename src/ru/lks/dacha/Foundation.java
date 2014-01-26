package ru.lks.dacha;

/**
 * фундамент дома
 * @author constantine
 *
 */

public class Foundation extends Building{

	public Foundation(float lenght) {
		super(lenght);
	}

	@Override
	public float calcPrice() {
		
		price = 10;
		
		return price;
	}

	@Override
	public float calcVolume() {
		volume = length*height*thickness;
		return 0;
	}

	@Override
	public float calcWeight() {
		calcVolume();
		density = 0;
		weight = volume*density;
		return 0;
	}

}
