package Encapsulation_Abstraction;

class Author
{
	String name, email;
	char gender;
	
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	
}


public class Book {
	String name;
	Author a;
	double price;
	int qtyInStock;
	
	Book(String name, Author a, double price, int qtyInStock)
	{
		this.name=name;
		this.a=a;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	void getDetails()
	{
        System.out.printf("Book Details %n Name : %s %n Price: %f %n Quantity In Stock: %d %n", this.name, this.price, this.qtyInStock);
        System.out.printf("Author Details %n Name : %s %n Email: %s %n Gender: %C %n", this.a.name, this.a.email, this.a.gender);
	}
	
	public static void main(String[] args) {
		Author auth = new Author ("Keshav Mishra", "Keshavmishra1001@gmail.com", 'M');
        Book book = new Book("Java", auth, 99.99, 100);
        book.getDetails();

	}

}
