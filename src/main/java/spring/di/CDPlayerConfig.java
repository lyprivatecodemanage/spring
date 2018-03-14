package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class CDPlayerConfig {
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer getCDPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
	
	@Bean
	public AOPSayHello getAOPSayHello(){
		return new AOPSayHello();
	}
}
