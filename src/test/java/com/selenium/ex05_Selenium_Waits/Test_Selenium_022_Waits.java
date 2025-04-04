package com.selenium.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_022_Waits {
    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price(){

        EdgeDriver edgeDriver = new EdgeDriver();
         edgeDriver.get("https://app.vwo.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
