public class TesteDeControladorDeErros {
    public static void main (String[] args)
    {
        // teste 1
        ControladorDeErros c1 = null;
        try
        {
            c1 = new ControladorDeErros (-1);
            System.out.println ("Deu certo construir ControladorDeErros com parametro negativo");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros parametro negativo");
        }
        // teste 2
        try
        {
            c1 = new ControladorDeErros (4);
            System.out.println ("Deu certo construir ControladorDeErros com parametro negativo");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros parametro negativo");
        }
        // teste 3
        ControladorDeErros c2 = null;
        try
        {
            c2 = new ControladorDeErros (3);
            System.out.println ("Deu certo construir ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros");
        }
        // teste 4
        try{
            c2.registreUmErro();
            System.out.println("Erro registrado");
        }
        catch (Exception erro){
            System.out.println("Máximo de erros atingido");
        }
        // teste 5 - teste de registreUmErro e isAtingidoMaximoDeErros
        try{
            c2.registreUmErro();
            c2.registreUmErro();
            c2.registreUmErro();
            System.out.println("Erro registrado");
        }
        catch (Exception erro){
            System.out.println("Máximo de erros atingido");
        }
        // teste 6
        ControladorDeErros c3 = null;
        try
        {
            c3 = new ControladorDeErros (3);
            System.out.println ("Deu certo construir ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros");
        }
        // teste 7
        try{
            c3.registreUmErro();
            c3.registreUmErro();
            c3.registreUmErro();
            System.out.println("Erro registrado");
        }
        catch (Exception erro){
            System.out.println("Máximo de erros atingido");
        }
        // teste 8
        System.out.println("Eh "+c2.equals(null)+" que c2 eh igual (pelo equals) a null");
        // teste 9
        System.out.println("Eh "+c2.equals(c2)+" que c2 eh igual (pelo equals) a si mesmo");
        // teste 10
        System.out.println("Eh "+c2.equals("3/3")+" que c2 eh igual (pelo equals) a String \"3/3\"");
        // teste 11
        System.out.println("Eh "+c2.equals(3)+" que c2 eh igual (pelo equals) a Integer 3");
        // teste 12
        System.out.println("Eh "+c2.equals(c3)+" que c2 eh igual (pelo equals) a c3");
        // teste 13
        System.out.println("Eh "+c2.equals(c1)+" que c2 eh igual (pelo equals) a c1");
        // teste 14
        System.out.println ("Eh "+(c2.hashCode()==c3.hashCode())+" que o hashCode de c2 eh igual ao hashCode de c3");
        // teste 15
        System.out.println ("Eh "+(c2.hashCode()==c1.hashCode())+" que o hashCode de c2 eh igual ao hashCode de c1");
        // teste 16
        try{
            ControladorDeErros referencia = new ControladorDeErros (null);
            System.out.println ("Deu certo a construção de cópia de null");
        }
        catch (Exception erro){
            System.out.println ("Deu errado a construção de cópia de null");
        }
        // teste 17
        try{
            ControladorDeErros referencia = new ControladorDeErros (c2);
            System.out.println ("Deu certo a construção de cópia de c2");
        }
        catch (Exception erro){
            System.out.println ("Deu errado a construção de cópia de c2");
        }
        // teste 18
        ControladorDeErros clone = (ControladorDeErros)c2.clone();
        System.out.println("Eh "+clone.equals(c2)+" que c2 eh igual (pelo equals) a clone");
    }
}
