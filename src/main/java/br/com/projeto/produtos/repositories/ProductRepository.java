package br.com.projeto.produtos.repositories;

import br.com.projeto.produtos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
