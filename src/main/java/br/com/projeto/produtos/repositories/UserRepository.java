package br.com.projeto.produtos.repositories;

import br.com.projeto.produtos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
