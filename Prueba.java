

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;
    private ClaseDam claseDam1;

    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        alumno1 = new Alumno("Javier Garcia", "4567", 21);
        alumno2 = new Alumno("Laura G�mez", "2238", 19);
        alumno3 = new Alumno("Estefan�a S�enz", "9987", 22);
        alumno4 = new Alumno("Rodrigo Cifuentes", "2290", 19);
        alumno5 = new Alumno("Mauro L�pez", "3387", 20);
        claseDam1 = new ClaseDam(7);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
