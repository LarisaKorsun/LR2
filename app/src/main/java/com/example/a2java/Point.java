package com.example.a2java;
//Класс Point моделирует точку (x, y)
public class Point {
    //private переменные-члены класса
    private int x, y;

    //Конструкторы(перегружаемые)
    public Point() {  //Конструктор по умолчанию
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;


    }


    //Метод toString(), Возвращающий "(x,y)"
    public String toString(){
    return "("+this.x+","+this.y+")";
    }

    //Метод, Возвращающий массив типа int из двух элементов,
    //содержащий координаты x и y.

    public int[] getXY(){
    int[] results=new int[2];
    results[0]=this.x;
    results[1]=this.y;
    return results;
    }

    //Сеттер-Установим координаты x и y
    public void setXY(int x, int y){
    this.x=x;
    this.y=y;
    }

    //Возвращает растояние от данного объекта до заданной точки (x,y)
    public  double distance(int x, int y){
    int xDiff=this.x-x;
    int yDiff=this.y-y;
    return  Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    //Возвращает расстояние от данного объекта до заданной точки-
    //объекта класса Point с именем another

    public double distance(Point another){
    int xDiff=this.x - another.x;
    int yDiff=this.y - another.y;
    return  Math.sqrt(this.x*this.x+this.y*this.y);

    }

}
