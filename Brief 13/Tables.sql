Create table Role (
	ID bigint primary key,
	Nom varchar(25)
)
Create table Users (
	ID bigint primary key,
	Nom varchar(25),
	Prenom varchar(25),
	Username varchar(50),
	Password varchar(50),
	Email varchar(50) UNIQUE,
	Telephone varchar(25),
	ID_Role bigint references Role(ID)
)
Create table Responsable (
	Domain varchar(25),
	Type varchar(25),
	Etat varchar(25)
) INHERITS (Users)
Create table Participant (
	Domain varchar(25),
	Structure varchar(25)
) INHERITS (Users)
Create table Administrateur(
	Etat varchar(25)
) INHERITS (Users)
Create table Exercice(
	ID bigint primary key,
	Année Int,
	Date_début Date,
	Date_fin Date,
	Statut varchar(25)
)
Create table Activite(
	ID bigint primary key,
	titre varchar(50),
	descriptif varchar(100),
	type varchar(25),
	date_début Date,
	date_fin Date,
	Etat varchar(25),
	ID_User bigint references Users(ID),
	ID_Exe bigint references Exercice(ID)
)
Create table Activité_Participant(
	ID_Activ bigint references Activite(ID),
	ID_User bigint references Users(ID),
	Primary key (ID_Activ,ID_User)
)











