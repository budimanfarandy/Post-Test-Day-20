package com.juaracoding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FinancialRecordTest {

    public static AndroidDriver<MobileElement>driver;
    private FinancialRecordTest financialRecordTest;


    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 2 API 30");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        financialRecordTest = new FinancialRecordTest(driver);
    }

    @Test
    public void testAdd() {
        financialRecordTest.findAdd();
        System.out.println("Hasil 1 = "+financialRecordTest.getTxtResult());
        Assert.assertEquals(financialRecordTest.getTxtResult(), "Gaji Bulanan");
    }
    @Test
    public void testOut() {
        financialRecordTest.findOut();
        System.out.println("Hasil 2 = "+financialRecordTest.getTxtResultDua());
        Assert.assertEquals(financialRecordTest.getTxtResultDua(),"Pengeluaran Tagihan Listrik");
    }



    @AfterClass
    public void closeApp() {
        driver.quit();
    }

}