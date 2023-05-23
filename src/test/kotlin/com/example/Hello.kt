package com.example

import com.thoughtworks.gauge.Step
import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Selenide.*

class Hello {
    @Step("HelloWorldを出力する")
    fun displayHello(): String {
        return "HelloWorld"
    }

    @Step("Googleのトップページを表示する")
    fun test() {
        open("https://www.google.com")
        `$`(".MV3Tnb").shouldBe(exactText("Googleについて"))
    }

}