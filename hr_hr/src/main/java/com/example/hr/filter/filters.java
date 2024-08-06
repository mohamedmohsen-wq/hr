package com.example.hr.filter;

import java.io.IOException;
import java.util.UUID;

import org.apache.logging.log4j.core.config.Order;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
@Component
@Order(1)
public class filters implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String correlationid=UUID.randomUUID().toString();
		MDC.put("correlationid-from-filter", correlationid);
        chain.doFilter(request, response);
        MDC.clear();
		
	}

}
