package com.example.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	/*public List <Cidade> findByLatitudeAndLongitude (String latitude, String longitude);*/ //Teste realizado para localizar duas cidades com os mesmos dados.
	
	public Cidade findByLatitudeAndLongitude (String latitude, String longitude);
	
	public List <Cidade> queryByNome (String nome);
	
	public List <Cidade> findByNomeIgnoreCase (String nome);
	
}

