/*--------Client--------*/
Create table Client(
	ID_Client int Primary key,
	Nom_Client varchar(25),
	Prenom_Client varchar(25),
	Ville_Client varchar(25),
	Email_Client varchar(25),
	Password_Client varchar(25)
)
/*--------Admin--------*/
Create table Admine(
	ID_Admin int Primary key,
	Nom_Admin varchar(25),
	Prenom_Admin varchar(25),
	Ville_Admin varchar(25),
	Email_Admin varchar(25),
	Password_Admin varchar(25)
)
/*--------Produit--------*/
Create table Produit(
	ID_Produit int Primary key,
	Nom_Produit varchar(25),
	Prix_Produit float,
	Qte_Stock int,
	ID_Admin int references Admine(ID_Admin)
)
/*--------Vote--------*/
Create table Vote(
	ID_Client int references Client(ID_Client),
	ID_Produit int references Produit(ID_Produit),
	Date_V Date,
	Rate int,
	primary key (ID_Client,ID_Produit)
)

/*--------Client--------*/
Insert into Client values (1 ,'Smith' ,'Xavier' ,'Madrid' ,'Xavier.Smith@gmail.com' ,'123456789')
Insert into Client values (2 ,'Gill' ,'Linda' ,'New York' ,'Linda.Gill@gmail.com' ,'123456789')
Insert into Client values (3 ,'Rania' ,'Kalyer' ,'Madrid' ,'Kalyer.Rania@gmail.com' ,'123456789')
/*--------Admin--------*/
Insert into Admine values (1 ,'Gonzalez' ,'Walter' ,'London' ,'Walter.Gonzalez@gmail.com' ,'987654321')
Insert into Admine values (2 ,'Benesnes' ,'Bryan' ,'wednesday west' ,'Bryan.Benesnes@gmail.com' ,'987654321')
Insert into Admine values (3 ,'Hu' ,'Bianca' ,'Tokyo' ,'Bianca.Hu@gmail.com' ,'987654321')
/*--------Produit--------*/
Insert into Produit values (1 ,'Idoukan' ,200 ,20 ,1)
Insert into Produit values (2 ,'Arghan' ,400 ,75 ,1)
Insert into Produit values (3 ,'Sabon Baldy' ,15 ,200 ,3)
/*--------Vote--------*/
Insert into Vote values (3 ,1 ,'2022-05-27' ,5)
Insert into Vote values (3 ,2 ,'2022-05-20' ,4)
Insert into Vote values (2 ,3 ,'2022-04-03' ,2)

update Client set Ville_Client = 'New Delhi' where ID_Client = 3

select * from Client
select * from Admine
select * from Produit
select * from Vote

select * from Client order by Ville_Client

select Nom_Client, Nom_Produit from Client inner join Vote inner join Produit 
on Produit.ID_Produit = Vote.ID_Produit on Vote.ID_Client = Client.ID_Client
where Ville_Client = 'Madrid'

select * from Vote, Produit, Admine, Client
where Produit.ID_Admin = Admine.ID_Admin and Vote.ID_Client = Client.ID_Client
and Vote.ID_Produit = Produit.ID_Produit and Vote.ID_Produit = Produit.ID_Produit 

select * from Client inner join Vote inner join Produit inner join Admine 
on Admine.ID_Admin = Produit.ID_Admin on Produit.ID_Produit = Vote.ID_Produit
on Vote.ID_Client = Client.ID_Client

select count(vote.ID_Produit),Nom_Produit from Produit inner join vote on vote.ID_Produit = Produit.ID_Produit 
group by vote.ID_Produit,Nom_Produit
/*vote*/
select * from vote inner join Produit on vote.ID_Produit = Produit.ID_Produit







