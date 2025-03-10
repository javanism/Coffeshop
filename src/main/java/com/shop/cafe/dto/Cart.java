package com.shop.cafe.dto;

public class Cart {
	private int cartNo, prodcode, quantity;
	private String email;
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public int getProdcode() {
		return prodcode;
	}
	public void setProdcode(int prodcode) {
		this.prodcode = prodcode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartNo, int prodcode, int quantity, String email) {
		super();
		this.cartNo = cartNo;
		this.prodcode = prodcode;
		this.quantity = quantity;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cart [cartNo=" + cartNo + ", prodcode=" + prodcode + ", quantity=" + quantity + ", email=" + email
				+ "]";
	}
	
	
}
