package assignment9;

public class useProduct {

	public static void main(String[] args) {
		Products paintbrush = new Products(001, "Painting Paint Brush", 2.99, 5);
		Products easel = new Products(002, "Cra-Z-Art 3 in 1 Wood Art Easel", 12.39, 7);
		Products paint = new Products(003, "12 PC Acrylic Paint Set Water Based", 23.99, 2);

		System.out.println(paint.getProductDescription());
	}

}
