package mx.unam.fi.poo.g1.p56.p33;

import java.util.HashMap;
/**
 * Clase que contiene un semestre de Ingenieria en Computacion
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class SemestreCompu {
    private HashMap<String, Integer> SemCompu = new HashMap<>();
    /**
     * Constructor de la clase
     * @param semCompu HashMap con las materias del semestre de Ingenieria en Computacion
     */
    public SemestreCompu(HashMap<String, Integer> semCompu) {
        setSemCompu(semCompu);
    }
    /**
     * Metodo set
     * @param semCompu HashMap con las materias del semestre de Ingenieria en Computacion
     */
    public void setSemCompu(HashMap<String, Integer> semCompu) {
        this.SemCompu = semCompu;
    }
    /**
     * Metodo get
     * @return SemCompu: HashMap con las materias del semestre de Ingenieria en Computacion
     */
    public HashMap<String, Integer> getSemCompu() {
        return SemCompu;
    }
    /**
     * Metodo que verifica si una materia se encuentra en el semestre de Ingenieria en Computacion
     * @param materia Materia a buscar
     * @return true si la materia se encuentra en el semestre, false en caso contrario
     */
    public boolean cointieneMateria(String materia) {
        return SemCompu.containsKey(materia.toUpperCase());
    }
    /**
     * Metodo que busca la clave de una materia
     * @param materia Materia a buscar
     * @return true si la materia se encuentra en el semestre, false en caso contrario
     */
    public boolean buscarClave(String materia) {
        boolean continuar = false;
        if(cointieneMateria(materia)) {
            System.out.println("La clave de la asignatura " + materia + " es: " + getSemCompu().get(materia.toUpperCase()));
            continuar = true;
        } else {
            System.out.println("La asignatura " + materia + " no se encuentra en el tercer semestre de Ingenieria en Computacion");
        }
        return continuar;
    }
    

}
