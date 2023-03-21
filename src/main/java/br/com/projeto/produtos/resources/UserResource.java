package br.com.projeto.produtos.resources;

import br.com.projeto.produtos.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User user = new User (1L,"Gil","gilrafaelfachini@gmail.com", "47 9966-26585" , "fiat147");
        return ResponseEntity.ok ().body (user);

    }


}
