package com.estudo.testes;

import com.estudo.testes.view.MenuGeral;
import com.estudo.testes.view.MenuProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestesUnitariosApplication {

	public static void main(String[] args) {

		//SpringApplication.run(TestesUnitariosApplication.class, args);
		MenuProvider menuProvider = new MenuProvider(new MenuGeral());
		menuProvider.iniciarFluxo();
	}

}
