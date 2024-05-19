public class Zombie {
    String id;
    int level;
    int atc;
    int def;

    public Zombie(String id, int level, int atc, int def) {
        this.id = id;
        this.level = level;
        this.atc = atc;
        this.def = def;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtc() {
        return atc;
    }

    public void setAtc(int atc) {
        this.atc = atc;
    }
    public void print(){
        System.out.println("id:"+id+",level:"+level+",atc:"+atc+",def:"+def);
    }
}
