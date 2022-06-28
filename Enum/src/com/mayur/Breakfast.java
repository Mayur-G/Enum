package com.mayur;

public enum Breakfast {
	CHAPPATI(9),
	ROTI(7),
	UPITTU(10),
	LEMON_RICE(10),
	IDLI(9);
	
	final int level_of_taste;
	
	Breakfast(int level_of_taste) {
		this.level_of_taste = level_of_taste;
	}
	
}
