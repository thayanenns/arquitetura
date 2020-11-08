package com.prova.categoriaProduto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoriaProduto")
public class CategoriaProdutoController {
	
	@GetMapping
	public List<CategoriaProduto> findAll(){
		return new ArrayList<CategoriaProduto>();
	}

}
