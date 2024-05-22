package com.dhruv.tests;

import org.openqa.selenium.WebDriver;
import com.dhruv.helper.BaseClass;
import com.dhruv.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        WebDriver driver = base.initializeDriver();

        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        String errorMessageText = loginPage.loginWithInvalidCred("rahul", "rahul123");
        System.out.println("The Error Message Is: " + errorMessageText);

        base.tearDown();
    }
}

