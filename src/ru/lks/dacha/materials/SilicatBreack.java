package ru.lks.dacha.materials;

public class SilicatBreack extends Material {
	
	/**
	 * конструктор принимает плотность и цену кирпича за кг
	 * @param density
	 * @param price
	 */
	public SilicatBreack(float density, float price) {
		super(density, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
