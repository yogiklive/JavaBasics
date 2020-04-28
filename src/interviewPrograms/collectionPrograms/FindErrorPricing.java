package interviewPrograms.collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class FindErrorPricing {
	
	public static void main(String args[]){
		
		/*List<String> products = Arrays.asList("eggs","milk","cheese");
		List<Float> productPrices = new ArrayList<Float>();
		productPrices.add((float) 2.89);
		productPrices.add((float) 3.29);
		productPrices.add((float) 5.79);
		
		List<String> productSold = Arrays.asList("eggs","eggs","cheese","milk");
		List<Float> soldPrice = new ArrayList<Float>();
		soldPrice.add((float) 2.89);
		soldPrice.add((float) 2.99);
		soldPrice.add((float) 5.97);
		soldPrice.add((float) 3.29);*/
		
		List<String> products = Arrays.asList("rice","sugar","wheat","cheese");
		List<Float> productPrices = new ArrayList<Float>();
		productPrices.add((float) 16.89);
		productPrices.add((float) 56.92);
		productPrices.add((float) 20.89);
		productPrices.add((float) 345.99);
		
		List<String> productSold = Arrays.asList("rice","cheese");
		List<Float> soldPrice = new ArrayList<Float>();
		soldPrice.add((float) 18.99);
		soldPrice.add((float) 400.89);
		
		
		int result = FindErrorPricing.priceCheck(products, productPrices, productSold, soldPrice);
		
		
	}

	private static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold,
			List<Float> soldPrice) {

		int errorPricing = 0;

		HashMap<String, Float> actualPriceMap = new HashMap<String, Float>();

		for (int i = 0; i < products.size(); i++) {

			actualPriceMap.put(products.get(i), productPrices.get(i));
		}

		for (int i = 0; i < productSold.size(); i++) {

			Float actualPrice = actualPriceMap.get(productSold.get(i));

			if (actualPrice != soldPrice.get(i) && !actualPrice.equals(soldPrice.get(i))) {
				errorPricing++;

			}
		}
		System.out.println(errorPricing);

		return errorPricing;
	}

}
