package com.practice.oop.concepts2;

/*
 * Aggregation is an association represents a part of a whole relationship where a part can exist without a whole. It has a weaker relationship.
 */
public class Aggregation {
	public static void main(String[] args) {
		// Create Products
		Product p1 = new Product(1, "Pen", "This is red pen");
		Product p2 = new Product(2, "Pencil", "This is pencil");
		Product p3 = new Product(3, "ColorBox", "This is color box");

		// Create lineItem and add quntity of the products
		LineItem item1 = new LineItem(1, 2, p1);
		LineItem item2 = new LineItem(1, 2, p2);
		LineItem item3 = new LineItem(1, 2, p3);

		// Before deleting line item 1
		System.out.println(item1.getId());
		System.out.println(item1.getQuantity());
		System.out.println(item1.getP());
		item1 = null;

		// Still product exist and not deleted
		System.out.println(p1);
	}
}

/*
 * Let's take an example of Line item and their Products. If line-item HAS-A product, then a line item is a whole and product is a part.
 * If a line item is deleted, then corresponding product needs not to be deleted.
 */
class Product {
	private int id;
	private String name;
	private String description;

	public Product(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}

class LineItem {
	private int id;
	private int quantity;
	private Product p;

	public LineItem(int id, int quantity, Product p) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", p=" + p + "]";
	}
}