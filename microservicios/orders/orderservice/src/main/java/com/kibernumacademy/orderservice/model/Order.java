package com.kibernumacademy.orderservice.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String product;
    private int quantity;
    @Column(name = "user_id")
    private Long userId; // Referencia al usuario que realiza el pedido

    // Getters y Setters

    public Long getId() {
        return id;
    }

	public void setId(Long id) {
		this.id = id;
	}

    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getUserId() {
        return userId;
    }

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}