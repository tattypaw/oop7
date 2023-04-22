import java.util.Date;

public class Calculator {

private double real;
private double imaginary;

public Calculator(double r, double i) {
real = r;
imaginary = i;
}

public void add(Calculator c) {
real += c.real;
imaginary += c.imaginary;
}

public void subtract(Calculator c) {
real -= c.real;
imaginary -= c.imaginary;
}

public void multiply(Calculator c) {
double tempReal = real;
double tempImaginary = imaginary;
real = (tempReal * c.real) - (tempImaginary * c.imaginary);
imaginary = (tempReal * c.imaginary) + (tempImaginary * c.real);
}

public void divide(Calculator c) {
double tempReal = real;
double tempImaginary = imaginary;
double temp = (c.real * c.real) + (c.imaginary * c.imaginary);
real = ((tempReal * c.real) + (tempImaginary * c.imaginary)) / temp;
imaginary = ((tempImaginary * c.real) - (tempReal * c.imaginary)) / temp;
}

public double getReal() {
return real;
}

public double getImaginary() {
return imaginary;
}

public void setReal(double real) {
this.real = real;
}

public void setImaginary(double imaginary) {
this.imaginary = imaginary;
}

public static void main(String[] args) {
Calculator c1 = new Calculator(5, -6);
Calculator c2 = new Calculator(-2, 4);

System.out.println("c1= " + c1.getReal() + " + " + c1.getImaginary() + "i");
System.out.println("c2= " + c2.getReal() + " + " + c2.getImaginary() + "i");

c1.add(c2);

System.out.println("add = " + c1.getReal() + " + " + c1.getImaginary() + "i");

c1.subtract(c2);

System.out.println("subtract = " +c1.getReal() + " + " + c1.getImaginary() + "i");

c1.multiply(c2);

System.out.println("multiply = " +c1.getReal() + " + " + c1.getImaginary() + "i");

c1.divide(c2);

System.out.println("divide = " +c1.getReal() + " + " + c1.getImaginary() + "i");

// журналирование действий пользователя
logAction("Выполнены математические операции", new Date());
}

// логирование действий пользователя
public static void logAction(String message, Date date) {
// код для записи действий в файл или базу данных
}
}
