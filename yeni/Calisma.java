package yeni;

public class Calisma {
    public static void main(String[] args) {

        String str="1-48 of 104 results for \"nutella\"";

        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSayisi=str.substring(ikinciSpace+1,ucuncuSpace);

        System.out.println(aramaSonucSayisi);


        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisi);




    }
}
