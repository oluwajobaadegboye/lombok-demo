package com.example.lombokdemo.soap;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.tempuri.Add;
import org.tempuri.AddResponse;


public class CalculatorDelegate extends WebServiceGatewaySupport {

    public int add(int x, int y) {
        Add addNumber = new Add();
        addNumber.setIntA(x);
        addNumber.setIntB(y);
        AddResponse response = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(addNumber,
                new SoapActionCallback("http://tempuri.org/Add"));
        return response.getAddResult();
    }
}
