package com.example.a2java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        //Проверка конструктора и метода toString()
        Author Ivanov = new Author("Иванов", "ivan@nikuda.com");
        System.out.println(Ivanov);//Проверка toString()

        //Проверка сеттеров и геттеров
        Ivanov.setEmail("ivan@nikuda.com");
        System.out.println(Ivanov);//проверка toString
        System.out.println("имя"+Ivanov.getName());
        System.out.println("email"+Ivanov.getEmail());
    }
}