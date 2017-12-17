import java.util.Random;

public class Massiv {
    public static void main(String[] args) {


        int[] Massiv = new int[20];
        Random rand = new Random();
        for (int i = 0; i < Massiv.length; i++) {
            Massiv[i] = rand.nextInt(21) - 10;

            System.out.println("Massiv[" + i + "]=" + Massiv[i]);
        }

        System.out.println("Числа в массиве сгенерированы.");
        int maxNegativ = 11;
        int minPozitiv =11 ;
        int NumberMax=0;
        int NumberMin= 0;
        for (int i = 0; i < Massiv.length; i++) {
            if ((Massiv[i] < maxNegativ)&&(Massiv[i]<0)) {
                maxNegativ = Massiv[i];
                NumberMax = i;

            }if ((Massiv[i] < minPozitiv)&&(Massiv[i]>0)){
                    minPozitiv = Massiv[i];
                    NumberMin=i;

            }
        }System.out.println("Максимально негативное число в массиве" + maxNegativ +"\nИндекс"+NumberMax);
        System.out.println("Минимально положительное число в массиве" + minPozitiv+"\nИндекс"+NumberMin);


        int Zamena1= Massiv[NumberMin];
        int Zamena2 =Massiv[NumberMax];
        Massiv[NumberMax]=Zamena1;
        Massiv[NumberMin]=Zamena2;
        System.out.println(Massiv[NumberMax]);
        System.out.println(Massiv[NumberMin]);
    }
}