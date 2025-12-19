public class Kala {
    public String name;
    public int gheymat;
    public int mojodi;

    public Kala(String name, int gheymat, int mojodi){
        this.name = name;
        this.gheymat = gheymat;
        this.mojodi = mojodi;
    }
    public int arzesh(){
        return gheymat * mojodi;
    }
}
