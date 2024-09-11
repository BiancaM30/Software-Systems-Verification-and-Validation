package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//@RunWith(SerenityParameterizedRunner.class)
@RunWith(SerenityRunner.class)
@UseTestDataFrom("src/test/resources/goodLogin (2).csv")
public class Login {

    @Managed(uniqueSession = true, driver = "firefox")
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    String username, password;
    int works;

    @Test
    public void logIn() throws InterruptedException {
        System.out.println(username);
        System.out.println(password);
        loginSteps.login(username, password);

//        loginSteps.loginIs(works.equals(1));
        loginSteps.loginIs(works == 1);

    }
}