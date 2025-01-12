
package com.fiap.myapp.controllers;

import com.fiap.myapp.models.Produto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProdutoContoller {

	List<Produto> produtoList = new ArrayList<>();

	public ProdutoContoller() {
		produtoList.add(new Produto(1, "Produto 1", 100.0));
		produtoList.add(new Produto(2, "Produto 2", 200.0));
		produtoList.add(new Produto(3, "Produto 3", 300.0));
		produtoList.add(new Produto(4, "Produto 4", 400.0));
		produtoList.add(new Produto(5, "Produto 5", 500.0));
	}

	@GetMapping("/produtos")
	public String produtos(Model model) {

		model.addAttribute("products", produtoList);
		return "produtos";
	}

	@GetMapping("/produto/{id}")
	public String produto(@PathVariable("id") int id, Model model) {
 
		if (id < 1) {
            throw new IllegalArgumentException("ID inválido!");
        }

		Produto produto = produtoList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

		model.addAttribute("product", produto);
		return "produto";
	}
	
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }


	@GetMapping("/produto-valido/{id:[0-9]+}")
	public String Produto(@PathVariable("id") int id, Model model) {
		Produto produto = produtoList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
		if (id < 1) {
	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ID inválido!");
	    }

		model.addAttribute("product", produto);
		return "produto";
	}
}
