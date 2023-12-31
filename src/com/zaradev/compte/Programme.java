package com.zaradev.compte;

import java.time.LocalDate;

public class Programme {

	public static void main(String[] args) {
		// Créer un client
		Client client = new Client(11, "Baba", "Ali");

		// Créer un compte et l'associe au client crée
		Compte compte = new Compte(11, "4567123", client);
		client.setCompte(compte);
		// Créer des opérations en l'associant au compte crée
		Operation operation1 = new Operation(LocalDate.of(2023, 03, 05), "VERS", 4000, compte);
		compte.addOperation(operation1);

		Operation operation2 = new Operation(LocalDate.of(2023, 03, 07), "VERS", 5000, compte);
		compte.addOperation(operation2);

		Operation operation3 = new Operation(LocalDate.of(2023, 03, 25), "RETR", 2000, compte);
		compte.addOperation(operation3);

		Operation operation4 = new Operation(LocalDate.of(2023, 03, 30), "RETR", 3000, compte);
		compte.addOperation(operation4);

		Operation operation5 = new Operation(LocalDate.of(2023, 04, 05), "VERS", 6000, compte);
		compte.addOperation(operation5);

		// Afficher détails compte
		System.out.println("client : " + client.getPrenom() + " " + client.getNom());
		System.out.println("Compte N° : " + compte.getNumero());
		System.out.println();
		System.out.println("Opérations : ");
		System.out.println("Date       	 Type        Montant");
		for (Operation operation : compte.getOperations()) {
			System.out.println(
					operation.getDate() + "       " + operation.getType() + "       " + operation.getMontant());
		}
		System.out.println();
		System.out.println("                 SOLDE = " + compte.getSolde());

	}

}
