public class Principal{

    public static void main(String[] args) {

        int[] numeros = new int[]{4,5,10,0};
        ordenacionBurbuja(numeros);

        for(int i = 0; i < numeros.length;i++){
            System.out.println(numeros[i]);
        }

    }

    public static void ordenacionBurbuja(int [] array){
        int i,j,aux;

        for(i=0; i < array.length-1; i++){
            for(j=0; j < (array.length-i)-1; j++){

                if(array[j+1] < array[j]){

                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }


}
