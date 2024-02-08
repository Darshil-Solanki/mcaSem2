import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import static java.lang.System.out;
class Account{
    int balance=0;
    public Account(int n){
        balance=n;
    }
    void deposit(int n){
        balance+=n;
        out.println("The Amount of " + n + " deposited successfully.");
    }
    void display(){
        out.println("Current Balance is:"+balance);
    }
}
class Whistle{
    private String sound="";
    public Whistle(String whistleSound){
        sound=whistleSound;
    }
    public void sound(){
        out.println("Sound:"+sound);
    }
}
class Books{
    private ArrayList<String> title = new ArrayList<>();
    private ArrayList<Integer> Pages = new ArrayList<>();
    private ArrayList<String> year = new ArrayList<>();
    void getBook(Scanner sc){
        while(true){
            out.println("Enter title, no. of pages and publication year separated by ,");
            String bookStr=sc.nextLine().trim();
            if (bookStr.isEmpty())
                break;
            else{
                String[] bookArr=bookStr.split(",");
                if(bookArr.length==3){
                    title.add(bookArr[0]);
                    Pages.add(Integer.parseInt(bookArr[1]));
                    year.add(bookArr[2]);
                }
                else
                    out.println("Not Proper Data.");
            }

        }
    }
    void displayName(){
        for(int i=0;i<title.size();i++){
            out.println("Name: "+title.get(i));
        }
    }
    void display(){
        for(int i=0;i<title.size();i++){
            out.println("Title: "+title.get(i));
            out.println("No. of Page:"+Pages.get(i));
            out.println("Publication Year:"+year.get(i)+"\n");
        }
    }
}
class Cube{
    private int side=0;
    Cube(int s){
        side=s;
    }
    void volume(){
        out.println("Volume of cube with side "+side+" is "+(side*side*side));
    }
    public String toString(){
        return "The length of the edge is "+side+" and the volume "+(side*side*side);
    }
}
class Person{
    private String name="";
    private String birthday = "";
    Person(String n,String bdate){
        name=n;
        birthday=bdate;
    }
    public boolean equals(Person o){
        if(this.name==o.name && this.birthday == o.birthday)
            return true;
        else
            return false;
    }
}
abstract class Accounts{
    private int balance=0;
    void deposit(int n){
        if(n>0)
            balance+=n;
        else
            out.println("Error occured!!");
    }
    void withdraw(int n){
        if(n>0 && n<=balance){
            balance-=n;
            out.println("The Amount "+n+" is withdrawn successfully.");
        }
        else
            out.println("Error Occured!!!");
    }
    int getBalance(){
        return balance;
    }
    abstract void displayInterest();
}
class SavingsAccount extends Accounts{
    void displayInterest(){
        out.println("Savings account interest with balance "+super.getBalance()+" is "+(super.getBalance()*0.027));
    }
}
class CheckingAccount extends Accounts{
    void displayInterest(){
        out.println("Checking account interest with balance "+super.getBalance()+" is "+(super.getBalance()*0.01));
    }
}
class Employee{
    protected String name="";
    protected int empId=0;
    protected int salary=0;
    Employee(String n,int eId,int sal){
        name=n;
        empId=eId;
        salary=sal;
    }
    void display(){
        out.println("Employee's name "+name+" with Employee id: "+empId);
    }
}
class Manager extends Employee{
    Manager(String n,int eId,int sal){
        super(n,eId,sal);
    }
    void display(){
        out.println("Manager's name "+name+" with Employee id: "+empId);
    }
}
class Developer extends Employee{
    Developer(String n,int eId,int sal){
        super(n,eId,sal);
    }
    void display(){
        out.println("Developer's name "+name+" with Employee id: "+empId);
    }
}
class Assignment3 {
    static void first(Scanner sc){
        Account a = new Account(100);
        a.deposit(20);
        a.display();
    }
    static void second(Scanner sc){
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
    static void third(Scanner sc){
        Books b = new Books();
        b.getBook(sc);
        out.println("Enter 'name' or 'everything' to get details of book accordingly:");
        String s=sc.nextLine();
        if (s.equals("name"))
            b.displayName();
        else
            b.display();
    }
    static void fourth(Scanner sc){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line=reader.readLine();
            while (line!=null){
                out.println(line);
                line=reader.readLine();
            }
            reader.close();
        }
        catch(IOException i){
            out.println("Error occured:"+i.toString());
        }
    }
    static void fifth(Scanner sc){
        out.println("Enter file name to be read:");
        String filename=sc.nextLine();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename+".txt"));
            String line=reader.readLine();
            String data=line;
            while (line!=null){
                line=reader.readLine();
                data+=line;
            }
            out.println("Enter a string to find:");
            String substr=sc.nextLine();
            if(data.contains(substr))
                out.println("Found!");
            else
                out.println("Not Found.");
            
            reader.close();
        }
        catch(IOException i){
            out.println("Error occured: Reading the file "+filename+"failed");
        }
    }
    static void sixth(Scanner sc){
        out.println("Enter edge of cube:");
        int side=sc.nextInt();
        Cube c = new Cube(side);
        c.volume();
        out.println(c.toString());
    }
    static void seventh(Scanner sc){
        Person p1 = new Person("darshil","20-03-2001");
        Person p2 = new Person("darshi","20-03-2001");
        if(p1.equals(p2))
            out.println("p1 is same as p2");
        else
            out.println("p1 is not same as p2");
    }
    static void eigth(Scanner sc){
        SavingsAccount s = new SavingsAccount();
        CheckingAccount c = new CheckingAccount();
        s.deposit(100);
        c.deposit(100);
        s.displayInterest();
        c.displayInterest();
        s.deposit(20);
        c.withdraw(20);
        s.displayInterest();
        c.displayInterest();
    }
    static void nineth(Scanner sc){
        Employee e = new Employee("aaryan",3,30000);
        Manager m = new Manager("darshil", 1, 80000);
        Developer d = new Developer("pratham", 2, 50000);
        e.display();
        m.display();
        d.display();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        first(sc);
        second(sc);
        third(sc);
        fourth(sc);
        fifth(sc);
        sixth(sc);
        seventh(sc);
        eigth(sc);
        nineth(sc);
    }
}