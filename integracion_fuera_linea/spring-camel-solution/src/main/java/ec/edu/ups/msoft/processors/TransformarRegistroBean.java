package ec.edu.ups.msoft.processors;

import ec.edu.ups.msoft.model.Client;
import ec.edu.ups.msoft.model.Person;

public class TransformarRegistroBean {

    public Person transformarRegistro(Client client){
        return new Person(client.getId(),client.getSex(),client.getAge());
    }
}
