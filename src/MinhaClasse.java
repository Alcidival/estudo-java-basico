public class MinhaClasse {

    public static void main(String[] args) {
        //System.out.print("OLÁ MUNDO!");
        String primeiroNome = "Alcidival";
        String segundoNome  = "Júnior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
