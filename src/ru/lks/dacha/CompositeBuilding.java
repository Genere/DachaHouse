package ru.lks.dacha;

public class CompositeBuilding extends Building {

	public CompositeBuilding(Square square) {
		super(square);
	}

	public CompositeBuilding() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected float calcPrice() {
		price = 0;
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
