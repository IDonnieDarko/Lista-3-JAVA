
package Biblioteca;


public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 1954, 1178);
        DVD dvd = new DVD("Matrix", "Lana Wachowski, Lilly Wachowski", 1999, "Regiao 1", 136);

        System.out.println("Livro:");
        System.out.println("Titulo: " + livro.getTitle());
        System.out.println("Autor: " + livro.getAuthor());
        System.out.println("Ano: " + livro.getYear());
        System.out.println("Paginas: " + livro.getPages());

        System.out.println("DVD:");
        System.out.println("Titulo: " + dvd.getTitle());
        System.out.println("Autor: " + dvd.getAuthor());
        System.out.println("Ano: " + dvd.getYear());
        System.out.println("Regiao: " + dvd.getRegion());
        System.out.println("Duracao: " + dvd.getLength() + " minutos");
    }
}
