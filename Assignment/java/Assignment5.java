import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
class BalanceException extends Exception{
    public String toString(){
        return "Minimum limit 1000 must be maintain!!!";
    }
}
class SuperClass18{
    void display(){
        out.println("Super18 Class Display.");
    }
}
class SubClass18 extends SuperClass18{
    @Override
    void display(){
        out.println("Throwing Runtime exception divide by zero.");
        int a=1/0;
    }
}
class SuperClass19{
    void display() throws Exception{
        out.println("Super19 Class Display");
    }
}
class SubClass19 extends SuperClass19{
    @Override
    void display() throws Error{
        out.println("Throwing Error that are not subclass of Exception.");
        throw new Error("SubClass19: Error Occured");
    }
}
class BankAccount{
    private int balance = 0;
    BankAccount(){
        balance=1000;
        out.println("Account Created with amount 1000.");
    }
    void deposit(int n){
        if(n<=0){
            out.println("Can't deposit negative amount");
        }
        else{
            balance+=n;
            out.println("The amount is deposited Successfylly");
        }
    }
    void withdraw(int bal) throws BalanceException{
        if((balance-Math.abs(bal)) < 1000){
            throw new BalanceException();
        }
        else{
            balance-=bal;
            out.println("Amount is Withdrawn successfully.");
        }
    }
}
class Assignment5 {
    static void first(){
        try{
            int a=15/0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static void second(){
        try{
            int a=15/0;
        }
        catch(Exception e){
            out.println(e.toString());
        }
    }
    static void third(){
        try{
            int a=15/0;
        }
        catch(Exception e){
            out.println(e.getMessage());
        }
    }
    static void fourth(){
        try {
            int a = 15/0;
        } catch (ArithmeticException e) {
            out.println("Divided by Zero.");
        }
    }
    static void fifth(){
        try{
            String s=null;
            int a = s.length();
        }
        catch(NullPointerException e){
            out.println(e.toString());
        }
    }
    
    static void sixth(){
        try{
        String s="Hello";
        out.println("Trying to access index out of range");
        out.println(s.charAt(6));
        }
        catch(StringIndexOutOfBoundsException e){
            out.println(e.toString());
        }
    }
    static void seventh(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("FileNotFound.txt"));
        }
        catch(FileNotFoundException e){
            out.println("FileNotFound.txt File Not found.");
        }
    }
    static void eigth(){
        try{
            int s = Integer.parseInt("3.4.4");
        }
        catch(NumberFormatException e){
            out.println("Number is in inproper format.");
        }
    }
    static void nineth(){
        try{
            int[] arr={1,2,3};
            out.println("Trying to access non exist index of array.");
            out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            out.println("Index out of range");
        }
    }
    static void tenth(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("FileNotFound.txt"));
            String line = reader.readLine();
        } catch (IOException e) {
            out.println("IOError");            
        }
    }
    static void eleventh(){
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        Iterator<String> iterator = list.iterator();

        while (true) {
            try {
                String element = iterator.next();
                System.out.println("Element: " + element);
            } catch (NoSuchElementException e) {
                System.out.println("No more elements available");
                break;
            }
        }
    }
    static void twelvth(){
        try {
            Class.forName("MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
    static void thirteen(){
        BankAccount b = new BankAccount();
        b.deposit(100);
        try{
            b.withdraw(200);
        }
        catch(BalanceException e){
            out.println(e.toString());
        }
    }
    static void fourteen(){
        try{
            int a=15/0;
        }
        catch(IndexOutOfBoundsException e){
            out.println("Not going to work");
        }
        finally{
            out.println("In finally without going to catch!!!");
        }
    }
    static void fifteen(){
        thirteen();
    }
    static void sixteen(){
        thirteen();
    }
    static void seventeen(){
        try{
            throw new IOException("IO Error").initCause(new EOFException("Reach File Ending"));
        }
        catch(Throwable e){
            out.println("This is the Exception: "+e.toString());
            out.println("This is the reason: "+e.getCause());
        }
    }
    static void eighteen(){
        SuperClass18 su = new SubClass18();
        try{
            su.display();
        }
        catch(ArithmeticException e){
            out.println(e.toString());
        }
    }
    static void nineteen(){
        SuperClass19 su = new SubClass19();
        try{
            su.display();
        }
        catch(Exception e){
            out.println(e.toString());
        }
        catch(Error e){
            out.println(e.getMessage());
        }  
    }
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();
        seventh();
        eigth();
        nineth();
        tenth();
        eleventh();
        twelvth();
        thirteen();
        // fourteen(); it will break the code
        // fifteen(); //as a part of thirteen
        // sixteen(); //as a part of thirteen
        seventeen();
        eighteen();
        nineteen();
    }   
}