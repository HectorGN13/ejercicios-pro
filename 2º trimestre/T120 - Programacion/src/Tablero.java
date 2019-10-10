public class Tablero {

    private Robot[] robots;

    public Tablero(int aforo) {
        robots = new Robot[aforo];
    }

    public boolean colocar(Robot robot){
        assert robot != null : "Error: el robot pasado por parametro no puede ser null";
        boolean result = false;
        for (int i = 0; i < robots.length && !result; i++) {
            if(robots[i] == null){
                robots[i] = robot;
                result = true;
            }
        }
        return result;
    }
}
