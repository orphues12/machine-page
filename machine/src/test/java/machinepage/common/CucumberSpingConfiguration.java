package machinepage.common;

import io.cucumber.spring.CucumberContextConfiguration;
import machinepage.MachineApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MachineApplication.class })
public class CucumberSpingConfiguration {}
