////////////////////////////////////////////////////////////////////////////////////////////////////////														
//TIMOTHY & ADAM                                                                                      //
//ICS3U                 																			  //
//Le 22 juin 2021        																			  //
//Projet finale: Jeux de pièce																	      //
//*Le but de ce jeux est de gagner 2 points par un côté qui atterrit deux fois.                       //
//*Les deux joueurs sont piles et faces.															  //
////////////////////////////////////////////////////////////////////////////////////////////////////////


//importation du générateur au hazard
import java.util.Random;
public class CoinFlip {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//fonction du générateur aléatoire
Random rand = new Random();
//déclaration des variables et des constants
int NombreJeux = 3; //le meilleur sur 3
int FaceGagne = 0; //Nombre de jeux gagnés pour le côté face
int PileGagne = 0; //Nombre de jeux gagnés pour le côté pile
int Compteur = 0;
int Coin;
boolean gameNOTover = true;
final int Face = 0;
final int Pile = 1;
//Le boucle while du jeu qui choisit au hazard une des deux côtés
while (gameNOTover){
	Coin = rand.nextInt(2);
flip();
//Si la pièce = face, le joueur face gagne un point, sinon, le joueur pile gagne
if (Coin == Face){
	FaceGagne++;
	clearpage();
	printFace();
}
else { 
	PileGagne++;
	clearpage();
	printPile();
}
//Système qui compte le nombre de jeux gagnés
Compteur++;
//Le jeux termine si une des trois conditions suivantes sont atteints
if (Compteur==3) gameNOTover = false;
if (PileGagne==2) gameNOTover = false;
if (FaceGagne==2) gameNOTover = false;
Thread.sleep(2000);
clearpage();
//Imprime le nombre de points pour chaque joueur
System.out.println("Nombre de Faces: " + FaceGagne);
System.out.println("Nombre de Piles: " + PileGagne);
Thread.sleep(2000);
}

//Imprime la déclaration du gagnant
clearpage();
if (FaceGagne > PileGagne)
System.out.println("Gagnant: Faces ||"+ " Nombres de Faces = " + FaceGagne);
else
System.out.println("Gagnant: Piles ||"+ " Nombre de Piles = " + PileGagne);
}

// L'animation du pièce de monnaie
//fonction pour l'animation face
static void printFace() {
System.out.println("                            ");		  
System.out.println("         ___                ");
System.out.println("      /       \\            ");				    
System.out.println("     /    __   \\           ");
System.out.println("     |   |__    |           ");
System.out.println("     |   |      |           ");
System.out.println("     \\         /           ");
System.out.println("      \\  ___  /            ");
System.out.println("                            ");	
    
}
//fonction pour l'animation pile
static void printPile() {
System.out.println("                            ");		  
System.out.println("         ___                ");
System.out.println("      /       \\            ");				    
System.out.println("     /    __   \\           ");
System.out.println("     |   |__|   |           ");
System.out.println("     |   |      |           ");
System.out.println("     \\         /           ");
System.out.println("      \\  ___  /            ");
System.out.println("                            ");

    
}
//fonction pour effacer la page
static void clearpage() {
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");	
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
  System.out.println ("                          ");
}
//fonction pour faire lancer la pièce de monnaie
	static void flip() throws InterruptedException {
		for(int i = 0; i<10; i++) {
			printFace();
			Thread.sleep(200);
			clearpage();
			printPile();
			Thread.sleep(200);
			clearpage();
		}
	
	}

}
