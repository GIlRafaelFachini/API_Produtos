package br.com.projeto.produtos.services;

import br.com.projeto.produtos.entities.Category;
import br.com.projeto.produtos.entities.User;
import br.com.projeto.produtos.repositories.CategoryRepository;
import br.com.projeto.produtos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll ();
    }

    public Category findById(Long id){
       Optional<Category> obj = repository.findById (id);
       return  obj.get ();
    }

}
