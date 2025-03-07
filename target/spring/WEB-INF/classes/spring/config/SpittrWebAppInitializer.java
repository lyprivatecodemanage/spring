package spring.di;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@WebAppConfiguration
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() { 
		
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {//将dispatcherServlet映射到"/"
		
		return new String[]{"/"};
	}

}
