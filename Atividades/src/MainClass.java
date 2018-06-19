//Herança 

interface pessoa {
    public String getNome();
    public void   setNome(String nome);
}
abstract class funcionario implements pessoa {
    public abstract int getMatricula();
    public abstract void setMatricula(int matricula);
}
class programador extends funcionario {
    private String nome;
    private int matricula;
    public programador() {};
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
  
}
class coordenador extends funcionario {
    private String nome;
    private int matricula;
    public coordenador(){};
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String mandar () {
        return "Mandando";
    }
}
public class MainClass {
    public static void main(String[] args) {
        coordenador coor = new coordenador();
        programador prog = new programador();
        funcionario fprg = new programador();
        funcionario fcrd = new coordenador();
        funcionario temp;
        prog.setMatricula(1);
        prog.setNome("Silvio");
        coor.setMatricula(2);
        coor.setNome("Tania");
        System.out.println(prog.getMatricula() + prog.getNome());
        System.out.println(coor.getMatricula() + coor.getNome());
        fprg.setMatricula(3);
        fprg.setNome("Sonia");
        fcrd.setMatricula(4);
        fcrd.setNome("Matheus");
        System.out.println(fprg.getMatricula() + fprg.getNome());
        System.out.println(fcrd.getMatricula() + fcrd.getNome());
        
    }
}