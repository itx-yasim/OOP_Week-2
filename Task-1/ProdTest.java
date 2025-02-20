class ProdTest{

public static void main(String args[]){

	Product fish=new Product("Fish",10,200,"Food");
	Product water=new Product("Water",20,30,"Drink");
	Product chips=new Product("Chips",8,20,"Food");
	Product hammer=new Product("Hammer",4,1200,"Tool");
	Product tester=new Product("Tester",46,120,"Tool");
	
	fish.setName("Fish");
	String name=fish.getName();

	fish.setQuantity(17);
	int quantity=fish.getQuantity();

	fish.setPrice(470);
	int price=fish.getPrice();

	fish.setCategory("Raw Food");
	String category=fish.getCategory();

//Lets use another getter/setter for another object

	chips.setQuantity(3);
	quantity=fish.getQuantity();

	chips.setPrice(54);
	price=fish.getPrice();

//Lets use another getter/setter for another object

	water.setQuantity(8);
	quantity=fish.getQuantity();

	water.setPrice(35);
	price=fish.getPrice();

	System.out.printf("%10s %10s %10s %10s %10s\n\n","ID","NAME","QUANTITY","PRICE","CATEGORY");

	fish.display(name,quantity,price,category);
	water.display(name,quantity,price,category);
	chips.display(name,quantity,price,category);
	hammer.display(name,quantity,price,category);
	tester.display(name,quantity,price,category);

	}

}