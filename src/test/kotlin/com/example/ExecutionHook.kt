package com.example

import com.codeborne.selenide.Selenide
import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.AfterSuite
import com.thoughtworks.gauge.BeforeSuite
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class ExecutionHook {
    lateinit var driver: WebDriver // driverをプロパティとして定義

    @BeforeSuite
    fun setup() {
        val options = ChromeOptions()
        options.addArguments("--port=25257") // CHROMEDRIVER_PORTと同じポート番号を指定
        driver = ChromeDriver(options) // driverをクラスのプロパティに代入
        System.setProperty("chromeoptions.args", "--no-sandbox,--disable-dev-shm-usage,--remote-allow-origins=*")
        driver.close()
    }

//    @AfterScenario
//    fun tearDownScenario() {
//        Selenide.webdriver().driver().clearCookies()
//        Selenide.localStorage().clear()
//        Selenide.sessionStorage().clear()
//    }

    @AfterSuite
    fun tearDown() {
        println("~~~~~~~~~~~~~~~~~")
        Selenide.closeWindow()
    }
}
