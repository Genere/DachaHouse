package ru.lks.dacha.materials;

import ru.lks.dacha.Building;

public class Breack extends Material {

	/**
	 * конструктор принимает плотность и цену кирпича за кг
	 * @param density
	 * @param price
	 */
	public Breack(float density, float price) {
		super(density, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcPrice() {
		return price = 10;

	}

}
