public class Product{

	private static int counter=1;
	private String id;
	private String name;
	private int quantity;
	private int price;
	private String category;


	Product(String n,int q,int p,String c){ //constructor
	name=n;
	quantity=q;
	price=p;
	category=c;
	id="PROD."+String.format("%04d",counter++);
	}


	void setName(String n){   //setter
		name=n;
	}
	
	String getName(){	//getter
		return name;
	}



	void setQuantity(int q){   
		quantity=q;
	}
	
	int getQuantity(){	
		return quantity;
	}



	void setPrice(int p){   
		price=p;
	}
	
	int getPrice(){	
		return price;
	}



	void setCategory(String c){  
		category=c;
	}
	
	String getCategory(){	
		return category;
	}



	void display(String n,int q,int p,String c){
	System.out.printf("%10s %10s %10d %10d %10s\n",id,name,quantity,price,category);	
	}

}
