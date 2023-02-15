package Company;

import java.util.Scanner;

public class mini_project_03_calculator {
/*
    public static int Additon(int n)
    {

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter First number to be add:-" );
        int a= Sc.nextInt();
        System.out.println("Enter First number to be add:-" );
        int b=Sc.nextInt();
        int Add=a+b;

        System.out.println("The Addition of two number is "+Add);
        return n;
    }
    public static int Subtraction(int n){

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter First number to be add:-" );
        int a= Sc.nextInt();
        System.out.println("Enter Second number to be add:-" );
        int b=Sc.nextInt();
        int sub=a-b;

        System.out.println("The Addition of two number is "+sub);
        return n;
        }
    }
    public static int multiplication(int n){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter First number to be add:-" );
        int a= Sc.nextInt();
        System.out.println("Enter First number to be add:-" );
        int b=Sc.nextInt();
        int Multi=a*b;

        System.out.println("The Multiplication of two number is "+Multi);
        return n;

    }

    public static int Divide(int n){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter First number to be add:-" );
        int a= Sc.nextInt();
        System.out.println("Enter First number to be add:-" );
        int b=Sc.nextInt();
        int Div=a/b;

        System.out.println("The Multiplication of two number is "+Div);
        return n;
    }     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("1]  Additon");
        System.out.println("2]  subtraction");
        System.out.println("3]  Multiplication");
        System.out.println("4]  Divide");

        System.out.println("Enter which process u want to select:-\t\n");
        int operator=sc.next().charAt(0);

        System.out.println("Enter First  number:\t\n ");
        double input1=sc.nextDouble();

        System.out.println("Enter Second number:\t\n ");
        double input2=sc.nextDouble();



        switch (operator)
        {
            case '1':
                            System.out.println("ADDITION");
                            double ADD=input1+input2;
                            System.out.println(ADD);
                            break;
            case '2':
                            System.out.println("SUBTRACTION");
                            double SUB=input1-input2;
                            System.out.println(SUB);
                            break;
            case '3':
                            System.out.println("Multiplication");
                            double MULT=input1*input2;
                            System.out.println(MULT);
                            break;

            case '4':
                            System.out.println("DIVIDE");
                            double DIV=input1/input2;
                            System.out.println(DIV);
                            break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}