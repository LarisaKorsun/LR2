package com.example.a2java;

import org.junit.Test;

public class TestAuthor {

    @Test
    public void AuthorTest(){
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
