package typeconversion;

public class TypeConversionMain {
    public static void main(String[] args) {
        int i = 5;
        long l = 500;
        float f = 1;
        double d = 10.1;

        //l = i; //itt automatikaus a konverzio, mert az int 32 bites, a long pedig 64 bites
        //i = l; //ezt pedig nem engedi, mert a 64-eset nem tudom belerakni a 32-esbe

        //f = l; //itt adatvesztéssel járhat, mégis engedi
        //d = l; //ugyanez

        byte b = 12; //ez befér a byteba, pl 300 érték már hiba

        i = (int) l; //kerek zárójelek között célértéket adunk neki
        i = (int) d; //kerekítés fog történni egészre konvertáláskor, de lehet ilyet is.



    }
}
