package org.ribatis.RibatisService;

import org.ribatis.RibatisService.entities.Ribatis;
import org.ribatis.RibatisService.repository.RibatisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class RibatisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibatisServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RibatisRepository ribatisRepository, RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Ribatis.class);
		return args -> {
			ribatisRepository.save(new Ribatis(null,"Ribtis","Ribatis@gmail.com"));
			ribatisRepository.save(new Ribatis(null,"hassan","hassan@gmail.com"));
			ribatisRepository.save(new Ribatis(null,"Abdelbasset","abdelbasset@gmail.com"));
			ribatisRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});

		};
	}
}
