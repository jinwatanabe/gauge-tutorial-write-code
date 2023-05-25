import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Selenide.*
import com.thoughtworks.gauge.Step

class Hello {
    init {
        Configuration.baseUrl = "https://www.google.com" // selenide.baseUrlを設定
    }

    @Step("HelloWorldを出力する")
    fun displayHello(): String {
        return "HelloWorld"
    }

    @Step("Googleのトップページを表示する")
    fun test() {
        open("/")
        `$`(".MV3Tnb").shouldBe(exactText("Googleについて"))
    }
}