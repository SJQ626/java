import java.sql.SQLOutput;

public class superman {
    String name;
    private String zxc;
    public void setZxc(String zxc){
        if(zxc=="斯特里姆光线"){
            this.zxc=zxc;
        }
        else {
            System.out.println("大招输入有误");
            this.zxc="放了一个屁~";
            return ;
        }
    }
    public String getZxc(){
        return zxc;
    }
}
