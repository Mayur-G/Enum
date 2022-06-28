package com.mayur;

public class Test {
	public static void main(String[] args) {
		DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;
		
		if(daysOfWeek==DaysOfWeek.MONDAY)
		{
			System.out.println("its monday ohh noo");
		}
		
	
		for (DaysOfWeek myDay : DaysOfWeek.values()) {
			System.out.println(myDay);
		}
		System.out.println();
		
		System.out.println(Breakfast.IDLI.level_of_taste);
		
		
		Breakfast[] breakfast = Breakfast.values();
		
		for (Breakfast bk : breakfast) {
			System.out.println("name : "+bk.name()+" ordinal : "+bk.ordinal());
		}
	
	
		
		Breakfast bk2 = Breakfast.valueOf("ROTI");
		System.out.println("Roti is : "+bk2);		
		System.out.println();
		
		Breakfast bk3 = Breakfast.UPITTU;
		Breakfast bk4 = Breakfast.UPITTU;
		Breakfast bk5 = Breakfast.LEMON_RICE;
		
		System.out.println(bk3==bk4);
		System.out.println(bk3==bk5);
		
		System.out.println(bk3.equals(bk4));
		System.out.println(bk3.equals(bk5));
		
		System.out.println(bk3.compareTo(bk4)); //bk3.ordinal() - bk4.ordinal() = 2 -2 = 0
		System.out.println(bk3.compareTo(bk5)); //bk3.ordinal() - bk5.ordinal() = 2 -3 = -1
		System.out.println(bk5.compareTo(bk3)); //bk3.ordinal() - bk4.ordinal() = 3 -2 = 1
	}
}
