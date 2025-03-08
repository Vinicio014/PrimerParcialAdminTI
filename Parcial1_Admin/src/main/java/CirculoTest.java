import static org.junit.jupiter.api.Assertions.*; //Importa todos los métodos estáticos de la clase Assertions de JUnit 5.
import org.junit.jupiter.api.Test;//Importa la anotación @Test de JUnit. La anotación le dice a JUnit que el método es una prueba que debe ejecutarse.
/**
 *Description of connection
 * @author Alan Vinicio Lopez Jacinto <alopezj8@miumg.edu.gt>
 */
public class CirculoTest {
    @Test
    void testCalculateAreaPositive() {
        assertEquals(28.27, Circulo.calculateArea(3), 3.1416, "El área debe ser aproximadamente 28.27");/*
        esta linea permite evaluar el area de un circulo de radio 3, realizando la prueba unitaria a la clase circulo.
       */
        System.out.println("Prueba area pasó correctamente");//mensaje de aprobacion
    }

    @Test
    void testCalculateAreaNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Circulo.calculateArea(-5);//ejemplo de comparativa de que un radio negativo no se puede resolver.
        });
        assertEquals("El radio no puede ser negativo", exception.getMessage(), "Debe lanzar un error si el radio es negativo");
        System.out.println("Prueba radio negativo pasó correctamente");//mensaje de aprobacion
    }

}





