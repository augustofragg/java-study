package a5_intro_orientacaoObjeto;

public class Product {
	public String name;
	public double price;
	int quantity;

	public Product() {
		
	}
	
	public double TotalValueInStock() {
		double total = this.price * this.quantity;
		
		return total;
	}
	
	public void AddProduct(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public String toString() {
		return name
			   + ", $"
			   + String.format(" %.2f, ",price)
			   + quantity + " units, total: $ "
			   + String.format("%.2f %n", TotalValueInStock());	
	}
	
}

