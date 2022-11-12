package su.hostile.cxfsoapproducer.config;

import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import su.hostile.cxfsoapproducer.service.impl.SoapServiceImpl;

import javax.xml.ws.Endpoint;

@Configuration
@RequiredArgsConstructor
public class WSConfig {

    private final Bus bus;
    private final SoapServiceImpl service;

    @Bean
    public Endpoint importEndpoint() {

        EndpointImpl endpoint = new EndpointImpl(bus, service);
        endpoint.publish("/import");

        return endpoint;
    }

}
