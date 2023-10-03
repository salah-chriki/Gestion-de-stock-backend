package ma.salah.gestion_de_stock_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static ma.salah.gestion_de_stock_backend.utils.Constants.APP_ROOT;

@SpringBootApplication
@EnableJpaAuditing
public class GestionDeStockBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeStockBackendApplication.class, args);
    }

//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping(APP_ROOT+"/**").allowedOrigins("http://localhost:8080");
//            }
//        };
//    }



}
