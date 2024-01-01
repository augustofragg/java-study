package a6_Constructor_This_SobreCarga_Encapsulamento;

public class Product {
	public String name;
	public double price;
	public int quantity;
	public String model;
	public int size;
	
	public Product(String name,double price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga Constructor com mesmo nome, mas parâmetros diferentes
	public Product(String model,int size) {
		this.model = model;
		this.size = size;
	}
	
	public void addProduct(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void RemovProduct(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public double TotalStockValue() {
		return (double) price * quantity; 
	}
	
	public String toString() {
		return name
			  +", $ "
			  + String.format("%.2f",price)
			  +", "
			  + quantity
			  +" units, Total: $ "
			  + String.format("%.2f%n",TotalStockValue());			  
	}
	
}
