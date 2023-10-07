package dev.octavian.contentcalendar;

import dev.octavian.contentcalendar.config.ContentCalendarProperties;
import dev.octavian.contentcalendar.model.Content;
import dev.octavian.contentcalendar.model.Status;
import dev.octavian.contentcalendar.model.Type;
import dev.octavian.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	 }

//	 @Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository){
//		return args -> {
//			// insert data into database
//
//			Content content = new Content(null,
//					"Hello Chat GPT",
//					"All about chat GPT",
//					Status.IDEA,
//					Type.VIDEO,
//					LocalDateTime.now(),
//					null,
//					""
//			);
//
//			repository.save(content);
//		};
//	 }

}
