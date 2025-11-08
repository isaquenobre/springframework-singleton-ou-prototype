package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
  /*
   * @Autowired
   * private Remetente noreply;
   * 
   * @Autowired
   * private Remetente techTeam;
   * 
   * public void enviarConfirmacaoCadastro() {
   * System.out.println(noreply);
   * System.out.println("Seu cadastro foi aprovado");
   * }
   * 
   * public void enviarMensagemBoasVindas() {
   * techTeam.setEmail("tech@dio.com.br");
   * System.out.println(techTeam);
   * System.out.println("Bem-vindo à Tech Elite");
   * }--- esse foi o codigo da DIO
   */

  @Autowired
  private ApplicationContext context;

  public void enviarConfirmacaoCadastro() {
    Remetente r = context.getBean("remetentePrototype", Remetente.class); // pega o bean prototype
    r.setNome("Digital Innovation One");
    r.setEmail("noreply@dio.com.br");
    System.out.println(r);
    System.out.println("Seu cadastro foi aprovado");
  }

  public void enviarMensagemBoasVindas() {
    Remetente r = context.getBean("remetentePrototype", Remetente.class);
    r.setNome("Tech Elite");
    r.setEmail("tech@dio.com.br");
    System.out.println(r);
    System.out.println("Bem-vindo à Tech Elite");
  }

}
