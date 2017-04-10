--SELECT * FROM java_training.personnes;

CREATE TABLE `produits` (
  `reference` varchar(10) NOT NULL UNIQUE,
  `nom` varchar(50) NOT NULL,
  `prix` double NOT NULL,
  `quantite` integer NOT NULL,
  `fournisseur` varchar(10) NOT NULL,
  PRIMARY KEY (`reference`),
  UNIQUE KEY `refproduit_UNIQUE` (`reference`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `java_training`.`produits` (`reference`, `nom`, `prix`, `quantite`, `fournisseur`) VALUES ('A432', 'Cafetière 12  T', '45.25', '15', 'Taill01');
INSERT INTO `java_training`.`produits` (`reference`, `nom`, `prix`, `quantite`, `fournisseur`) VALUES ('E248', 'Four à micro-ondes encastrable', '255.25', '12', 'Mite02');
INSERT INTO `java_training`.`produits` (`reference`, `nom`, `prix`, `quantite`, `fournisseur`) VALUES ('A521', 'Grille-Pain', '32.55', '25', 'Grill11');
INSERT INTO `java_training`.`produits` (`reference`, `nom`, `prix`, `quantite`, `fournisseur`) VALUES ('A427', 'Four à raclettes 6P', '55.35', '25', 'Thom12');
INSERT INTO `java_training`.`produits` (`reference`, `nom`, `prix`, `quantite`, `fournisseur`) VALUES ('B433', 'Friteuse 1Kg', '48.25', '9', 'Grill11');
INSERT INTO `java_training`.`produits` (`reference`, `nom`, `prix`, `quantite`, `fournisseur`) VALUES ('E647', 'Table de cuisson à induction', '528.5', '8', 'Lois25');


CREATE TABLE `fournisseurs` (
  `reference` varchar(10) NOT NULL UNIQUE,
  `nom` varchar(50) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  PRIMARY KEY (`reference`),
  UNIQUE KEY `refproduit_UNIQUE` (`reference`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `java_training`.`fournisseurs` (`reference`, `nom`, `adresse`) VALUES ('Taill01', 'Taillefert', '12 rue de la dune; 75010 Paris');
INSERT INTO `java_training`.`fournisseurs` (`reference`, `nom`, `adresse`) VALUES ('Mite02', 'Mitenne', '1 impasse du Cèdre; 75015 Paris');
INSERT INTO `java_training`.`fournisseurs` (`reference`, `nom`, `adresse`) VALUES ('Grill11', 'Grillon', '124 boulevard des Capucines; 45000 Orléans');
INSERT INTO `java_training`.`fournisseurs` (`reference`, `nom`, `adresse`) VALUES ('Thom12', 'Thomas', '2 boulevard de l\'Océan; 33000 Bordeaux');
INSERT INTO `java_training`.`fournisseurs` (`reference`, `nom`, `adresse`) VALUES ('Lois25', 'Loiseau', '108 boulevard Maupassant; 69000 Lyon');
