package ru.lks.dacha;

import ru.lks.dacha.materials.Cement;
import ru.lks.dacha.materials.Material;

public class Floor extends PlainBuilding {
	

	public Floor(Square square, float thickness, Material material){
		super(square, thickness, material);
	}
	
	@Override
	protected float calcVolume() {
		volume = square.getSquare()*thickness;
		return volume;
	}
}
