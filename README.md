
# CREAR APLICACIONS AMB JAR


1. Crea un JAR amb una aplicació que ens mostri “Hola món!”, explica clarament com i quines instruccions has fet anar per crear-lo.

	Comencem en crear un arxiu anomenat 'arnau'.java en el qual hi posarem a dins el següent.

		package arnau;
		public class arnau{

			public static void main(String[] args){
				System.out.println("HELLOW MY BOY");		
			}

		}

	Una vegada creat el .java, ens dedicarem a compilar aquesta classe amb la següent comanda.
    
    	javac -jar 'archivo'.java
        
	![compilacio](/img/1.png)
    
	Despres crearem un arxiu anomenat MANIFEST.MF afora de la carpeta i que contindrà el següent.
    
    Manifest-Version: 1.0
    Created-By: 1.5.0_06 (BEA Systems, Inc.)
    Main-Class: arnau.arnau
    Class-Path: UtilitatsMeves.jar UtilitatsNoMeves.jar
    
    Ara ens toca crear el .JAR amb la següent comanda
    
    	jar cvmf MANIFEST.MF arnau.jar arnau
    
     ![jar](/img/2.png)
        
        
	2 Executa el JAR, i mostra el seu resultat.
    
	![compilacio](/img/3.png)
    
    
    
### INCLOURE JAR'S A LA MEVA APLICACIÓ
	
   1.Descarrega't el JAR DAWUtils.jar, l'API d'aquest JAR 	i l'exemple ProvaUtils.java.
	
   
  ![descarrega](/img/4.png)
    
   2.Crea el teu propi package i actualitza el fitxer ProvaUtils.java de forma que estigui dins d'aquest.
    
    	
    
Intenta executar ProvaUtils. Cal fer-ho de tres formes diferents:
     
1.Fes ús de l'opció -classpath
	 	
  ![classpath1](/img/6.png)
     
2.Posa el JAR en el teu CLASSPATH
	 
   ![classpath2](/img/7.png)
     
3.Inclou el JAR dins el teu MANIFEST.MF
	 
   ![classpath3](/img/8.png)  	
     
4.Quina de les tres opcions anteriors trobes millor?
	 
La millor opció per a mi, ha estat sense dubte, afegir el fitxer .JAR a dins del fitxer MANIFEST, ja que et dona més flexibilitat i una millora en el rendiment i la rapidesa.	
     
5.Detalla tot comentant el codi que fa en general el programa i en concret cada línia, el programa ProvaUtils.java 1 .

		

