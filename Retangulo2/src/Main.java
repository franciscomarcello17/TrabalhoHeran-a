import java.awt.*;
import javax.swing.*;

interface Retangulo {
    void desenhar();
}

class RetanguloSimples implements Retangulo {
    private String texto;
    private int largura;
    private int altura;

    public RetanguloSimples(String texto, int largura, int altura) {
        this.texto = texto;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Retângulo Simples:");
        System.out.println("+" + "-".repeat(largura) + "+");
        for (int i = 0; i < altura; i++) {
            System.out.println("|" + " ".repeat(largura) + "|");
        }
        System.out.println("+" + "-".repeat(largura) + "+");
        System.out.println(texto);
    }
}

class RetanguloComBordaArredondada implements Retangulo {
    private String texto;
    private int largura;
    private int altura;

    public RetanguloComBordaArredondada(String texto, int largura, int altura) {
        this.texto = texto;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Retângulo com Borda Arredondada:");
        System.out.println("╭" + "─".repeat(largura) + "╮");
        for (int i = 0; i < altura; i++) {
            System.out.println("│" + " ".repeat(largura) + "│");
        }
        System.out.println("╰" + "─".repeat(largura) + "╯");
        System.out.println(texto);
    }
}

class RetanguloComBordaDupla implements Retangulo {
    private String texto;
    private int largura;
    private int altura;

    public RetanguloComBordaDupla(String texto, int largura, int altura) {
        this.texto = texto;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Retângulo com Borda Dupla:");
        System.out.println("╔" + "═".repeat(largura) + "╗");
        for (int i = 0; i < altura; i++) {
            System.out.println("║" + " ".repeat(largura) + "║");
        }
        System.out.println("╚" + "═".repeat(largura) + "╝");
        System.out.println(texto);
    }
}

class RetanguloComAsciiArt implements Retangulo {
    private String texto;
    private int largura;
    private int altura;

    public RetanguloComAsciiArt(String texto, int largura, int altura) {
        this.texto = texto;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Retângulo com ASCII Art:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(texto);
    }

}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new RetanguloSimples(" ", 15, 5);
        retangulo1.desenhar();

        System.out.println();

        Retangulo retangulo2 = new RetanguloComBordaArredondada(" ", 20, 8);
        retangulo2.desenhar();

        System.out.println();

        Retangulo retangulo3 = new RetanguloComBordaDupla(" ", 10, 6);
        retangulo3.desenhar();

        System.out.println();

        Retangulo retangulo4 = new RetanguloComAsciiArt(" ", 12, 4);
        retangulo4.desenhar();
    }
}
