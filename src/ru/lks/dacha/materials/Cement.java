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
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		price = 10;
	}
	
}
