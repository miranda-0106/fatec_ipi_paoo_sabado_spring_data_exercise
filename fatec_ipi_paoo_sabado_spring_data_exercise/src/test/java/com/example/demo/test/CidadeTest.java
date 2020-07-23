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
public class CidadeTest {
	
	@Autowired
	private CidadeRepository cidadeRepository;

	
	@Test
	public void testInsertCidadeA () {
		Cidade c = new Cidade ();
		c.setNome("São Paulo");
		c.setLatitude("-23.5489");
		c.setLongitude("-46.6388");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
	
	@Test
	public void testInsertCidadeB () {
		Cidade c = new Cidade ();
		c.setNome("Brasíia");
		c.setLatitude("-15.7801");
		c.setLongitude("-47.9292");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
	
	@Test
	public void testInsertCidadeC () {
		Cidade c = new Cidade ();
		c.setNome("Rio de Janeiro");
		c.setLatitude("-22.9035");
		c.setLongitude("-43.2096");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
	
	@Test
	public void testInsertCidadeD () {
		Cidade c = new Cidade ();
		c.setNome("Santos");
		c.setLatitude("-23.9618");
		c.setLongitude("-46.3322");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
	
	@Test
	public void testInsertCidadeE () {
		Cidade c = new Cidade ();
		c.setNome("Recife");
		c.setLatitude("-8.05428");
		c.setLongitude("-34.8813");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}

}
