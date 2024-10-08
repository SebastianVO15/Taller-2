package uniandes.dpoo.estructuras.logica;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    
    int longitud=arregloEnteros.length;
    int[] copiaArregloEnteros= Arrays.copyOf(arregloEnteros, longitud);
    			
        return copiaArregloEnteros ;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	
    int longitud=arregloCadenas.length;
    String[] copiaArregloCadenas= Arrays.copyOf(arregloCadenas, longitud);
    	    			
    	 return copiaArregloCadenas ;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    int CantidadEnteros= arregloEnteros.length; 
        return CantidadEnteros;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    int CantidadCadenas= arregloCadenas.length; 
        return CantidadCadenas;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    int longitud= arregloEnteros.length;
    int[] NuevoArregloEnteros= Arrays.copyOf(arregloEnteros, longitud+1);
    NuevoArregloEnteros [longitud]=entero;
    arregloEnteros=NuevoArregloEnteros;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    int longitud= arregloCadenas.length;
    String[] NuevoArregloCadenas= Arrays.copyOf(arregloCadenas, longitud+1);
    NuevoArregloCadenas[longitud]=cadena;
    arregloCadenas=NuevoArregloCadenas;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
	    public void eliminarEntero( int valor )
	    {
	    int longitud= arregloEnteros.length;
	    int vecesElemento=0;
	    for (int i =0 ;i< longitud;i++) {
	    	if (arregloEnteros[i]== valor) {
	    		vecesElemento +=1;
	    	}
	    }
	    int[] NuevoArregloEnteros = new int[longitud-vecesElemento];
	    int h=0;
	    for(int j=0;j<longitud;j++) {
	    	if(arregloEnteros[j]!= valor) {
	    		NuevoArregloEnteros[h]=arregloEnteros[j];
	    		h +=1;
	    	}
	    }
	    arregloEnteros=NuevoArregloEnteros;
	    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int longitud= arregloCadenas.length;
	    int vecesElemento=0;
	    for (int i =0 ;i< longitud;i++) {
	    	if (arregloCadenas[i]== cadena) {
	    		vecesElemento +=1;
	    	}
	    }
	    String[] NuevoArregloCadenas = new String[longitud-vecesElemento];
	    int h=0;
	    for(int j=0;j<longitud;j++) {
	    	if(arregloCadenas[j]!= cadena) {
	    		NuevoArregloCadenas[h]=arregloCadenas[j];
	    		h +=1;
	    	}
	    }
	    arregloCadenas=NuevoArregloCadenas;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    int longitud= arregloEnteros.length;
    int[] NuevoArregloEnteros = new int[longitud+1];
    if (posicion < 0) {
        posicion = 0;
    } else if (posicion > longitud) {
        posicion = longitud;
    }
    
    for (int i = 0; i < longitud + 1; i++) {
        if (i < posicion) {
            NuevoArregloEnteros[i] = arregloEnteros[i];
        } else if (i == posicion) {
            NuevoArregloEnteros[i] = entero;
        } else {
            NuevoArregloEnteros[i] = arregloEnteros[i - 1];
        }
    }
    
    arregloEnteros = NuevoArregloEnteros;
    
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    int longitud= arregloEnteros.length;
    if (posicion >= 0 && posicion < longitud) {
        int[] NuevoArregloEnteros = new int[longitud-1];
        System.arraycopy(arregloEnteros, 0, NuevoArregloEnteros, 0, posicion);
        System.arraycopy(arregloEnteros, posicion + 1, NuevoArregloEnteros, posicion, longitud - posicion - 1);
        arregloEnteros=NuevoArregloEnteros;
    }
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    int longitud= valores.length;
    int[] NuevoArregloEnteros = new int[longitud];
    for(int i=0;i<longitud;i++) {
    NuevoArregloEnteros[i]= (int) valores[i];
    }
    arregloEnteros=NuevoArregloEnteros;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    int longitud= objetos.length;
    String[] NuevoArregloCadenas = new String[longitud];
    for(int i=0;i<longitud;i++) {
       NuevoArregloCadenas[i]=  objetos[i].toString();
    }
    arregloCadenas=NuevoArregloCadenas;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    int longitud= arregloEnteros.length;
    int[] NuevoArregloEnteros = new int[longitud];
    for(int i=0;i<longitud;i++) {
    		NuevoArregloEnteros[i]= Math.abs(arregloEnteros[i]);
    	}
    arregloEnteros=NuevoArregloEnteros;
    }
    

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    Arrays.sort(arregloEnteros);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor ) {
    int longitud= arregloEnteros.length;
    int VecesElemento=0;
    	for (int i =0 ;i< longitud;i++) {
	    	if (arregloEnteros[i]== valor) {
	    		VecesElemento +=1;
	    	}
    	}
    return VecesElemento;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    { 
    int longitud= arregloCadenas.length;
    int VecesElemento=0;
	for (int i =0 ;i< longitud;i++) {
    	if (arregloCadenas[i].equalsIgnoreCase(cadena)) {
    		VecesElemento ++;
    	}
	}
	return VecesElemento;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
	    	if (arregloEnteros == null) {
	            return new int[0];
	        }
	    	int Tamaño = 0;
	        for (int i = 0; i < arregloEnteros.length; i++) {
	            if (arregloEnteros[i] == valor) {
	                Tamaño++;
	            }
	        }
	        if(Tamaño==0) {
	            return new int[0];
	        }
	        else {
	       int[] ArregloFinal= new int[Tamaño];
	        int j=0;
	        for (int i = 0; i < arregloEnteros.length; i++) {
	            if (arregloEnteros[i] == valor) {
	                ArregloFinal[j]=i;
	                j++;
	            }
	        }
	        return ArregloFinal;
	        }	
	    }
    

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    int longitud= arregloEnteros.length;
    if(longitud==0) {
    	int[] Rango=  new int[0];
    	return Rango;
    }
    else {
    int minimo=Integer.MAX_VALUE;
    int maximo=-Integer.MIN_VALUE;
    int[] Rango=  new int[2];
    for(int i=0;i <longitud;i++) {
    	if (arregloEnteros[i]< minimo) {
    		minimo= arregloEnteros[i];
    	}
    	if(arregloEnteros[i]>maximo) {
    		maximo=arregloEnteros[i];
    	}
    }
    Rango[0]=minimo;
    Rango[1]=maximo;
        return Rango;
    }
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
    	int longitud= arregloEnteros.length;	
        for (int valor : arregloEnteros) {        
    	   if (histograma.containsKey(valor)) {
    	                histograma.put(valor, histograma.get(valor) + 1);
    	   } 
    	   else {
    	                histograma.put(valor, 1);
    	            }
    	 
    	}
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    int NumEnterosDifRep=0;
    int longitud= arregloEnteros.length;
    int[] arregloOrdenado = Arrays.copyOf(arregloEnteros, longitud);
    Arrays.sort(arregloOrdenado);
    for (int i=0;i<longitud;i++) {
    	int j=i+1;
    		while(j<longitud && arregloOrdenado[j] == arregloOrdenado[i]) {
    			j++;
    		}
    		if(j>i+1) {
    			NumEnterosDifRep++;
    		}
    		i = j - 1;
    }
        return NumEnterosDifRep;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	int longitud=arregloEnteros.length;
        int longitud2=otroArreglo.length;
        	if (longitud == longitud2) {
        		for(int i=0;i<longitud;i++) {
        			if (arregloEnteros[i] != otroArreglo[i]) {
        				return false;
        			}
        			else {
        				return true;
        			}
        		}
        		
        	}
        	else {
        		return false;
        	}
    		return false;
        }
    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	int longitud1= arregloEnteros.length;
    	int longitud2=otroArreglo.length;
    	if(longitud1 != longitud2) {
    		return false;
    	}
    	else {
    	Arrays.sort(arregloEnteros);
    	Arrays.sort(otroArreglo);
    	for(int i=0; i<longitud1;i++) {
    		if(arregloEnteros[i]!= otroArreglo[i]) {
    			return false;
    		}
    	}
    	
        return true;
    }
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    int[] NuevoArregloEnteros= new int[cantidad];
    for(int i=0;i <cantidad;i++) {
    	NuevoArregloEnteros[i]=minimo + (int) (Math.random() * ((maximo - minimo) + 1));
    }
    arregloEnteros=NuevoArregloEnteros;
    }

}
