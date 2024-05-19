import java.util.Arrays;

public class ZombieManager {

    private int count=0;
    private Zombie[] zs;
    public ZombieManager(int size){
        if(size<0){
            size=5;
        }
        zs=new Zombie[size];
    }
    public void add(Zombie z){
        if(count>=zs.length){
            int len=zs.length*2;
            zs=Arrays.copyOf(zs, len);
        }
        zs[count]=z;
        count++;
    }

    public void update(Zombie z){
        Zombie temp = FindById(z.getId());
        if(temp!=null){
            temp.setLevel(z.getLevel());
            temp.setAtc(z.getAtc());
            temp.setDef(z.getDef());
        }
    }

    public Zombie FindById(String id){
        for(int i=0;i<count;i++) {
            if(zs[i].getId().equals(id)){
                return zs[i];
            }
        }
        return null;
    }

    public void PrintAll(){
        for(int i=0;i<count;i++){
            zs[i].print();
        }
    }

    public void delete(String id){
        for(int i=0;i<count;i++){
            if(zs[i].getId().equals(id)){
                for(int j=i+1;j<count;j++){
                    zs[j-1]=zs[j];
                }
                break;
            }
        }
        zs[count-1]=null;
        count--;
    }

}
