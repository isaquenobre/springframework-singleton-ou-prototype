package dio.springboot.app;

//import java.beans.Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	@Bean("remetentePrototype")
	@Scope("prototype")
	public Remetente remetente() {
		System.out.println("CRIANDO UM OBJETO REMETENTE");
		/*
		 * Remetente remetente = new Remetente();
		 * remetente.setEmail("noreply@dio.com.br");
		 * remetente.setNome("Digital Innovation One");
		 * return remetente;--esse é o codigo da DIO
		 */

		return new Remetente();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}