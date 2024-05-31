import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("SELECT OPERATION ");
        System.out.println("1. Basic Arithmetic Operation \n \ti). + \tii). - \tiii). * \tiv)./");
        System.out.println("2. Area \n \ti).Circle \tii).Rectangle \tiii).Triangle");
        System.out.println("3. Volume \n \ti).Sphere \tii).Cubic \tiii).Cylinder ");
        System.out.println("4. Unit Conversion \n \ti).in --> cm \tii).cm --> in \tiii).ft --> m \n\tiv).m --> ft \tv).°F --> °C \tvi).°C --> °F  ");

        int select = calc.nextInt();

        switch (select) {

            case 1:
                System.out.println("Enter first number:");
                double num1 = calc.nextDouble();

                System.out.println("Enter second number:");
                double num2 = calc.nextDouble();

                System.out.println("Select operation \n \t 1 ( + ) \n \t 2 ( - ) \n \t 3 ( * )\n \t 4 ( / )");


                int operator = calc.nextInt();

                double result;
                switch (operator) {

                    case 1:
                        result = num1 + num2;
                        System.out.println("Result -: " +result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result -: " +result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result -: " +result);
                        break;

                    case 4:
                        result = num1 / num2;
                        if (num2 == 0) {
                            System.out.println("Error! Division by zero is not allowed."+result);
                        }
                        System.out.println("Result -: " +result);
                        break;

                    default:
                        System.out.println("Invalid operator Select");
                }


                break;

            case 2:
                System.out.println("Select shape");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");

                int shape1 = calc.nextInt();

                double area;

                switch (shape1) {

                    case 1:
                        System.out.println("Enter radius:");
                        double radius = calc.nextDouble();
                        area = Math.PI * radius * radius;
                        System.out.println("Area -: " +area);
                        break;

                    case 2:
                        System.out.println("Enter length:");
                        double length = calc.nextDouble();
                        System.out.println("Enter width:");
                        double width = calc.nextDouble();
                        area = length * width;
                        System.out.println("Area -: " +area);
                        break;

                    case 3:
                        System.out.println("Enter the base");
                        double base = calc.nextDouble();
                        System.out.println("Enter the height");
                        double height = calc.nextDouble();
                        area = 0.5*height*base;
                        System.out.println("Area -: " +area);
                        break;

                    default:
                        System.out.println("Invalid Selection");

                }

                break;

            case 3:

                System.out.println("Select Shape");
                System.out.println("1.Sphere");
                System.out.println("2.Cubic");
                System.out.println("3.Cylinder");

                int shape2 = calc.nextInt();

                double volume;
                switch (shape2){
                    case 1:
                        System.out.println("Enter Radius");
                        double radius = calc.nextDouble();
                        volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
                        System.out.println("Volume -: "+volume);
                        break;
                    case 2:
                        System.out.println("Enter Length");
                        double length2 = calc.nextDouble();
                        System.out.println("Enter Height");
                        double height2 = calc.nextDouble();
                        System.out.println("Enter Width");
                        double width2 = calc.nextDouble();
                        volume = length2 * height2 * width2;
                        System.out.println("Volume -: "+volume);
                        break;

                    case 3:
                        System.out.println("Enter Height");
                        double height = calc.nextDouble();
                        System.out.println("Enter Radius");
                        double rad = calc.nextDouble();
                        volume = rad*rad*height*Math.PI;
                        System.out.println("Volume -: "+volume);

                        break;
                    default:
                        System.out.println("Invalid Selection");

                }
                break;

            case 4:
                System.out.println("Select Unit To Conversion");
                System.out.println("1. Inches to Centimeters");
                System.out.println("2. Centimeters to Inches");
                System.out.println("3. Feet to Meters");
                System.out.println("4. Meters to Feet's");
                System.out.println("5. Fahrenheit to Celsius");
                System.out.println("6. Celsius to Fahrenheit");

                int units = calc.nextInt();

                double unit;

                switch (units){

                    case 1:
                        System.out.println("Enter length in Inches");
                        double inch=calc.nextDouble();
                        unit = inch * 2.54;
                        System.out.println("Result -: " +unit + "cm");
                        break;

                    case 2:
                        System.out.println("Enter length in Centimetres");
                        double cm=calc.nextDouble();
                        unit = cm / 2.54;
                        System.out.println("Result -: "+unit+ "inch");
                        break;

                    case 3:
                        System.out.println("Enter length in Feet");
                        double feet=calc.nextDouble();
                        unit = feet * 0.3048;
                        System.out.println();
                        System.out.println("Result -: "+unit+ "Meters");
                        break;

                    case 4:
                        System.out.println("Enter length in Meters");
                        double meter= calc.nextDouble();
                        unit = meter / 0.3048;
                        System.out.println("Result -: "+unit+ "feet");
                        break;

                    case 5:
                        System.out.println("Enter Temperature In Fahrenheit ");
                        double fahrenheit = calc.nextDouble();
                        unit = (fahrenheit - 32 ) * 5/9;
                        System.out.println("Result -: "+unit+ "°C");
                        break;

                    case 6:
                        System.out.println("Enter Temperature in Celsius");
                        double celsius = calc.nextDouble();
                        unit = (9f/5) * celsius + 32;
                        System.out.println("Result -: "+unit+ "°F");
                        break;

                    default:

                        System.out.println("Invalid Selection");


                }
                break;

            default:
                System.out.println("Invalid Selection");

        }
    calc.close();
    }
}