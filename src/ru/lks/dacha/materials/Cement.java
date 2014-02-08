package ru.lks.dacha.materials;

/**
 * класс материала цемент
 * для инициализации необходимо задать плотность цемента и стоимость за кг
 * @author constantine
 *
 */
public class Cement extends Material{
	
	/**
	 * для инициализации необходимо задать плотность цемента и стоимость за кг
	 * @param density
	 * @param price
	 */
	public Cement(float density, float price) {
		super(density, price);
		
	}

	@Override
	public float calcPrice() {
//		return price = 10;
		return price;
	}

	
}
