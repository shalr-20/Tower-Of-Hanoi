import java.util.*;
public class TowerOfHanoi{
    public static void TOH(int n, String src, String helper, String dest){
        
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        
        TOH(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        TOH(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks:");
        int n = sc.nextInt();
        System.out.print("Enter Source string:");
        String src = sc.next();
        System.out.print("Enter Helper string:");
        String helper = sc.next();
        System.out.print("Enter Destination string:");
        String dest = sc.next();
        TOH(n, src, helper, dest);
    }
}