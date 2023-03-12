package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;
import lombok.Value;
import lombok.val;


public class LoginPage {

    private SelenideElement loginFieled = $("[data-test-id=login] input");
    private SelenideElement passwordFieled = $("[data-test-id=password] input");
    private SelenideElement loginButton = $("[data-test-id=action-login]");


    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginFieled.setValue(info.getLogin());
        passwordFieled.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}
