package convertvocal2angka;
import java.util.Scanner;
public class ConvertVocal2Angka {
    public static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
        
    }
    public static void main(String[] args){
        String identitas = "Syerli Trinadya / XRPL2 /33";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
    }
    private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli: "+ kalimat);
        
        return kalimat;

    
}
