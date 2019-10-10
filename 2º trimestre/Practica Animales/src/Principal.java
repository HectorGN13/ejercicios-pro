import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Ornitorrinco toby = new Ornitorrinco();
		System.out.println("esta " + toby.morder());
		System.out.println("esta "  + toby.brillar());

		List<Oviparo> animalesOviparos = new ArrayList<>();

		animalesOviparos.add(new Ornitorrinco());
		animalesOviparos.add(new Ornitorrinco());
		animalesOviparos.add(new Ornitorrinco());
		animalesOviparos.add(new Ornitorrinco());

		System.out.println(mostrarAnimales(animalesOviparos));

	}

	public static String mostrarAnimales(List<Oviparo> listaAnimales){
		String datos = "";
		for (Oviparo x:listaAnimales) {
			datos += x.muestrate() + "\n";
		}
	return datos;
	}
}
