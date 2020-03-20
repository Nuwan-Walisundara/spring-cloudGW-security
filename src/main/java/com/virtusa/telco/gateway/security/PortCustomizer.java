package com.virtusa.telco.gateway.security;

import org.springframework.boot.web.embedded.netty.NettyServerCustomizer;

import reactor.netty.http.server.HttpServer;
//https://www.baeldung.com/spring-boot-reactor-netty
public class PortCustomizer implements NettyServerCustomizer {

	public HttpServer apply(HttpServer t) {
		return null;
	}

}
