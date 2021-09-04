import java.util.Scanner;

public class fbseries {
    public static void main(String[] args){
        System.out.println("ENTER THE LIMIT");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int i;
        int fab=0;
        int count=0;
        int next=0;
        for(i=0;i<=limit-2;i++){
           if(fab==0&&count==0){
               System.out.print("0,1,");
               fab=1;
           }else if(i<limit-2)
           {
               next=count+fab;
               System.out.print(next+",");
               count=fab;
               fab=next;
           }
           else{
               next=count+fab;
               System.out.print(next);
               count=fab;
               fab=next;
           }
        }
        }}