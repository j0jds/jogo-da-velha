public class Campo {
    private char letra;

    /** Aqui está sendo declarada a variável privada LETRA do tipo CHAR para representar a 
    letra que será colocada em cada matriz, que no caso pode ser: NADA, X ou O. **/

    //Método construtor da classe Campo.
    public Campo() {
    
        this.letra = ' ';

    }

    public char getLetra() {

        return this.letra;

    }

    public void setLetra(char letra) {

        if (this.letra == ' ') {

            this.letra = letra;

        } else {

            System.out.println("Campo Ocupado");

        }

    }
}
