package br.com.projeto.produtos.repositories;

import br.com.projeto.produtos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
