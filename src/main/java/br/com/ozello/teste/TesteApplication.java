package br.com.ozello.teste;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class TesteApplication {

  private static final Logger LOG = LoggerFactory.getLogger(TesteApplication.class);

  @RequestMapping("/teste")
  @ResponseBody
  String home() {
    for (int i = 0; i < 100; i++) {
      LOG.info("[TAG_I_" + i + "] - Teste de log info.", "dafdfasdfsa");
      LOG.error("[TAG_E_" + i + "] - Teste de log error.");
      LOG.warn("[TAG_W_" + i + "] - Teste de log error.");
      LOG.debug("[TAG_D_" + i + "] - Teste de log debug.");
    }
    return "Log printed!";
  }

  public static void main(String[] args) {
    SpringApplication.run(TesteApplication.class, args);
  }
}
