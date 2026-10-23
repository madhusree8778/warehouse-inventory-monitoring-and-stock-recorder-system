import java.util.*;
publicclassWarehouseSystem{
SOURCECODE
staticScanner sc= newScanner(System.in);
staticList<int[]>inv = new ArrayList<>(); // {id, qty, reorder}, namein separatelist
staticList<String>names= new ArrayList<>();
publicstaticvoid main(String[] args) {
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
staticvoid add(){
System.out.print("ID:"); int id=sc.nextInt(); sc.nextLine();
System.out.print("Name:"); String n=sc.nextLine();
System.out.print("Qty:"); int q=sc.nextInt();
System.out.print("Reorder:"); int r=sc.nextInt();
inv.add(new int[]{id,q,r}); names.add(n);
}
staticvoid view(){
for(int i=0;i<inv.size();i++)
System.out.println(inv.get(i)[0]+""+names.get(i)+"Qty:"+inv.get(i)[1]+"Reorder:"+inv.get(i)
[2]);
}
staticvoid update(){
System.out.print("ID:"); int id=sc.nextInt();
for(int[] p:inv) if(p[0]==id){ System.out.print("New Qty:"); p[1]=sc.nextInt(); return; }
System.out.println("Not found");
}
staticvoid low(){
for(int i=0;i<inv.size();i++) if(inv.get(i)[1]<=inv.get(i)[2])
System.out.println(names.get(i)+"low! Qty:"+inv.get(i)[1]);
}
}
6.
INPUTANDOUTPUTSCREEN