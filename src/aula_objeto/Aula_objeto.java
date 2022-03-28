
package aula_objeto;


public class Aula_objeto {

    public static void main(String[] args) {

        //instanciando um objeto
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Penelopi";
        cachorro.Nascimento = "04/05/2008";
        cachorro.peso = (float) 15.00;
        cachorro.corPelos = "Marro";
        cachorro.idade = 12;
        cachorro.idade();
        
        Cachorro cachorro1 = new Cachorro();
        cachorro.nome = "Dara";
        cachorro.Nascimento = "06/08/2009";
        cachorro.peso = (float) 26.00;
        cachorro.corPelos = "Preta";
        cachorro.idade = 11;
        cachorro.idade();

        
        Cachorro cachorro2 = new Cachorro();
        cachorro.nome = "Barros";
        cachorro.Nascimento = "10/02/2014";
        cachorro.peso = (float) 32.00;
        cachorro.corPelos = "Preto";
        cachorro.idade = 19;
        cachorro.idade();

    }
    
}
