 class TesteDePalavra
{
    public static void main (String[] args)
    {
        // teste 1
        try
        {
            Palavra p1 = new Palavra (null);
            System.out.println ("Deu certo construir palavra null");

        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir palavra null");
        }
        // teste 2
        try
        {
            Palavra p2 = new Palavra ("");
            System.out.println ("Deu certo construir palavra \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir palavra \"\"");
        }
        // teste 3
        Palavra p3 = null;
        try
        {
            p3 = new Palavra ("PARALELEPIPEDO");
            System.out.println ("Deu certo construir palavra \"PARALELEPIPEDO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir palavra \"PARALELEPIPEDO\"");
        }
        // teste 4
        Palavra p4 = null;
        try
        {
            p4 = new Palavra ("PARALELEPIPEDO");
            System.out.println ("Deu certo construir palavra \"PARALELEPIPEDO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir palavra \"PARALELEPIPEDO\"");
        }
        // teste 5
        Palavra p5 = null;
        try
        {
            p5 = new Palavra ("LAPAROSCOPIA");
            System.out.println ("Deu certo construir palavra \"LAPAROSCOPIA\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir palavra \"LAPAROSCOPIA\"");
        }
        // teste 6
        System.out.println ("\"PARALELEPIPEDO\" tem "+
                            p3.getQuantidade('W') +
                            " letras iguais a 'W'");
        // teste 7
        System.out.println ("\"PARALELEPIPEDO\" tem "+
                            p3.getQuantidade('E') +
                            " letras iguais a 'E'");
        // teste 8
        try
        {
            System.out.println ("A 0a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
            p3.getPosicaoDaIezimaOcorrencia(-1,'E'));
            System.err.println ("Achamos a 0a aparicao da letra 'E' em \"PARALELEPIPEDO\" E NAO ERA PARA ACHARMOS");
        }
        catch (Exception erro)
        {
            System.out.println ("Deu erro ao achar a 0a aparicao da letra 'E' em \"PARALELEPIPEDO\" E ERA PARA DAR ERRO MESMO");
        }
        // teste 9
        try
        {
            System.out.println ("A 1a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
            p3.getPosicaoDaIezimaOcorrencia(-1,'E'));
            System.out.println ("Achamos a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro ao achar a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        // teste 10
        try
        {
            System.out.println ("A 1a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
            p3.getPosicaoDaIezimaOcorrencia(0,'E'));
            System.out.println ("Achamos a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro ao achar a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        // teste 11
        try
        {
            System.out.println ("A 2a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
            p3.getPosicaoDaIezimaOcorrencia(1,'E'));
            System.out.println ("Achamos a 2a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro ao achar a 2a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        // teste 12
        try
        {
            System.out.println ("A 3a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
            p3.getPosicaoDaIezimaOcorrencia(2,'E'));
            System.out.println ("Achamos a 3a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro ao achar a 3a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
        }
        // teste 13
        try
        {
            System.out.println ("A 4a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
            p3.getPosicaoDaIezimaOcorrencia(3,'E'));
            System.err.println ("Achamos a 4a aparicao da letra 'E' em \"PARALELEPIPEDO\" E NAO ERA PARA ACHARMOS");
        }
        catch (Exception erro)
        {
            System.out.println ("Deu erro ao achar a 4a aparicao da letra 'E' em \"PARALELEPIPEDO\" E ERA PARA DAR ERRO MESMO");
        }
        // teste 14
        System.out.println ("\"PARALELEPIPEDO\" tem "+p3.getTamanho()+" letras");
        // teste 15
        System.out.println (p3 + "eh a palavra que estamos testando");
        // teste 16
        System.out.println ("Eh "+p3.equals(null)+" que \"PARALELEPIPEDO\" eh igual (pelo equals) a null");
        // teste 17
        System.out.println ("Eh "+p3.equals(p3)+" que \"PARALELEPIPEDO\" eh igual (pelo equals) a si mesmo");
        // teste 18
        System.out.println ("Eh "+p3.equals("PARALELEPIPEDO")+" que \"PARALELEPIPEDO\" eh igual (pelo equals) ao String \"PARALELEPIPEDO\"");
        // teste 19
        System.out.println ("Eh "+p3.equals(p4)+" que \"PARALELEPIPEDO\" eh igual (pelo equals) a \"PARALELEPIPEDO\"");
        // teste 20
        System.out.println ("Eh "+p3.equals(p5)+" que \"PARALELEPIPEDO\" eh igual (pelo equals) a \"LAPAROSCOPIA\"");
        // teste 21
        System.out.println ("Eh "+(p3.hashCode()==p4.hashCode())+" que o hashCode de um \"PARALELEPIPEDO\" eh igual ao hashCode de outro \"PARALELEPIPEDO\"");
        // teste 22
        System.out.println ("Eh "+(p3.hashCode()==p5.hashCode())+" que o hashCode de \"PARALELEPIPEDO\" eh igual ao hashCode de \"LAPAROSCOPIA\"");
        // teste 23
        System.out.println ("Um \"PARALELEPIPEDO\" comparado (com compareTo) com outro \"PARALELEPIPEDO\" deu "+p3.compareTo(p4));
        // teste 24
        System.out.println ("\"PARALELEPIPEDO\" comparado (com compareTo) com \"LAPAROSCOPIA\" deu "+p3.compareTo(p5));
        // teste 25
        System.out.println ("\"LAPAROSCOPIA\" comparado (com compareTo) com \"PARALELEPIPEDO\" deu "+p5.compareTo(p3));
    }
}