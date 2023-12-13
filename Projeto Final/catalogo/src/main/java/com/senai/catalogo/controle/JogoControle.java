package com.senai.catalogo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.catalogo.entidade.Jogo;
import com.senai.catalogo.servico.JogoServico;

@RestController
@RequestMapping("/jogos")
public class JogoControle {
	
	@Autowired
	private final JogoServico jogoServico;

	@GetMapping("/home")
	public String paginaInicial() {
		return "index"; 
	}

	@Autowired
	public JogoControle(JogoServico jogoServico) {
		this.jogoServico = jogoServico;
	}
	
	 @PostMapping("/create")
	    public Jogo createJogo(@RequestBody Jogo jogo) {
		 return jogoServico.saveJogo(jogo);
	    }
	

	@GetMapping("/{id}")
	public ResponseEntity<Jogo> getJogo(@PathVariable Long id) {
		Jogo jogo = jogoServico.getJogoById(id);
		if (jogo != null) {
			return ResponseEntity.ok(jogo);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping
	public List<Jogo> getAllJogos() {
		return jogoServico.getAllJogos();
	}

	@DeleteMapping("/{id}")
	public void deleteJogo(@PathVariable Long id) {
		jogoServico.deleteJogo(id);
	}	

	
}
