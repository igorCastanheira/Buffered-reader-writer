
public class Product {
	protected String name;
	protected Double price;
	protected int quantity;

	public Product() {

	}

	public Product(String name, Double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double total() {

		return price * quantity;

	}

}
