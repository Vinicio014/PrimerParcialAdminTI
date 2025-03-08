/**
 *Description of connection
 * @author Alan Vinicio Lopez Jacinto <alopezj8@miumg.edu.gt>
 */
public class Circulo {
        public static double calculateArea(double radius) {
            if (radius < 0) throw new IllegalArgumentException("El radio no puede ser negativo");
            return Math.PI * Math.pow(radius, 2);
        }
}
