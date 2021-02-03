package com.utpl.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.utpl.model.Persona;
import com.utpl.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private final static Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
    public List<Persona> getListPeople() {
        List<Persona> people = new ArrayList<>(
                Arrays.asList(
                        new Persona("Alex1", 10), 
                        new Persona("Alex2", 20), 
                        new Persona("Alex3", 30),
                        new Persona("Alex4", 40))
                );

        LOG.info("!!!!!! HELLO FROM SERVICE  !!!!!");

        return people;
    }

}
