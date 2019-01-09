package com.example.lombokdemo.confg;

import com.example.lombokdemo.soap.CalculatorDelegate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapDelegateConfig {

    @Value("${calculator.endpoint}")
    String calculatorEndPoint;

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("org.tempuri");
        return marshaller;
    }

    @Bean
    public CalculatorDelegate calculatorDelegate(final Jaxb2Marshaller marshaller){
        CalculatorDelegate delegate = new CalculatorDelegate();
        delegate.setDefaultUri(calculatorEndPoint);
        delegate.setMarshaller(marshaller);
        delegate.setUnmarshaller(marshaller);
//        System.out.println("Adding results using soap webservice"+delegate.add(2,4));
        return delegate;
    }
}
