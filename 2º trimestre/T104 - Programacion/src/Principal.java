public class Principal {


    public static void main(String[] args) {
        char[] array1 = {'H','C','O',' ','A','A','A','B','C','E'};
        char[] array2 = {'E','T','L','S','R','M','M','I','H'};

        for (char x:mezclarArrays(array1,array2)) {
            System.out.print(x);
        }


    }

    public static char[] mezclarArrays(char[] array1, char[] array2){
        assert array1 != null : "Error: el array1 no puede ser null";
        assert array2 != null : "Error: el array2 no puede ser null";


        char [] result = new char[array1.length + array2.length];

        for (int i = 0, j = 0; i < result.length ; i++) {
            if(i % 2 == 0){
                result[i] = array1[i-j];
                j++;
            } else {
                result[i] = array2[i-j];
            }
        }




      return result;
    }
}
