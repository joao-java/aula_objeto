
package aula_objeto;

public class Cachorro {
	//atributos 
	public String nome;
	public float peso;
	public String Nascimento;
	public String corPelos;
        public int idade;
        
        //metodo
        
        public void latido(){
            if(peso <= 15){
                System.out.println(nome +" - peso "+peso+" Wooof, Wooof");
            }else if (peso >= 16 && peso < 20){
                System.out.println(nome +" - Peso "+peso+" Ruuuff, ruuuf");
            }else{
                System.out.println(nome +" - "+peso+" dasldknak");
            }
            
        }
        
        public void idade(){
            int idadeSer = 7;
            System.out.println(nome+" tem "+(idade*idadeSer) +"anos de idade humana");
        };
}
