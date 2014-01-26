package ru.lks.dacha;

public class Square {
	
	private float width;
	private float length;
	private float square;
	
	public Square (float square){
		this.square = square;
	}
	
	public Square (float width, float lenght){
		square = width*lenght;
	}

}
