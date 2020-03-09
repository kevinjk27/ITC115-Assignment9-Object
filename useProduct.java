/*
 * Kevin Kantono
 * 03/08/2020
 * The utilization of Products class
 * Demonstrating product sales, receiving from suppliers, and price change by discount percentage
 */


package assignment9;

public class useProduct {

	public static void main(String[] args) {
		Products paintbrush = new Products(001, "Painting Paint Brush", 2.99, 5);
		Products easel = new Products(002, "CraZ Art 3 in 1 Wood Art Easel", 12.39, 7);
		Products paint = new Products(003, "Acrylic Paint Set Water Based", 23.99, 2);
		Products coloringpencil  = new Products(004, "Crayola Eraseable Colored Pencils", 4.99, 3);

		System.out.println(paint.getProductDescription());
		System.out.println(paint.getPriceFormatted());
		System.out.println();
		
		System.out.println(easel.toString());
		System.out.println();
		
		System.out.println("Updated details after it was sold for 3 pieces");
		easel.selling(3);
		System.out.println(easel.toString());
		System.out.println();
		
		System.out.println("Updated details after supplier sends 10 pieces");
		easel.buying(10);
		System.out.println(easel.toString());
		System.out.println();
		
		
		System.out.println("Then the item is discounted for 26% off");
		easel.discount(26);
		System.out.println(easel.toString());
		System.out.println();
		
	}

}
