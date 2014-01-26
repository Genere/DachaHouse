package ru.lks.dacha;

public class Wall extends Building {
	
	public Wall(float lenght){
		super(lenght);
	}
	
	@Override
	public float calcPrice() {
		
		price = 10 + 25;
		
		return price;
	}

	@Override
	public float calcVolume() {
		volume = height*length*thickness;
		return volume;
	}

	@Override
	public float calcWeight() {
		density = 10;
		weight = volume*density;
		return 0;
	}

}
