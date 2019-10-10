public class Cifraca{
    int cifra;


    public Cifraca(int cifra) {
        setCifra(cifra);
    }

    private void setCifra(int cifra) {
        assert cifra >= 0 && cifra <= 9 : "Error la cifra solo puede tener un digito";
        this.cifra = cifra;
    }

    @Override
    public String toString() {
        String resultado = "";
        switch (cifra){
            case 0:
                resultado += "■■■■■\n"+
                             "■□□□■\n"+
                             "■□□□■\n"+
                             "■□□□■\n"+
                             "■■■■■\n";
                break;
            case 1:
                resultado += "■■■□□\n"+
                             "□□■□□\n"+
                             "□□■□□\n"+
                             "□□■□□\n"+
                             "■■■■■\n";
                break;
            case 2:
                resultado +=  "■■■■■\n"+
                              "□□□□■\n"+
                              "■■■■■\n"+
                              "■□□□□\n"+
                              "■■■■■\n";
                break;
            case 3:
                resultado +=  "■■■■■\n"+
                              "□□□□■\n"+
                              "■■■■■\n"+
                              "□□□□■\n"+
                              "■■■■■\n";
                break;
            case 4:
                resultado +=  "■□□□■\n"+
                              "■□□□■\n"+
                              "■■■■■\n"+
                              "□□□□■\n"+
                              "□□□□■\n";
                break;
            case 5:
                resultado +=  "■■■■■\n"+
                        "■□□□□\n"+
                        "■■■■■\n"+
                        "□□□□■\n"+
                        "■■■■■\n";
                break;
            case 6:
                resultado +=  "■■■■■\n"+
                        "■□□□□\n"+
                        "■■■■■\n"+
                        "■□□□■\n"+
                        "■■■■■\n";
                break;
            case 7:
                resultado += "■■■■■\n"+
                        "□□□■□\n"+
                        "□□■□□\n"+
                        "□■□□□\n"+
                        "■□□□□\n";
                break;
            case 8:
                resultado +=  "■■■■■\n"+
                        "■□□□■\n"+
                        "■■■■■\n"+
                        "■□□□■\n"+
                        "■■■■■\n";
                break;
            case 9:
                resultado +=  "■■■■■\n"+
                        "■□□□■\n"+
                        "■■■■■\n"+
                        "□□□□■\n"+
                        "■■■■■\n";
                break;

            default:
                resultado +=  "□□□□□\n"+
                        "□□□□□\n"+
                        "□□□□□\n"+
                        "□□□□□\n"+
                        "□□□□□\n";
                break;
        }
        return resultado;
    }
}
