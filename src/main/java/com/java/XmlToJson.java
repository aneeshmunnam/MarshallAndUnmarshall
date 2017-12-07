package com.java;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class XmlToJson{

	public static void main(String[] args) throws Exception{
		CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            public void configure() throws Exception {
                from("file:C:/inputFolder?noop=true").marshal().xmljson().to("file:C:/outputFolder");

            }
        });
        context.start();
        Thread.sleep(4000);
        context.stop();

	
	}
	
}
