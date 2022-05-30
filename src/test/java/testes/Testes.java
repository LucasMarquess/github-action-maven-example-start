package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculator;

public class Testes {

	@Test
	void test01() {
		Calculator calc = new Calculator();

		int soma = calc.soma( 2, 4 );

		assertEquals( soma, 6 );
	}

}
