package ru.lks.dacha;

public class DachaHouse extends Building {

	public DachaHouse(Square square) {
		super(square);
	}

	@Override
	public float calcPrice() {
		
		price = 0;
		
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
			unit.calcWeight();
			weight += unit.weight;
		}
		return weight;
	}

}
