package br.com.projeto.produtos.services;

import br.com.projeto.produtos.entities.Category;
import br.com.projeto.produtos.entities.Product;
import br.com.projeto.produtos.repositories.CategoryRepository;
import br.com.projeto.produtos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll ();
    }

    public Product findById(Long id){
       Optional<Product> obj = repository.findById (id);
       return  obj.get ();
    }

}
