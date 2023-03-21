package br.com.projeto.produtos.services;

import br.com.projeto.produtos.entities.Order;
import br.com.projeto.produtos.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll ();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById (id);
        return obj.get ();
    }

}
