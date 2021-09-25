package br.estudandoemcasa.maven.domain;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

	@Test
	public void test() {

		Produto p = new Produto("Teste", BigDecimal.TEN);
		Assert.assertEquals("teste", p.getNome());
		Assert.assertEquals(BigDecimal.TEN, p.getValor());
	}

}
