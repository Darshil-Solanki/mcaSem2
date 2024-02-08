import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
class SumOfArray{
    public static int sumOfNumbersInArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
class Assignment2{
    static void printUntilNumber(int a){
        for(int i=1;i<=a;i++)
            out.println(i);
    }
    static void printFromNumberToOne(int a){
        for(int i=a;i>0;i--)
            out.println(i);
    }
    static void divisibleByThreeInRange(int beg,int end){
        for(;beg<=end;beg++){
            if(beg%3==0)
                out.println(beg);
        }
    }
    static int greatest(int n1,int n2,int n3){
        return n1>n2? n1>n3?n1:n3 : n2>n3?n2:n3;
    }
    static void first(Scanner s){
        out.println("Enter number:");
        int a=s.nextInt();
        if(a>0)
            printUntilNumber(a);
        else
            out.println("Enter valid number");
    }
    static void second(Scanner s){
        out.println("Enter number:");
        int a=s.nextInt();
        if(a>0)
            printFromNumberToOne(a);
        else
            out.println("Enter valid number");
    }
    static void third(Scanner s){
        out.println("Enter beg:");
        int beg=s.nextInt();
        out.println("Enter end:");
        int end=s.nextInt();
        if(beg<=end)
            divisibleByThreeInRange(beg, end);
        else
            out.println("Enter valid range");
    }
    static void fourth(Scanner s){
        out.println("Enter num1:");
        int n1=s.nextInt();
        out.println("Enter num2:");
        int n2=s.nextInt();
        out.println("Enter num3:");
        int n3=s.nextInt();
        out.println("Greatest Number is:"+greatest(n1,n2,n3));
    }
    static void fifth(Scanner s){
        out.println("");
    }
    static void sixth(Scanner s){
        int arr[] = {1,2,8,3,4,5,9,6,0,7};
        out.println("Enter index:");
        int index=s.nextInt();
        try{
            if(index<0)
                out.println("Invalid Index!!");
            else
                out.println("item at index "+index+" is "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            out.println("Error:"+e.toString());
            out.println("Index does not exist");
        }
    }
    static void seventh(Scanner s){
        int arr[]={20,1,14,2,34,25,63,3,56};
        out.println("Sum of Array is:"+SumOfArray.sumOfNumbersInArray(arr));
    }
    static void eigth(Scanner s){
        out.println("Enter string:");
        String st=s.nextLine();
        if(st.equals("true"))
            out.println("You got it right!");
        else
            out.println("Try again!");
    }
    static void nineth(Scanner s){
        String user[]={"alex","emma"};
        String passwd[]={"sunshine","haskell"};
        out.println("Enter username:");
        String uname=s.nextLine();
        out.println("Enter password:");
        String upasswd=s.nextLine();
        int flag=1;
        for(int i=0;i<user.length;i++){
            if(user[i].equals(uname)){
                flag=0;
                if(passwd[i].equals(upasswd)){
                    out.println("Welcome");
                    break;
                }
                else
                    out.println("Wrong passwd");
            }
        }
        if(flag==1)
            out.println("User Not found!");
    }
    static void tenth(Scanner s){
        out.println("tenth");
        String st="";
        while(true){
            out.println("Enter string:");
            st=s.nextLine().trim();
            if (st.isEmpty())
                break;
            String Sarr[]=st.split(" ");
            for(int i=0;i<Sarr.length;i++){
                out.println(Sarr[i]);
            }
        }
    }
    static void eleventh(Scanner s){
        out.println("eleventh");
        String st="";
        while(true){
            out.println("Enter string:");
            st=s.nextLine().trim();
            String Sarr[]=st.split(" ");
            if (st.isEmpty())
                break;
            for(int i=0;i<Sarr.length;i++){
                if(Sarr[i].contains("av"))
                    out.println(Sarr[i]);
            }
        }
    }
    static void twelvth(Scanner s){
        out.println("twelvth");
        String st="";
        while(true){
            out.println("Enter string:");
            st=s.nextLine().trim();
            String Sarr[]=st.split(" ");
            if(st.isEmpty())
                break;
            out.println(Sarr[0]);
            out.println(Sarr[Sarr.length-1]);
        }
    }
    static void thirteen(Scanner s){
        out.println("thirteen");
        String st="";
        ArrayList<String> name= new ArrayList<>();
        ArrayList<Integer> age= new ArrayList<>();
        while(true){
            out.println("Enter string:");
            st=s.nextLine();
            if(st.isEmpty())
                break;
            String Sarr[]=st.split(",");
            name.add(Sarr[0]);
            age.add(Integer.parseInt(Sarr[1]));
        }
        int max_n=0;
        int max_i=-1;
        for(int i=0;i<age.size();i++){
            if(max_n < age.get(i)){
                max_n=age.get(i);
                max_i=i;
            }
        }
        out.println("Oldest Person is "+name.get(max_i)+" with age "+age.get(max_i));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        first(sc);
        second(sc);
        third(sc);
        fourth(sc);
        //fifth(sc);
        sixth(sc);
        seventh(sc);
        eigth(sc);
        nineth(sc);
        tenth(sc);
        eleventh(sc);
        twelvth(sc);
        thirteen(sc);
    }
}