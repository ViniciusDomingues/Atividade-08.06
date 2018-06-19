//interface e polimorfismo


interface Menu {
    public void paint();
}
 
class WinMenu implements Menu {
    public void paint() {
        System.out.println("Eu sou um WinMenu");
    }
}
 
class LinuxMenu implements Menu {
    public void paint() {
        System.out.println("Eu sou um LinuxMenu");
    }
}