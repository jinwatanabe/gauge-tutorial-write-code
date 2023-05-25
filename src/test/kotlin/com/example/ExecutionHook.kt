package com.example

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
    }
}
