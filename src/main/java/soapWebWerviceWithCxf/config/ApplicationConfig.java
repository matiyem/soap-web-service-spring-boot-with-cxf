package soapWebWerviceWithCxf.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import soapWebWerviceWithCxf.service.AccountServiceEndpoint;

import javax.xml.ws.Endpoint;

/**
 * created by Atiye Mousavi
 * Date: 8/6/2021
 * Time: 1:56 PM
 */
@Configuration
public class ApplicationConfig {
//    http://localhost:8080/soap-api این صفحه اصلی برای وب سرویس برای cxf را بالا میاورد

    @Bean
    public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
        //برای ریجستر کردن cxf dispatcher servlet برای هندل کردن ریکویست های ورودی بر روی soap-api
        return new ServletRegistrationBean<>(new CXFServlet(), "/soap-api/*");
    }

    @Bean
    @Primary
    public DispatcherServletPath dispatcherServletPathProvider() {
        return () -> "";
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(LoggingFeature loggingFeature) {
//     bus مربوط به core cxf است
//که به شما اجازه میدهد اضافه کنید interceptor به هر cxf client یا endpoint که از bus استفاده میکنند
//        که در این مثال ما loggingFetaure را اضافه کردیم
        SpringBus cxfBus = new SpringBus();
        cxfBus.getFeatures().add(loggingFeature);
        return cxfBus;
    }

    @Bean
    public LoggingFeature loggingFeature() {
        //برای لاگ استفاده میشود
        LoggingFeature loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        return loggingFeature;
    }

    @Bean
    public Endpoint endpoint(Bus bus, AccountServiceEndpoint accountServiceEndpoint) {
        //پراسس نهایی آدرس را تنظیم میکند
        EndpointImpl endpoint = new EndpointImpl(bus, accountServiceEndpoint);
        endpoint.publish("/service/accounts");
        return endpoint;
        
    }
}
