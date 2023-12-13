package com.senai.catalogo.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.catalogo.entidade.Jogo;
import com.senai.catalogo.repositorio.JogoRepositorio;

@Service
public class JogoServico {

	private final JogoRepositorio jogoRepositorio;

	@Autowired
	public JogoServico(JogoRepositorio jogoRepositorio) {
		this.jogoRepositorio = jogoRepositorio;
	}

	// preparando as buscas por id
	public Jogo getJogoById(Long id) {
		return jogoRepositorio.findById(id).orElse(null);
	}

	// preparando a busca geral
	public List<Jogo> getAllJogos() {
		return jogoRepositorio.findAll();
	}

	// salvando o Jogo
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepositorio.save(jogo);
	}

	// excluindo o Jogo
	public void deleteJogo(Long id) {
		jogoRepositorio.deleteById(id);
	}
	
}
