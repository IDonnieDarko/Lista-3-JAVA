
package teste;


public class Teste {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Peixe espada", 2.5, "Agua salgada");
        System.out.println(peixe.toString());
        
        Cachorro cachorro = new Cachorro("Labrador", 20, "Golden Retriever");
        System.out.println(cachorro.toString());
    }
}
