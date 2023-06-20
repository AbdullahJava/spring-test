package com.spring.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

	@Test
	void namePlayerTesting() {
		Player player = new Player();
		Assertions.assertEquals(player.getName("Trecka1"), null);
	}

}
