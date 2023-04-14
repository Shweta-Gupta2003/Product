import java.util.*;
class Product
{
int r,q;
Product(int rate,int quantity)
{
r=rate;
q=quantity;
}
}

class Purchase extends Product
{
int amt;
Purchase(int r,int q)
{
super(r,q);
amt=0;
}
void Find()
{
amt=r*q;
}
}

class Discount extends Purchase
{
int dis,finalAmt;
Discount(int r,int q)
{
super(r,q);
dis=0;
finalAmt=0;
}

void calculate()
{
if(amt>5000)
{
dis=10*amt/100;
}
else
{
dis=500;
}
}

void display()
{
finalAmt=amt-dis;
System.out.println("Final amount is "+ finalAmt);
}
}

class Main1
{
public static void main(String args[])
{
Discount d=new Discount(90,100);
d.Find();
d.calculate();
d.display();
}
}


