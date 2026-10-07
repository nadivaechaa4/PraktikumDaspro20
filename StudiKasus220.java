import java.util.Scanner;
public class StudiKasus220 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan, kurang;

        System.out.print("Nama Mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya : ");
        jenisKegiatan = sc.nextLine();
        
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase ("Mandiri")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            } else {
                kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

 