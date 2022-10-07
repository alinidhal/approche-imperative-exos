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
@Exercice(nom="AffichagePartiel")
public class Ex02_AffichagePartiel {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageValeursSup3() {
		
		//TODO En utilisant une boucle et un if, LOGUER avec Resultat.log 
		// les valeurs du tableau supérieures ou égales à 3
		
		Resultat.log("\nQuestion 1: Sup ou = 3\n");
		
		// Pour i = 0, on parcours la longeur du tableau -1
		
		for (int i = 0; i <= array.length-1; i++) {
		
			// Si la valeur de i dans le tableau est supérieur ou égale à 3 
			
			if (array[i]>=3) {
				
				// Alors, on affiche cette valeur i du tableau (qui est >= 3)
				
				Resultat.log(array[i]);
				
			}
		}
	}
	
	@Test
	@Question(numero=2)
	public void affichageValeursPaires() {
		
		//TODO LOGUER avec Resultat.log les valeurs paires du tableau (0 sera considéré comme pair)
		
		Resultat.log("\nQuestion 2: Valeur pair\n");
		
		for (int i=0; i<= array.length-1; i++) {
			
			if( (array[i] % 2 == 0) && (array[i]>=0) ) {
				
				Resultat.log(array[i]);
		}
			
		}
	}
	
	@Test
	@Question(numero=3)
	public void affichageIndexPairs() {
		
		//TODO LOGUER avec Resultat.log les valeurs correspondant aux index pairs du tableau 
		// (0 sera considéré comme pair)
		
		Resultat.log("\nQuestion 3: Valeur index pairs\n");
		
		for (int i=0; i<= array.length-1; i++) {
			
			if( array[i] % 2 == 0 ) {
				
				Resultat.log(array[i]);
		}
			
		}
	}
	
	@Test
	@Question(numero=4)
	public void affichageValeursImpaires() {
		
		//TODO LOGUER avec Resultat.log les valeurs impaires positives du tableau (0 doit être exclu)
		
		Resultat.log("\nQuestion 4: Valeurs impaires positif !=0\n");
		
		for (int i=0; i<= array.length-1; i++) {
			
			if( (array[i] % 2 != 0) && (array[i]>=0) ) {
				
				Resultat.log(array[i]);
		}
			
		}
	}
}
