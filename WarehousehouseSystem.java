import java.util.*;
public class WarehouseSystem{
static Scanner sc= newScanner(System.in);
static List<int[]>inv = new ArrayList<>(); 
static List<String>names= new ArrayList<>();
    public static void main(String[] args) {
        while(true){
            System.out.println("\n1.Add 2.View 3.Update4.Low 5.Exit");
            switch(sc.nextInt()){
            case1:add(); break;
            case2:view(); break;
            case3:update(); break;
            case4:low(); break;
            case5:System.exit(0);
        }
    }
}
static void add(){
    System.out.print("ID:");
    int id=sc.nextInt(); 
    sc.nextLine();
    System.out.print("Name:");
 String n=sc.nextLine();
    System.out.print("Qty:");
    int q=sc.nextInt();
    System.out.print("Reorder:");
    int r=sc.nextInt();
    inv.add(new int[]{id,q,r}); 
    names.add(n);
}
static void view(){
    for(int i=0;i<inv.size();i++)
    System.out.println(inv.get(i)[0]+""+names.get(i)+"Qty:"+inv.get(i)[1]+"Reorder:"+inv.get(i)
    [2]);
}
static void update(){
    System.out.print("ID:"); int id=sc.nextInt();
    for(int[] p:inv) if(p[0]==id){
        System.out.print("New Qty:");  
        p[1]=sc.nextInt(); 
        return;
     }
    System.out.println("Not found");
}
static void low(){
    for(int i=0;i<inv.size();i++) 
        if(inv.get(i)[1]<=inv.get(i)[2])
        System.out.println(names.get(i)+"low! Qty:"+inv.get(i)[1]);
    }
}
