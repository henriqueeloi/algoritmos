package com.eloi.algoritmos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestaMenorPreco {
		
	@Test
	public void testaMenorPrecoCarros(){
		double precos[] = new double[5];
		
		precos[0] = 1000000;
        precos[1] = 46000;
        precos[2] = 16000;
        precos[3] = 46000;
        precos[4] = 17000;
		
		int maisBarato = 0;
		int atual = 0;
		
		for (int i = 0; i < precos.length; i++) {			
			if(precos[atual] < precos[maisBarato]){
				maisBarato = atual;
			}
			atual = atual + 1;
		}
		
		System.out.println("Mais Barato: " + maisBarato + precos[maisBarato]);
		
	}
	
}
