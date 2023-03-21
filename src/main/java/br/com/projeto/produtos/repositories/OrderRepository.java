package br.com.projeto.produtos.repositories;

import br.com.projeto.produtos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
