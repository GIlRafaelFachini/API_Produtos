package br.com.projeto.produtos.entities.pk;

import br.com.projeto.produtos.entities.Order;
import br.com.projeto.produtos.entities.Product;

import java.util.Objects;

public class OrderItemPk {
    private Order order;
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPk that)) return false;
        return Objects.equals (getOrder (), that.getOrder ()) && Objects.equals (getProduct (), that.getProduct ());
    }

    @Override
    public int hashCode() {
        return Objects.hash (getOrder (), getProduct ());
    }
}
