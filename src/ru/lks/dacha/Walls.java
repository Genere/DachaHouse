package ru.lks.dacha;

public class Walls extends Building {

	@Override
	protected float calcPrice() {
		for(Building unit : houseUnits){
			price += unit.calcPrice();
		}
		return price;
	}

	@Override
	protected float calcVolume() {
		for(Building unit : houseUnits){
			volume += unit.calcVolume();
		}
		return volume;
	}

	@Override
	protected float calcWeight() {
		for(Building unit : houseUnits){
			weight += unit.calcWeight();
		}
		return weight;
	}

}
