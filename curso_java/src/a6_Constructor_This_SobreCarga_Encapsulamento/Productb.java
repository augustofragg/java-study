package a6_Constructor_This_SobreCarga_Encapsulamento;

public class Productb {
	private String name;
	private double price;
	private int quantity;
	private String model;
	private int size;
	
	public Productb(String name,double price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga Constructor com mesmo nome, mas parâmetros diferentes
	public Productb(String model,int size) {
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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
