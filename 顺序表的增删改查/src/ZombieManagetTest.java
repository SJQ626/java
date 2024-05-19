public class ZombieManagetTest {
    public static void main(String[] args) {
        ZombieManager zm=new ZombieManager(5);
        Zombie z1=new Zombie("A001",1,10,10);
        Zombie z2=new Zombie("A002",2,20,20);
        Zombie z3=new Zombie("A003",3,30,30);
        Zombie z4=new Zombie("A004",4,40,40);
        Zombie z5=new Zombie("A005",5,50,50);
        Zombie z6=new Zombie("A006",6,60,60);
        Zombie z7=new Zombie("A007",7,70,70);
        zm.add(z1);
        zm.add(z2);
        zm.add(z3);
        zm.add(z4);
        zm.add(z5);
        zm.add(z6);
        zm.add(z7);
        zm.PrintAll();
        System.out.println("--------update--------");
        Zombie z21=new Zombie("A002",22,22,22);
        zm.update(z21);
        z2.print();
        System.out.println("---------delete---------");
        zm.delete("A003");
        zm.PrintAll();
        System.out.println("--------add------------");
        zm.add(z3);
        zm.PrintAll();
        System.out.println("--------find------------");
        System.out.println("id=A002的level:"+zm.FindById("A002").level);
    }
}
