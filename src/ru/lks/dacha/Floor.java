package ru.lks.dacha;

public class Floor extends Building {
	

	public Floor(float lenght) {
		super(0);
	}
	
	public Floor(Square square){
		super(square);
	}

	@Override
	public float calcPrice() {
		// TODO Auto-generated method stub
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
