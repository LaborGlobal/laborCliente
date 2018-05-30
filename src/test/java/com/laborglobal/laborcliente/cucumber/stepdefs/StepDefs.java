package com.laborglobal.laborcliente.cucumber.stepdefs;

import com.laborglobal.laborcliente.LaborClienteApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LaborClienteApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
