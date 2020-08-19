package cl.github.yadickson.logger;

import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class.
 *
 * @author Yadickson Soto
 */
@SpringBootApplication
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Application {

    /**
     * Main application method.
     *
     * @param argv arguments.
     */
    public static void main(String[] argv) {
        SpringApplication.run(Application.class);
    }

}
