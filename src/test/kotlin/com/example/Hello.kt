package com.example

import com.thoughtworks.gauge.Step

class Hello {
    @Step("HelloWorldを出力する")
    fun displayHello(): String {
        return "HelloWorld"
    }
}