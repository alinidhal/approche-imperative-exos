package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="AffichageTableau")
public class Ex03_AffichageTableau {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableau() {
		
		//TODO LOGUER les éléments du tableau grâce à une boucle
		
		Resultat.log("Question 1: Éléments du tableau\n");
		
		for (int i =0; i<=array.length-1; i++) {
			
			Resultat.log(array[i]);
		}
	
	}
		
	
	@Test
	@Question(numero=2)
	public void affichageTableauOrdreInverse() {
		
		//TODO LOGUER les éléments du tableau dans l'ordre inverse
		
		Resultat.log("\nQuestion 2: Éléments du tableau ordre inverse\n");
		
		for (int i = (array.length-1); i>=0; i--) {
			
			Resultat.log(array[i]);
		}
		
	}
}
