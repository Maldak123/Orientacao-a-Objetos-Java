package br.com.alura.logica;

public class ExUm {
    public static void main(String[] args) {
        double mediaUm = 9.75;
        double mediaDois = 7.98;
        int mediaInteira = (int) (mediaUm + mediaDois) / 2;

        System.out.println((mediaUm + mediaDois) / 2);
        System.out.printf("Média inteira: %s", mediaInteira);
    }
}
