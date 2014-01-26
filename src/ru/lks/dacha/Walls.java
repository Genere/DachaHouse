package ru.lks.dacha;

public class Walls extends Building {

	@Override
	public float calcPrice() {
		for(Building unit : houseUnits){
			price += unit.calcPrice();
		}
		return price;
	}

	@Override
	public float calcVolume() {
		for(Building unit : houseUnits){
			volume += unit.calcVolume();
		}
		return volume;
	}

	@Override
	public float calcWeight() {
		for(Building unit : houseUnits){
			weight += unit.calcWeight();
		}
		return weight;
	}

}
