
package Biblioteca;

public class DVD extends Item {
    private String region;
    private int length;

    public DVD(String title, String author, int year, String region, int length) {
        super(title, author, year);
        this.region = region;
        this.length = length;
    }

    public String getRegion() {
        return region;
    }

    public int getLength() {
        return length;
    }
}