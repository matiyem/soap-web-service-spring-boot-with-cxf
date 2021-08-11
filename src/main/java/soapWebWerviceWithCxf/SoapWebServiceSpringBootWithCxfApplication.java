package soapWebWerviceWithCxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SoapWebServiceSpringBootWithCxfApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SoapWebServiceSpringBootWithCxfApplication.class, args);
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**                                                                      **");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**        Tara producing soap web service with cxf is ready             **");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**                                                                      **");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t**************************************************************************");
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SoapWebServiceSpringBootWithCxfApplication.class);
	}

}
