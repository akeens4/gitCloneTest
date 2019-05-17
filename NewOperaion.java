/**
 * NewOperaion
 */
import java.util.Scanner;
public class NewOperaion {
    private int firstValue;
    private int secondValue;
    private char operation;
    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
        //this.operation = operation;
        //this.secondValue = secondValue;

    }
    
    public int getFirstValue() {
        return firstValue;
    }
    public void setSecondValue(int secondValue){
        this.secondValue = secondValue;
    }
    public int getSecondValue() {
        return secondValue;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }
    public char getOperation() {
        return operation;
    }
    public void varOperation(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public int addition() {
        return firstValue + secondValue;
    }
    public int subtraction() {
        return firstValue - secondValue;
    }
    public int multiplication() {
        return firstValue * secondValue;
    }
    public int modulus() {
        return firstValue % secondValue;
    }
    public int power() {
        int multiplier = 1;
        for(int i = 0; i < secondValue;i++){
             multiplier = multiplier * firstValue;
             
        }   
        return c;     
    }
    public int division(){
        return firstValue / secondValue;
    }
    public static void main(String[] args) {
        NewOperaion compute = new NewOperaion();

        Scanner value = new Scanner(System.in);

        System.out.print("Enter the operation to perform: ");
        char operation = value.next().charAt(0); 
        compute.setOperation(operation);
        System.out.print("Enter first value: ");
        int firstValue = value.nextInt();
        compute.setFirstValue(firstValue);
        System.out.print("Enter Second value: ");
        int secondValue = value.nextInt();
        compute.setSecondValue(secondValue);
        compute.varOperation(firstValue, secondValue);


    if(compute.getOperation() == '+') {
        System.out.print(compute.addition());
    } else if(compute.getOperation() == '*') {
        System.out.print(compute.multiplication());
    } else if(compute.getOperation() == '-') {
        System.out.print(compute.subtraction());
    }else if(compute.getOperation() == '/') {
        System.out.print(compute.division());
    }else if(compute.getOperation() == '%') {
        System.out.print(compute.modulus());
    }else if(compute.getOperation() == '^'){
        System.out.print(compute.power());
    }
        value.close();
    }
}