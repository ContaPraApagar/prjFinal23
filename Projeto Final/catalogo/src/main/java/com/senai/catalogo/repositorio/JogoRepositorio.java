package com.senai.catalogo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.catalogo.entidade.Jogo;

public interface JogoRepositorio extends JpaRepository<Jogo, Long>{

}
