package AbstractLibro;

import java.util.Set;

public class AppPublicacion {
	 public static void main(String[] args) {
	        // Crear fechas
	        DTFecha f1 = new DTFecha(15, 5, 2023);     // Artículo
	        DTFecha f2 = new DTFecha(10, 2, 2024);
	        
	        DTFecha f3 = new DTFecha(20, 8, 2022);    // Libro
	        DTFecha f4 = new DTFecha(20, 8, 2022);
	        
	        DTFecha f5 = new DTFecha(20, 10, 2024);    // Página Web

	        // articulos
	        ArticulosRevista a1 = new ArticulosRevista(
	            "10.123/abc123",
	            "Fundamentos de POO",
	            f1,
	            "Programacion Avanzada",
	            "introduccion a los principios fundamentales de la programmacion orientada a objetos ."
	        );
	        ArticulosRevista a2 = new ArticulosRevista(
		            "10.4567/jkl012",
		            "Utilidad de diagramas UML",
		            f2,
		            "Modelado de softaware",
		            "Ejercicio empirico de como los diagramas UML pueden ayudar en el proceso y documentacion ."
		        );
	        
//libros 
	        
	        Libro l1 = new Libro(
	            "10.234/def456",
	            "Patrones de Diseno en c++",
	            f3,
	            "Software Desing",
	            Set.of("Diseno", "OOP", "Class")
	        );
	        Libro l2 = new Libro(
		            "10.5678/mno345",
		            "Guia de UML",
		            f4,
		            "IEEE",
		            Set.of("Diagramas", "UML", "Softaware","Modelado")
		        );

	        PaginaWeb p1 = new PaginaWeb(
	            "10.3456/ghi789",
	            "Diagramas para principiantes",
	            f5,
	            "www.umlparaprincipiantes.com",
	            "en esta pagina web se presenta una guia completa sobre los diagramas UML."
	        );

	       
	        Investigador inv1 = new Investigador("0000-0003-1234-5678", "Carlos Olveri", "Universidad de la Republica");
	        Investigador inv2 = new Investigador("0000-0001-8765-4321", "Alberto Santos", "Instituto Tecnico");
	        Investigador inv3 = new Investigador("0000-0003-3456-7890", "Misael Cuenca", "Univercidad EPN");
	        Investigador inv4 = new Investigador("0000-0002-9876-1254", "Santiago Rey", "Instituto Sucre");
	        Investigador inv5 = new Investigador("0000-0004-5678-2345", "Alex Mena", "Univercidad UCE");
	       
	        
	        inv1.agregarPublicacion(a1);
	        inv2.agregarPublicacion(a2);
	        inv3.agregarPublicacion(l1); 
	        inv4.agregarPublicacion(l2);
	        inv5.agregarPublicacion(p1);

	       
	        System.out.println("Investigadores:");
	        System.out.println(inv1);
	        System.out.println(inv2);
	        System.out.println(inv3);
	        System.out.println(inv4);
	        System.out.println(inv5);

	
	        
	        System.out.println("\nREVISTAS:");
	        System.out.println(a1.getDT());
	        System.out.println(a2.getDT());

	        System.out.println("\nLIBROS:");
	        System.out.println(l1.getDT());
	        System.out.println(l2.getDT());

	        System.out.println("\nPÁGINA WEB:");
	        System.out.println(p1.getDT());

	  

	     


}
}
