package co.edu.cue.algortimosModuloSubasta;

public class Singleton <T> {

    public static T getInstance() {
        if (instance == null)
            instance = new Singleton<T>(); // No compila ya que no se puede crear un campo estatico de el parametro tipo T.

        return instance;
    }

    private static T instance = null;

}
