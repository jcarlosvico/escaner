/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 *
 * @author carlos
 */
public class Escaner {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
       Path direct = Paths.get("/home/carlos/jaja/jeje/jiji");
       Files.createDirectories(direct);
       
       if (Files.exists(direct)){
           System.out.println("ya existe");
       }
        
//       String idFichero = "persona.dat";
//
//	try {
//	
//		FileOutputStream ficheroSalida = new FileOutputStream(idFichero); 
//		ObjectOutputStream objetoSalida = new 	ObjectOutputStream(ficheroSalida);
//		
//		// se escriben dos objetos de la clase Vehiculo 
//				
//		objetoSalida.writeObject(new Persona("1234AVS", "Seat" , 34));
//		objetoSalida.writeObject(new Persona("123aaVS", "Saaeat" , 334));
//		objetoSalida.close();
//
//	} catch (FileNotFoundException e) { 
//		System.out.println("¡El fichero no existe!");
//	} catch (IOException e) {
//		System.out.println(e.getMessage());
//	}
//
//try {
//
//		FileInputStream ficheroEntrada = new FileInputStream(idFichero); 
//                Persona a;
//                Persona b;
//           // Se leen los objetos
//           try (ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada)) {
//               // Se leen los objetos
//               a = (Persona) objetoEntrada.readObject();
//               b = (Persona) objetoEntrada.readObject();
//           }
//		System.out.println("Datos de vehiculos leídos del fichero");
//		System.out.println(a);
//		System.out.println(b);
//
//		} catch (FileNotFoundException e) { 
//			System.out.println("¡El fichero no existe!");
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} catch (ClassNotFoundException e){
//			System.out.println("No es un objeto Vehiculo");
//		}
//        
//    }
    
    
    }
}


