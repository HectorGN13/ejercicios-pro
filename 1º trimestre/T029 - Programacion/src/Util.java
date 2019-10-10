public final class Util {


    private Util() {
    }

    public static boolean pertenenciaCerrado(int a, int b, int elemento){
        return a<=elemento && elemento<=b;
    }

    public static boolean pertenenciaAbierto(int a, int b, int elemento){
        return a<elemento && elemento<b;
    }

    public static boolean pertenenciaAbiertoIncio(int a, int b, int elemento){
        return a<elemento && elemento<=b;
    }

    public static boolean pertenenciaAbiertoFin(int a, int b, int elemento){
        return a<=elemento && elemento<b;
    }

    // TODO: 22/10/2018
    public static boolean solapamiento(int primerIntervaloInicio, int primerIntervaloFin, int segundIntervaloInicio, int segundIntervaloFin){
        return primerIntervaloInicio <= segundIntervaloInicio || primerIntervaloFin <= segundIntervaloFin;
    }

    // TODO: 22/10/2018
    public static boolean inclusion(int primerIntervaloInicio, int primerIntervaloFin, int segundIntervaloInicio, int segundIntervaloFin){
      return primerIntervaloInicio <= segundIntervaloInicio && primerIntervaloFin >= segundIntervaloFin;
    }

}
