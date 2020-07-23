package com.example.demo.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.bean.Cidade;
import com.example.demo.model.repository.CidadeRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeQueryTest {
	
	@Autowired
	private CidadeRepository repo;
	
	@Test
	public void testeFindOneByLatitudeAndLogitude () { 
		Cidade c = repo.findByLatitudeAndLongitude ("-23.5489", "-46.6388");
		System.out.println(c);
		/*System.out.println(repo.findByLatitudeAndLongitude("-23.5489", "-46.6388"));*/ //Teste realizado para localizar duas cidades com os mesmos dados.
	}
	
	@Test
	public void testFindManyByNome () {
		System.out.println(repo.queryByNome("Recife"));
	}
	
	@Test
	public void testFindManyByNomeWithIgnoreCase () {
		System.out.println(repo.findByNomeIgnoreCase("sAnToS"));
	}
	
}
