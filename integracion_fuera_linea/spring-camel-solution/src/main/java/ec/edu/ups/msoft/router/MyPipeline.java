package ec.edu.ups.msoft.router;

import ec.edu.ups.msoft.model.Client;
import ec.edu.ups.msoft.model.Person;
import ec.edu.ups.msoft.processors.ProcessClient;
import ec.edu.ups.msoft.processors.TransformarRegistroBean;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

@Component
public class MyPipeline extends RouteBuilder {

    DataFormat bindy = new BindyCsvDataFormat(Client.class);
    JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Person.class);

    @Override
    public void configure() throws Exception {
        from("file:src/data?noop=true&fileName=cardsclients.csv")
                .unmarshal(bindy)
                .process(new ProcessClient())
                .split(body())
                .bean(new TransformarRegistroBean(), "transformarRegistro")
                .log("Se proceso el cliente ${body.clientId}")
                .marshal(jsonDataFormat)
                .to("rest:post:/person?host=localhost:8080");


    }
}
