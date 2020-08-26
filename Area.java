import java.util.Scanner;
class Shape{
protected String shapeName;
public Shape()
{
String shapeName;
}
double calculateArea()
{
return 0;
}
}
class Square extends Shape{
private int side;
public Square(int a)
{
    int side=a;
}
double calculateArea(int side)
{
double area=side*side;
return area;
}}
class Rectangle extends Shape{
private int length;
private int breadth;
public Rectangle(int a,int b)
{
    int length=a;
    int breadth=b;
 }
double calculateArea(int length,int breadth)
{
double area1=length*breadth;
return area1;
}}
class Circle extends Shape{
private int radius;
public Circle(int a)
{
    int radius=a;
}
double calculateArea(int radius)
{
double area3=3.14*radius*radius;
return area3;
}}
class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("1. Rectangle"+"\n"+"2. Square"+"\n"+"3. Circle"+"\n"+"Area Calculator --- Choose your shape");
int a=sc.nextInt();

switch(a)
{
case 1:
{
System.out.println("Enter length and breadth:");
int l=sc.nextInt();
int b=sc.nextInt();
Rectangle obj1=new Rectangle(l,b);
double area=obj1.calculateArea(l,b);
System.out.println("Area of Rectangle is:"+area);
break;
}
case 2:
{
System.out.println("Enter side:");
int s=sc.nextInt();

Square obj2=new Square(s);
double area2=obj2.calculateArea(s);
System.out.println("Area of Square is:"+area2);
break;
}
case 3:
{
System.out.println("Enter Radius:");
int r=sc.nextInt();

Square obj3=new Square(r);
double area3=obj3.calculateArea(r);
System.out.println("Area of Circle is:"+area3);
return;
}
}}}}
