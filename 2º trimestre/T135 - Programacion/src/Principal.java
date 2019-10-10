public class Principal {

    public static void main(String[] args) {

        String clave = CifradoXOR.cifrar("hectol Saramambiche","pass");

        System.out.println(clave);

        String original = CifradoXOR.cifrar("ǟǒǔǃǘǛƗǤǖǅǖǚǖǚǕǞǔǟǒ", "pass");

        System.out.println(original);
    }
}
