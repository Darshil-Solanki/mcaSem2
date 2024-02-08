import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;

interface Shape {
    public void getArea();
}
class Rectangle implements Shape{
    private int length=3;
    private int width=4;
    public void getArea(){
        out.println("Area of Rectangle is:"+(length+width));
    }
}
class Circle implements Shape{
    private int r=3;
    public void getArea(){
        out.println("Area of Circus is:"+(3.14f*r*r));
    }
}
class Triangle implements Shape{
    private int height=3;
    private int base=4;
    public void getArea(){
        out.println("Area of Triangle is:"+(0.5f*base*height));
    }
}
interface Animal{
    public void bark();
}
class Dog implements Animal{
    public void bark(){
        out.println("Dog is barking");
    }
}

interface Flyable {
    public void fly_obj();    
}
class Spacecraft implements Flyable{
    public void fly_obj(){
        out.println("Spacecraft is launching");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        out.println("Airplane is taking off");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        out.println("Helicopter is flying");
    }
}
interface Accounts{
    public void deposit(int bal);
    public void withdraw(int withdraw);
    public void interest();
    public void show_balance();
}
class Bank {
    private ArrayList<Accounts> accounts = new ArrayList<Accounts>();
    void addAccount(Accounts a){
        accounts.add(a);
        out.println("Account created and added to Bank.");
    }
}
class SavingsAccount implements Accounts{
    private int balance=0;
    public void deposit(int bal){
        if(bal>0){
            balance+=bal;
            out.println("Deposited Successfully.");
        }else
            out.println("Error in deposit");
    }
    public void withdraw(int withdraw){
        if(balance>withdraw){
            balance-=withdraw;
            out.println("Withdrown Successfully.");
        }
        else
            out.println("Error in Withdrawal.");
    }
    public void interest(){
        if(balance==0)
            out.println("No interest");
        else
            out.println("Interest amount on your balance is: "+(0.027*balance));
    }
    public void show_balance(){
        out.println("Savings Account balance is: "+balance);
    }
}
class CurrentAccount implements Accounts{
    private int balance=0;
    public void deposit(int bal){
        if(bal>0){
            balance+=bal;
            out.println("Deposited Successfully.");
        }else
            out.println("Error in deposit");
    }
    public void withdraw(int withdraw){
        if(balance>withdraw){
            balance-=withdraw;
            out.println("Withdrown Successfully.");
        }
        else
            out.println("Error in Withdrawal.");
    }
    public void interest(){
        if(balance==0)
            out.println("No interest");
        else
            out.println("Interest amount on your balance is: "+(0.01*balance));
    }
    public void show_balance(){
        out.println("Current Account balance is: "+balance);
    }
}

interface Resizable {
    public void resizeWidth(int width);
    public void resizeHeight(int height);
}

class Rectangles{
    int height=0;
    int width=0;
    public void resizeHeight(int h){
        height+=h;
        out.println("New height is: "+height);
    }    
    public void resizeWidth(int w){
        width+=w;
        out.println("New Width is: "+width);
    }    
}

interface Drawable {
    public void draw();
}
class Circles implements Drawable{
    public void draw(){
        out.println("Drawing Circle");
    }
}
class Triangles implements Drawable{
    public void draw(){
        out.println("Drawing Triangle");
    }
}
class Rectangle_ implements Drawable{
    public void draw(){
        out.println("Drawing Rectangle");
    }
}

