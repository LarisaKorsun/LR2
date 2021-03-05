package com.example.a2java;
//Класс "Книга" (Book) моделирует книгу единственного автора
public class Book {
    //private перемещенные-члены класса
    private String name;
    private Author author;
    private double price;
    private int qty;


    //Конструктор
    public Book(String name,Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    //Геттеры и сеттеры
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;//возвращает объект класса "Автор"(Author)
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    //Метод toString() описывает объект класса "Книга"
    public String toString(){
        return "" + name + "'-" + author;//author.toString()
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
