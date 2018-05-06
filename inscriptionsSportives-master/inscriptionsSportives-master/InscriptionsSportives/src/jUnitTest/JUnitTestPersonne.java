package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import inscriptions.Competition;
import inscriptions.Equipe;
import inscriptions.Inscriptions;
import inscriptions.Personne;

class JUnitTestPersonne {

	LocalDate datecloture = LocalDate.now().plus(1, ChronoUnit.YEARS);
	Inscriptions inscriptions = Inscriptions.getInscriptions();
	Competition flechettes = inscriptions.createCompetition("Mondial de flechettes", datecloture, false);
	Personne tony = inscriptions.createPersonne("Tony", "Dent de plomb", "azerty"), 
			boris = inscriptions.createPersonne("Boris", "le Hachoir", "ytreza");
	
	public void a() {
	Equipe lesManouches = inscriptions.createEquipe("Les Manouches");
	lesManouches.add(boris);
	lesManouches.add(tony);
	}

	
	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPrenom() {
		assertEquals("Tony", tony.getNom());
	}

	@Test
	void testSetPrenom() {
		tony.setPrenom("Toto");
		assertEquals("Toto", tony.getPrenom());
	}

	@Test
	void testGetMail() {
		assertEquals("azerty", tony.getMail());
	}

	@Test
	void testSetMail() {
		tony.setMail("qsdf");
		assertEquals("qsdf", tony.getMail());
	}

	@Test
	void testGetEquipes() {
		Set<Equipe> equipe = new TreeSet<>();
		Equipe lesManouches = inscriptions.createEquipe("Les Manouches");
		Equipe Galactik = inscriptions.createEquipe("Les Galactiks");
		lesManouches.add(tony);
		equipe.add(lesManouches);
		
		assertEquals(equipe, tony.getEquipes());
	}

	@Test
	void testAddEquipe() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveEquipe() {
		fail("Not yet implemented");
	}

}
