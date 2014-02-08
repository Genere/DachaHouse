package ru.lks.dacha;


/**
 * Класс для реализации меры площади. Служит для задания площади объектов (дома, фундамента и т.д.)
 * @author Constantine
 *
 */
public class Square {
	
	private float width;
	private float length;
	private float square;
	
	public float getSquare() {
		return square;
	}

	/**
	 * конструктор. для инициализации используется площадь в м2
	 * @param square
	 */
	public Square (float square){
		this.square = square;
	}
	
	/**
	 * конструктор. для инициализации используются длина и ширина
	 * @param width
	 * @param lenght
	 */
	public Square (float width, float length){
		square = width*length;
	}

}