interface Sortable{
    public void sort();
}
class BubbleSort implements Sortable{
    int[] arr={6,1,4,2,8,5,3,9,0,7};
    public void sort(){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        out.println("Bubble sort, Sorted Array: "+Arrays.toString(arr));
    }
}
class SelectionSort implements Sortable{
    int[] arr={6,1,4,2,8,5,3,9,0,7};
    public void sort(){
        int min,temp;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        out.println("Selection sort, Sorted Array: "+Arrays.toString(arr));
    }
}
class MergeSort implements Sortable{
    int[] arr = {6,1,4,2,8,5,3,9,0,7};
    public void mergeArray(int[] arr,int beg, int mid, int end){
        int l,r,i;
        int temp[] = new int[arr.length];
        for(l=beg,r=mid+1,i=beg; l<=mid && r<=end;i++){
            if(arr[l]<=arr[r])
                temp[i]=arr[l++];
            else
                temp[i]=arr[r++];
        }
        while(l<=mid)
            temp[i++]=arr[l++];
        while(r<=end)
            temp[i++]=arr[r++];
            
        for(i=beg;i<=end;i++)
            arr[i]=temp[i];
    }
    public void mergeSort(int[] arr,int beg,int end){
        int mid;
        if(beg<end){
            mid=(beg+end)/2;        
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);
            mergeArray(arr, beg, mid, end);
        }
    }
    public void sort(){
        mergeSort(arr,0,9);
        out.println("Merge sort, Sorted Array is: "+Arrays.toString(arr));
    }
}
class QuickSort implements Sortable{
    int[] arr={6,1,4,2,8,5,3,9,0,7};
    int partition(int[] arr,int beg,int end){
        int pivot = arr[beg];
        int i= beg+1;
        int j=end;
        int temp;
        do{
            while(i<=end && arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }while(i<j);
        temp=arr[beg];
        arr[beg]=arr[j];
        arr[j]=temp;
        return j;
    }
    void quickSort(int arr[],int beg,int end){
        if(beg<end){
            int p = partition(arr,beg,end);
            quickSort(arr,beg,p-1);
            quickSort(arr,p+1,end);
        }
    }
    public void sort(){
        quickSort(arr, 0, 9);
        out.println("Quick sort, Sorted Array is: "+Arrays.toString(arr));
    }
}

interface Playable{
    public void play();
}
class Football implements Playable{
    public void play(){
        out.println("Playing Football");
    }
}
class Volleyball implements Playable{
    public void play(){
        out.println("Playing Volleyball");
    }
}
class Basketball implements Playable{
    public void play(){
        out.println("Playing Basketball");
    }
}

interface Searchable{
    public void search(String key);
}
class Document implements Searchable{
    public void search(String s){
        String docs="This is a document.";
        if(docs.contains(s))
            out.println(s+" Founded in document");
        else
            out.println("Not found!");
    }
}
class WebPage implements Searchable{
    public void search(String s){
        String wp="This is a web page.";
        if(wp.contains(s))
            out.println(s+" Founded in WebPage");
        else
            out.println("Not found!");
    }
}

interface Encryptable{
    public void encrypt(String data);
    public void decrypt(String data);
}
class AES implements Encryptable{
    public void encrypt(String data){
        String temp="";
        for(int i=data.length()-1;i>=0;i--)
            temp+=data.charAt(i);
            out.println("AES Encrypted data is: " + temp);
    }
    public void decrypt(String data){
        String temp="";
        for(int i=data.length()-1;i>=0;i--)
            temp+=data.charAt(i);
            out.println("AES Decrypted data is: " + temp);
    }
}
class RSA implements Encryptable{
    public void encrypt(String data){
        out.println("RSA Encrypted data is: RSA-" + data + "-RSA");
    }
    public void decrypt(String data){
        if (data.startsWith("RSA-") && data.endsWith("-RSA")) 
            out.println(data.substring(4, data.length() - 4));
        else {
            System.out.println("Invalid RSA encrypted data format");
        }
    }
}


class Assignment4 {
    static void first(){
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();
        r.getArea();
        c.getArea();
        t.getArea();
    }
    static void second(){
        Dog d = new Dog();
        d.bark();
    }
    static void third(){
        Spacecraft s = new Spacecraft();
        Airplane a = new Airplane();
        Helicopter h = new Helicopter();
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
    static void fourth(){
        Bank b = new Bank();
        SavingsAccount s = new SavingsAccount();
        b.addAccount(s);
        CurrentAccount c = new CurrentAccount();
        b.addAccount(c);
        s.deposit(100);
        c.deposit(100);
        s.interest();
        c.interest();
        s.show_balance();
        c.show_balance();
    }
    static void fifth(){
        Rectangles r = new Rectangles();
        r.resizeHeight(5);
        r.resizeWidth(5);
    }
    static void sixth(){
        Circles c = new Circles();
        Rectangle_ r = new Rectangle_();
        Triangles t = new Triangles();
        c.draw();
        r.draw();
        t.draw();
    }
    static void seventh(){
        BubbleSort b = new BubbleSort();
        b.sort();
        SelectionSort s = new SelectionSort();
        s.sort(); 
    }
    static void eigth(){
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
    static void nineth(){
        Document d = new Document();
        WebPage w = new WebPage();
        d.search("document");
        w.search("web");
    }
    static void tenth(){
        AES a = new AES();
        RSA r = new RSA();
        a.encrypt("This is test String");
        a.decrypt("gnirtS tset si sihT");
        r.encrypt("This is test String");
        r.decrypt("RSA-This is test String-RSA");
    }
    static void eleventh(){
        QuickSort q = new QuickSort();
        MergeSort m = new MergeSort();
        q.sort();
        m.sort();
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
    }    
}