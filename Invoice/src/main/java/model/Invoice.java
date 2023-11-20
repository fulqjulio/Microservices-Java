package model;

import java.io.Serializable;

public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long customerId;
    private Long productId;
    private Integer quantity;

    public Invoice() {
    }

    public Invoice(Long id, Long customerId, Long productId, Integer quantity) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}