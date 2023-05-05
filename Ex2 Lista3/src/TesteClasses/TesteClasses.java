
package TesteClasses;


public class TesteClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setIdade(30);
        cliente.setSexo("Masculino");
        cliente.setValorDivida(5000.0);
        cliente.setAnoNascim(1990);
        System.out.println(cliente.toString());

        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setIdade(45);
        gerente.setSexo("Feminino");
        gerente.setMatricula("123456");
        gerente.setSalario(5000.0);
        gerente.setNomeGerencia("Vendas");
        System.out.println(gerente.toString());

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Pedro");
        vendedor.setIdade(25);
        vendedor.setSexo("Masculino");
        vendedor.setMatricula("789012");
        vendedor.setSalario(3000.0);
        vendedor.setValorVendas(10000.0);
        vendedor.setQntVendas(50);
        System.out.println(vendedor.toString());
    }
}