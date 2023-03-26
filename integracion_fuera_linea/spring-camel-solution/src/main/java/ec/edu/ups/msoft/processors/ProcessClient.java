package ec.edu.ups.msoft.processors;

import ec.edu.ups.msoft.model.Client;
import ec.edu.ups.msoft.model.Person;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessClient implements Processor {

    private static final Logger log = LoggerFactory.getLogger(ProcessClient.class);
    @Override
    public void process(Exchange exchange) throws Exception {
        List<Client> clientList = (List<Client>) exchange.getIn().getBody();
        log.info("Cantidad de datos de clientes inicial: {}",clientList.size());
        List<Client> filterClient = clientList.stream()
                .filter(client -> client.getPay().getPay1() >0)
                .filter(client -> client.getPay().getPay2() >0)
                .filter(client -> client.getPay().getPay3() >0)
                .filter(client -> client.getPay().getPay4() >0)
                .filter(client -> client.getPay().getPay5() >0)
                .filter(client -> client.getPay().getPay6() >0)
                .filter(client -> client.getPay().getPay7() >0)
                .filter(client -> client.getPay().getPay8() >0)
                .filter(client -> client.getPay().getPay9() >0)
                .filter(client -> client.getPay().getPay10() >0)
                .filter(client -> client.getPay().getPay11() >0)
                .filter(client -> client.getPay().getPay12() >0)
                .filter(client -> client.getBill().getBill1() > 0)
                .filter(client -> client.getBill().getBill2() > 0)
                .filter(client -> client.getBill().getBill3() > 0)
                .filter(client -> client.getBill().getBill4() > 0)
                .filter(client -> client.getBill().getBill5() > 0)
                .filter(client -> client.getBill().getBill6() > 0)
                .collect(Collectors.toList());
        log.info("Cantidad de datos de clientes validos: {}",filterClient.size());
        log.info("Cantidad de datos de clientes no validos : {}",clientList.size() - filterClient.size());
        List<Person> personList = filterClient.stream()
                .map(client -> new Person(client.getId(),client.getSex(),client.getAge()))
                .collect(Collectors.toList());
        exchange.getIn().setBody(filterClient);
    }
}
