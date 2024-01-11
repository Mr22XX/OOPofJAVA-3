class Mahasiswa{
    String nama;
    String NPM;

    Mahasiswa(String nama, String NPM){
        this.nama = nama;
        this.NPM = NPM;
    }

    // Method  tanpa param dan return
    void show(){
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + NPM);
    }

    // Method dengan param
    void setNama(String nama){
        this.nama = nama;
    }

    // Method dengan return
    String getNama(){
        return this.nama;
    }

    // Method dengan param dan return
    String sayHi(String message){
        return message + " Welcome to my program , " + this.nama;
    }
}

public class oop {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Rayhan Muhammad Adha", "8323323");
        mahasiswa.show();
        mahasiswa.setNama("Ucup (is a new student)");
        mahasiswa.show();
        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.sayHi("Hi"));
    }
}