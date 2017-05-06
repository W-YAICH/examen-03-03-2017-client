package tn.esprit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.examen_03_03__2017.persistence.User;
import tn.esprit.examen_03_03__2017.persistence.UserType;
import tn.esprit.examen_03_03__2017.services.CoursEnLigneRemote;


public class Exercice1 {

	public static void main(String[] args) throws NamingException, ParseException {

		String jndiName = "/examen-03-03--2017-ear/examen-03-03--2017-ejb/CoursEnLigneService!tn.esprit.examen_03_03__2017.services.CoursEnLigneRemote";
		Context context = new InitialContext();
	
		CoursEnLigneRemote coursEnLigneRemote = (CoursEnLigneRemote)context.lookup(jndiName);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date birthDate = format.parse("03-05-2016");
		
		coursEnLigneRemote.ajouterUser(new User("Carlos", "Carlos", "Carlos ", 55, birthDate, UserType.STUDENT));
	}

}
