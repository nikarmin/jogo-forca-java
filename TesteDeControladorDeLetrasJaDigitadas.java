public class TesteDeControladorDeLetrasJaDigitadas {
    public static void main (String[] args)
    {
        ControladorDeLetrasJaDigitadas c1 = new ControladorDeLetrasJaDigitadas();
        ControladorDeLetrasJaDigitadas c2 = new ControladorDeLetrasJaDigitadas();
        ControladorDeLetrasJaDigitadas c3 = new ControladorDeLetrasJaDigitadas();

        // teste 1 - teste do registre e do isJaDigitada
        try{
            c1.registre('a');
            System.out.println("Letra registrada");
        }
        catch (Exception erro){
            System.out.println("Letra já foi digitada");
        }
        try{
            c2.registre('a');
            System.out.println("Letra registrada");
        }
        catch (Exception erro){
            System.out.println("Letra já foi digitada");
        }
        // teste 2 - teste do registre e do isJaDigitada
        try{
            c1.registre('a');
            System.out.println("Letra registrada");
        }
        catch (Exception erro){
            System.out.println("Letra já foi digitada");
        }
        // teste 3
        System.out.println("Letras digitadas: "+c1);
        // teste 4
        System.out.println("Eh "+c1.equals(null)+" que c1 eh igual (pelo equals) a null");
        // teste 5
        System.out.println("Eh "+c1.equals(c1)+" que c1 eh igual (pelo equals) a si mesmo");
        // teste 6
        System.out.println("Eh "+c1.equals("a,")+" que c1 eh igual (pelo equals) a String \"a,\"");
        // teste 7
        System.out.println("Eh "+c2.equals(c3)+" que c2 eh igual (pelo equals) a c3");
        // teste 8
        System.out.println("Eh "+c1.equals(c2)+" que c1 eh igual (pelo equals) a c2");
        // teste 9
        System.out.println ("Eh "+(c1.hashCode()==c2.hashCode())+" que o hashCode de um c1 eh igual ao hashCode de c2");
        // teste 10
        System.out.println ("Eh "+(c1.hashCode()==c3.hashCode())+" que o hashCode de um c1 eh igual ao hashCode de c3");
        // teste 11
        try{
            ControladorDeLetrasJaDigitadas referencia = new ControladorDeLetrasJaDigitadas (null);
            System.out.println ("Deu certo a construção de cópia de null");
        }
        catch (Exception erro){
            System.out.println ("Deu errado a construção de cópia de null");
        }
        // teste 12
        try{
            ControladorDeLetrasJaDigitadas referencia = new ControladorDeLetrasJaDigitadas (c1);
            System.out.println ("Deu certo a construção de cópia de c1");
        }
        catch (Exception erro){
            System.out.println ("Deu errado a construção de cópia de c1");
        }
        // teste 13
        ControladorDeLetrasJaDigitadas clone = (ControladorDeLetrasJaDigitadas)c1.clone();
        System.out.println("Eh "+clone.equals(c1)+" que c1 eh igual (pelo equals) a ret");
    }
}
