import java.io.*;
import java.util.*;

public class main {
    
    public static void main(String[] args) {

        ArrayList<Association> todoDiccionario = new ArrayList();
        File f = new File( "diccionario.txt" );
        BufferedReader entrada;
        try {
        entrada = new BufferedReader( new FileReader( f ) );
        String linea = entrada.readLine();
       
            while(entrada.ready()){
                linea = entrada.readLine();

                String vector[] = linea.split(",");
                Association separado = new Association();
                separado.addAsociation( vector[0].substring(1), vector[1].substring(0,vector[1].length()-1));

                todoDiccionario.add(separado);

            }

        }catch (IOException e) {
        e.printStackTrace();
        }
        
        System.out.println(todoDiccionario.size());
        System.out.println(todoDiccionario);
        BinaryTree diccionario = new BinaryTree();
        
        for (int x = 0; x < todoDiccionario.size(); x++){
            diccionario.addNode(todoDiccionario.get(x).getKey().toString(), todoDiccionario.get(x).getValor().toString());
        }
        
        
        
        System.out.println(diccionario);
        
        //Se trabaja el arbol binario de manera "in order"
        diccionario.inOrderTraverseTree(diccionario.root);
        
        
        //Mide el tamaño del arbol 
        int contador = todoDiccionario.size();
        System.out.println(contador); 
              
         
    }
    
    
}