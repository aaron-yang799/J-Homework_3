package edu.mu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Yippee!");
		StockerManagerSingleton instance = StockerManagerSingleton.getInstance();
		System.out.println(instance.initializeStock());
		
		ArrayList<MediaProduct> listOfProducts = StockerManagerSingleton.getProducts();
		
		for(int i = 0; i < listOfProducts.size(); i++)
		{
			System.out.println(listOfProducts.get(i));
			System.out.println(listOfProducts.get(i).getClass());

		}
		
		System.out.println("\n\n\n\n\n\n\n\n");
		
		instance.removeItem(listOfProducts.get(1));
		
		for(int i = 0; i < listOfProducts.size(); i++)
		{
			System.out.println(listOfProducts.get(i));
			System.out.println(listOfProducts.get(i).getClass());
		}
		
		System.out.println("\n\n\n\n\n\n\n\n");
		
//		MediaProduct temp = new CDRecordProduct(new MediaProduct("Baby Shark", 10.99, 2021, Genre.POP));
		
		
		instance.updateItemPrice(listOfProducts.get(2), 23.13);
		
		for(int i = 0; i < listOfProducts.size(); i++)
		{
			System.out.println(listOfProducts.get(i));
			System.out.println(listOfProducts.get(i).getClass());
		}
		
	}

}
