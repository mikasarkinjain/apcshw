// MIKA SARKIN JAIN
// pd 8
// HW27
// 2012-11-18

public class Rational{
private int numerator;
private int denominator;

public Rational(){
numerator = 0;
denominator = 1;
}

public Rational(int n, int d){
if (d == 0){
System.out.println("The Denominator cannot be zero.");
numerator = 0;
denominator = 1;
}
else {
numerator = n;
denominator = d;
}
}

public String toString(){
return numerator + "/" + denominator; 
} 

public double floatValue(){
return numerator/(1.0*denominator); 
}

public void multiply(Rational n){
numerator *= n.numerator;
denominator *= n.denominator;
}

public void divide(Rational n){
numerator *= n.denominator;
denominator *= n.numerator;
}

public void add(Rational n){
int d1 = denominator;
denominator *= n.denominator;
numerator *= n.denominator;
numerator += n.numerator * d1;
}

public void subtract(Rational n){
int d1 = denominator;
denominator *= n.denominator;
numerator *= n.denominator;
numerator -= n.numerator * d1;
}

public static int gcd(int a, int b){
if (a > b){int c = a; a = b; b = c;}
if (b%a == 0){return a;}
else {return gcd(a, b%a);}
}

public void reduce(){
int gcd = gcd(numerator, denominator);
numerator /= gcd;
denominator /= gcd;
}

public int compareTo(Rational n){
if (this.floatValue() == n.floatValue()) {return 0;}
if (this.floatValue() > n.floatValue()) {return 1;}
return -1;
}

public static void main(String args[]){
Rational a = new Rational(1, 2);
Rational b = new Rational(1, 3);
Rational c = new Rational();
Rational d = new Rational(1,0);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(a.floatValue());
System.out.println(b.floatValue());
a.multiply(b);
System.out.println(a);
a.divide(b);
System.out.println(a);
a.add(b);
System.out.println(a);
a.subtract(b);
System.out.println(a);
a.reduce();
System.out.println(a);
System.out.println(a.compareTo(b));
System.out.println(b.compareTo(a));
System.out.println(c.compareTo(d));
System.out.println(Rational.gcd(8,12));
}
}