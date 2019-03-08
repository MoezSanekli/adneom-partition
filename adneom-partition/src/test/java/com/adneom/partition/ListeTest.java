package com.adneom.partition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListeTest {

	@Test
	public void testPartitionAvecListeDivisibleParTaille() {
		List<Integer> list = getListOf(6);

		List<List<Integer>> result = Liste.partition(list, 2);
		assertEquals(3, result.size());
		assertEquals(2, result.get(0).size());
		assertEquals(2, result.get(1).size());
		assertEquals(2, result.get(2).size());
	}

	@Test
	public void testPartitionAvecListeNonDivisibleParTaille() {
		List<Integer> list = getListOf(7);

		List<List<Integer>> result = Liste.partition(list, 3);
		assertEquals(3, result.size());
		assertEquals(3, result.get(0).size());
		assertEquals(3, result.get(1).size());
		assertEquals(1, result.get(2).size());
	}

	@Test
	public void testPartitionAvecTailleNegative() {
		List<Integer> list = getListOf(3);

		List<List<Integer>> result = Liste.partition(list, -2);

		assertEquals(1, result.size());
		assertEquals(list, result.get(0));
	}

	@Test
	public void testPartitionAvecTailleSuperieurAListe() {
		List<Integer> list = getListOf(3);

		List<List<Integer>> result = Liste.partition(list, 4);

		assertEquals(1, result.size());
		assertEquals(list, result.get(0));
	}

	@Test
	public void testPartitionAvecListeVide() {
		List<Integer> list = getListOf(0);

		List<List<Integer>> result = Liste.partition(list, 3);

		assertEquals(0, result.size());
	}

	/*
	 * Retourne une liste de taille n
	 */
	private List<Integer> getListOf(int n) {
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			integers.add(i);
		}

		return integers;

	}

}
