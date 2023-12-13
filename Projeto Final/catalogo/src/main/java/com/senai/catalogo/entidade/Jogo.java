package com.senai.catalogo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_jogo")
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String name;	
	private String plataform;	
	private String url;	
	private String thumbnailpath;
	private String genre;
	private String description;
	private String squad;
  public Jogo() {
    	
  }   
	public Jogo(Long id, String name, String plataform, String url, String thumbnailpath, String genre, String description, String squad) {
		super();
		this.id = id;
		this.name = name;
		this.plataform = plataform;
		this.url = url;
		this.thumbnailpath = thumbnailpath;
		this.genre = genre;
		this.description = description;
		this.squad = squad;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSquad() {
		return squad;
	}
	public void setSquad(String squad) {
		this.squad = squad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlataform() {
		return plataform;
	}
	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbnailpath() {
		return thumbnailpath;
	}
	public void setThumbnailpath(String thumbnailpath) {
		this.thumbnailpath = thumbnailpath;
	}
	
}