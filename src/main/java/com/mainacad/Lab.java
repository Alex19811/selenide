package com.mainacad;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Hello world!
 */
public class Lab {
    public static void main(String[] args) throws InterruptedException {
//        private static By info_Massage = By.cssSelector("p:nth-child(3) em");
//        private static By TextForm = By.cssSelector(".page-title-head h1");
//        private static By Link = By.cssSelector("[href='http\\:\\/\\/toolsqa\\.com\\/automation-practice-form\\/'] strong");
//        private static By FirstName = By.cssSelector("[name='firstname']");
//        private static By LastName = By.cssSelector("[name='lastname']");
//        private static By Sex = By.cssSelector("fieldset .control-group:nth-child(18) [name='sex']:nth-child(2)");
//        private static By YearsOfExperience = By.cssSelector("fieldset .control-group:nth-child(23) [name='exp']:nth-child(6)");
//        private static By Date = By.cssSelector("fieldset p:nth-child(26) [type]");
//        private static By AutomationToolQtp = By.cssSelector("fieldset .control-group:nth-child(40) [name='tool']:nth-child(2)");
//        private static By AutomationToolSeleniumUde = By.cssSelector("fieldset .control-group:nth-child(40) [name='tool']:nth-child(4)");
//        private static By ElementSpisok = By.cssSelector("[name='continents']");
//
//        private static By BrowserCommands = By.cssSelector(" [multiple] option:nth-of-type(1)");
//        private static By NavigationCommands = By.cssSelector(" [multiple] option:nth-of-type(2)");
//        private static By Button = By.cssSelector(" [name='submit']");
//        private static By InfoText1 = By.cssSelector(" .bcd");
//        private static By InfoText2 = By.cssSelector(" #NextedText");


        //TODO Открыть тестовую страницу: https://www.toolsqa.com/automation-practice-form
        open("https://www.toolsqa.com/automation-practice-form/");

        //TODO: Вывести в консоль текст Инфо сообщения
        System.out.println($("p:nth-child(3) em").text());

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println($(".page-title-head h1").text());

        //TODO: Кликнуть линк Partial Link Test
        $(byPartialLinkText("Partial Link")).click();
//        "[href='http\\:\\/\\/toolsqa\\.com\\/automation-practice-form\\/'] strong"
        //TODO: Заполнить поле First name:
        $("[name='firstname']").setValue("Bob");

        //TODO: Заполнить поле Last name:
        $("[name='lastname']").setValue("Jonson");

        //TODO: Выбрать пол
        $("fieldset .control-group:nth-child(18) [name='sex']:nth-child(2)").click();

        //TODO: Выбрать количество лет опыта
        $("fieldset .control-group:nth-child(23) [name='exp']:nth-child(6)").click();

        //TODO: Заполнить поле дата
        $("fieldset p:nth-child(26) [type]").setValue("22/05/2019");

        //TODO: Выбрать несколько Automation Tool
        $("fieldset .control-group:nth-child(40) [name='tool']:nth-child(2)").click();
        $("fieldset .control-group:nth-child(40) [name='tool']:nth-child(4)").click();

        //TODO: Выбрать континент из выпадающего списка
        $("[name='continents']").selectOption("Australia");

        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        $("[name='selenium_commands']").selectOption("Browser Commands", "Navigation Commands");
        Thread.sleep(1000);
        //TODO: Кликнуть на кнопку Button
        $(" [name='submit']").click();

        //TODO: Закрыть браузер

    }
}
