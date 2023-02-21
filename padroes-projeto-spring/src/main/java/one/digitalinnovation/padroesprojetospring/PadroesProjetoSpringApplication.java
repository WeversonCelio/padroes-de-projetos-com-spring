package one.digitalinnovation.padroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>PadroesProjetoSpringApplication class.</p>
 *
 * @author WeversonCelio
 * @version 1.0
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	//@EnableFeignClients
	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
