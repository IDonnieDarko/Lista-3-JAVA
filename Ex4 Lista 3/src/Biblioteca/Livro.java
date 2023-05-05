
package Biblioteca;

public class Livro extends Item {
    private int pages;

    public Livro(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}
