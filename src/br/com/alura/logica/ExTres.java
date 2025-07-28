package br.com.alura.logica;

public class ExTres {
    public static void main(String[] args) {
        double originalPrice = 98.59;
        double percentualDiscount = 22;
        double newPrice = originalPrice - (originalPrice * (percentualDiscount / 100));

        System.out.printf("O produto custa R$%.2f, mas com o desconto de %s%%, o valor fica por R$%.2f.", originalPrice, percentualDiscount, newPrice);
    }
}
