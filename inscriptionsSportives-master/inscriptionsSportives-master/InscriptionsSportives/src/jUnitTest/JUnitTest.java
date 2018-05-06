package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

import inscriptions.Competition;
import inscriptions.Equipe;
import inscriptions.Inscriptions;
import inscriptions.Personne;

class JUnitTest {
	
	LocalDate datecloture = LocalDate.now().plus(1, ChronoUnit.YEARS);
	Inscriptions inscriptions = Inscriptions.getInscriptions();
	Competition flechettes = inscriptions.createCompetition("Mondial de flechettes", datecloture, false);
	Personne tony = inscriptions.createPersonne("Tony", "Dent de plomb", "azerty"), 
			boris = inscriptions.createPersonne("Boris", "le Hachoir", "ytreza");
	Equipe lesManouches = inscriptions.createEquipe("Les Manouches");
	
	public void equipe() {
		Equipe lesManouches = inscriptions.createEquipe("Les Manouches");
		lesManouches.add(boris);
		lesManouches.add(tony);
	}
	
	@Test
	void testGetNom() {
		assertEquals("Tony", tony.getNom());
	}

	@Test
	void testSetNom() {
		tony.setNom("Toto");
		assertEquals("Toto", tony.getNom());
	}

	@Test
	void testGetCompetitions() {
		equipe();
		assertEquals("Les Manouches", tony.getCompetitions());
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

}
