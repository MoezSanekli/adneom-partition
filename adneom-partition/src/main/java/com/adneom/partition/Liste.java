package com.adneom.partition;

import java.util.ArrayList;
import java.util.List;

/*
 * TODO : classe Liste pour
 */
public class Liste {

	/*
	 * TO DO : comment 
	 */
	public static List<List<Integer>> partition(List<Integer> liste,
			Integer taille) {
		List<List<Integer>> nouvelleListe = new ArrayList<>();
		if (taille < 0) {
			nouvelleListe.add(liste);
			return nouvelleListe;
		}

		int i = 0;
		while (i < liste.size()) {
			if (i + taille > liste.size()) {
				nouvelleListe.add(liste.subList(i, i + taille
						- (i + taille - liste.size())));
			} else
				nouvelleListe.add(liste.subList(i, i + taille));
			i += taille;
		}

		return nouvelleListe;
	}

}
