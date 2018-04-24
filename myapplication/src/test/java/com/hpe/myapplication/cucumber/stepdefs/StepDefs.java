package com.hpe.myapplication.cucumber.stepdefs;

import com.hpe.myapplication.MyapplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyapplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
