package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.log4j.BasicConfigurator;
import utils.Log;
public class Hooks  {

    @Before(order=10)
    public void beforeTest(Scenario scenario) {
        BasicConfigurator.configure();
        Log.info("Старт сценария " + scenario.getName() + " Провалился");

    }
    @After
    public void afterTest(Scenario scenario) {
        if (scenario.isFailed()) {
            Log.warn("Сценарий " + scenario.getName() + " провалился");

        } else {
            Log.info("Старт сценария " + scenario.getName() + " Выполнен успешно");
        }

    }
}