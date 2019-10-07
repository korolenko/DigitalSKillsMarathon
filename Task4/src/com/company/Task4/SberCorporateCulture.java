package com.company.Task4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SberCorporateCulture{
    private static final String result = "Миссия и ценности\n" +
            "\n" +
            "Миссия банка:\n" +
            "\n" +
            "Мы даем людям уверенность и надежность, мы делаем их жизнь лучше, помогая реализовывать устремления и мечты.\n" +
            "Наша миссия определяет смысл и содержание деятельности Сбербанка, подчеркивая его важнейшую роль в экономике России. Наши клиенты, их потребности, мечты и цели есть основа всей деятельности банка как организации. Миссия банка также устанавливает амбициозную цель наших устремлений — стать одной из лучших финансовых компаний мира — и подчеркивает, насколько важны для Сбербанка его сотрудники, и насколько реализация его целей невозможна без реализации их личных и профессиональных целей. Высокие цели достигаются командой единомышленников, которых объединяет общая система ценностей.\n" +
            "\n" +
            "Наши ценности:\n" +
            "\n" +
            "Наши ценности – основа отношения к жизни и работе, внутренний компас, помогающий принимать решения в сложных ситуациях, принципы, верность которым мы храним всегда и везде.\n" +
            "\n" +
            "Ориентиры, которые помогают нам принимать верные решения в любых ситуациях:\n" +
            "\n" +
            "Я – лидер \n" +
            "Я принимаю ответственность за себя и за то, что происходит вокруг\n" +
            "Я честен с собой, коллегами и клиентами\n" +
            "Я совершенствую себя, наш банк и наше окружение, делая лучшее на что способен\n" +
            "Мы – команда \n" +
            "Мы с готовностью помогаем друг другу, работая на общий результат\n" +
            "Мы помогаем расти и развиваться нашим коллегам\n" +
            "Мы открыты, уважаем коллег и доверяем друг другу\n" +
            "Все – для клиента \n" +
            "Вся наша деятельность построена вокруг и ради интересов клиентов\n" +
            "Мы хотим удивлять и радовать клиентов качеством услуг и отношением\n" +
            "Мы превосходим ожидания клиентов";

    void showCorporateCulture() throws InputMismatchException {

        System.out.println("Данная программа знает, в чем заключается миссия и ценности Сбербанка");
        System.out.println("Вы можете спросить об этом, напишите вопрос:('Перечислите ценности Сбербанка')..");

        Scanner in = new Scanner(System.in);

        //считываем входные данные из консоли
        String request = in.nextLine();

        //убираем пробелы
        request =request.replaceAll("\\s+","");

        //обработка незначительных опечаток, отсутствие влияние регистра и принятие производных от Сбер как валидный вопрос
        if (request.toLowerCase().matches("перечисли.*ценностисбер.*")){
            System.out.println(result);
        }
        else {
            throw new InputMismatchException("Вы задали непонятный вопрос, пожалуйста, перефразируйте");
        }
    }
}
