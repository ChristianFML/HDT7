import java.util.Map;
import java.io.*;


public class Association<K,V> implements Map.Entry<K,V>
{

    protected K tKey; 
    protected V tValor; 
    
    public Association(K key, V valor)
    {
        tKey = key;
        tValor = valor;
    }

 
    public Association(K key)
    {
        this(key,null);
    }


    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }
    

    public int hashCode()
    {
        return getKey().hashCode();
    }
    

    public V getValue()
    {
        return tValor;
    }


    public K getKey()
    {
        return tKey;
    }


    public V setValue(V value)
    {
        V oldValue = tValor;
        tValor = value;
        return oldValue;
    }


    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }
    
    public String leerArchivo(String direccion){

    		String resultado = "";
    		try {
    			FileReader f = new FileReader(direccion);
    			BufferedReader b = new BufferedReader(f);
    			try {
    				resultado = b.readLine();
    				b.close();
    			} catch (IOException e) {
    				return "No se puede abrir archivo";
    			}
    		} catch (FileNotFoundException e) {
    			return "Archivo no encontrado";
    		}
    		return resultado;
    	}
    

}