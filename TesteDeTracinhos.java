class TesteDeTracinhos
{
    public static void main (String[] args)
    {
        // teste 1
        Tracinhos t1 = null;
        try
        {
            t1 = new Tracinhos (null);
            System.out.println ("Deu certo construir tracinhos null");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos null");
        }
        // teste 2
        Tracinhos t2 = null;
        try
        {
            t2 = new Tracinhos (-1);
            System.out.println ("Deu certo construir tracinhos com parametro negativo");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos parametro negativo");
        }
        // teste 3
        Tracinhos t3 = null;
        try
        {
            t3 = new Tracinhos (6);
            System.out.println ("Deu certo construir tracinhos");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos");
        }
        // teste 4
        Tracinhos t4 = null;
        try
        {
            t4 = new Tracinhos (6);
            System.out.println ("Deu certo construir tracinhos");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos");
        }
        // teste 5
        Tracinhos t5 = null;
        try
        {
            t5 = new Tracinhos (8);
            t5.revele(2, 'm');
            System.out.println ("A posição passada é válida e a palavra é "+t5);
        }
        catch (Exception erro)
        {
            System.out.println ("A posição passada é inválida");
        }
        // teste 6
        Tracinhos t6 = null;
        try
        {
            t6 = new Tracinhos (3);
            t6.revele(-1, 'o');
            System.out.println ("A posição passada é válida e a palavra é "+t6);
        }
        catch (Exception erro)
        {
            System.out.println ("A posição passada é inválida");
        }
        // teste 6
        if(t6.isAindaComTracinhos())
            System.out.println("A palavra ainda contem tracinhos: "+t6);
        else
            System.out.println("A palavra não contem mais tracinhos: "+t6);
        // teste 7
        try{
            t6.revele(0, 'o');
            t6.revele(1, 'v');
            t6.revele(2, 'o');
        }
        catch (Exception erro){}

        if(t5.isAindaComTracinhos())
            System.out.println("A palavra ainda contem tracinhos: "+t6);
        else
            System.out.println("A palavra não contem mais tracinhos: "+t6);
        // teste 8
        System.out.println("Eh "+t3.equals(null)+" que t3 eh igual (pelo equals) a null");
        // teste 9
        System.out.println("Eh "+t3.equals(t3)+" que t3 eh igual (pelo equals) a si mesmo");
        // teste 10
        System.out.println("Eh "+t3.equals("_ _ _ _ _ _ ")+" que t3 eh igual (pelo equals) a String \"_ _ _ _ _ _ \"");
        // teste 11
        System.out.println("Eh "+t3.equals(t4)+" que t3 eh igual (pelo equals) a t4");
        // teste 12
        System.out.println("Eh "+t3.equals(t5)+" que t3 eh igual (pelo equals) a t5");
        // teste 13
        System.out.println ("Eh "+(t3.hashCode()==t4.hashCode())+" que o hashCode de t3 eh igual ao hashCode de t4");
        // teste 14
        System.out.println ("Eh "+(t3.hashCode()==t5.hashCode())+" que o hashCode de t3 eh igual ao hashCode de t5");
        // teste 15
        try{
            Tracinhos referencia = new Tracinhos (null);
            System.out.println ("Deu certo a construção de cópia de null");
        }
        catch (Exception erro){
            System.out.println ("Deu errado a construção de cópia de null");
        }
        // teste 16
        try{
            Tracinhos referencia = new Tracinhos (t3);
            System.out.println ("Deu certo a construção de cópia de t3");
        }
        catch (Exception erro){
            System.out.println ("Deu errado a construção de cópia de t3");
        }
        // teste 16
        Tracinhos clone = (Tracinhos)t3.clone();
        System.out.println("Eh "+clone.equals(t3)+" que t3 eh igual (pelo equals) a clone");
    }
}