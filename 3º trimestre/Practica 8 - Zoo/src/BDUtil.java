import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDUtil {
    private static Connection con = null;

    public static Connection conectar() {

        String usuario = "alicia";
        String clave = "Conejo$5";
        String BD = "zoo";
        String parametros = "?verifyServerCertificate=false&useSSL=true";
        String url = "jdbc:postgresql://192.168.105.46/"+BD+parametros;     // +"?useSSL=false" --> no aconsejado

        try {
            //Class.forName("org.postgresql.driver");
            con = DriverManager.getConnection(url,usuario,clave);
            if (con!=null)
                System.out.println("Conectado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
