create table Users(
	ID_User int primary key,
	First_Name varchar(25),
	Last_Name varchar(25),
	User_Name varchar(25),
	User_PassWord varchar(25)
)
create table Category(
	ID_Category int primary key,
	Name varchar(25)
)
create table Task(
	ID_task int primary key,
	Title varchar(25),
	Description varchar(50),
	Status varchar(25),
	Deadline date,
	ID_Category int references Category(ID_Category)
)
create table Info(
	ID_task int references Task(ID_task),
	ID_User int references Users(ID_User),
	date_debut date,
	primary key (ID_task,ID_User)
)

delete from Users where ID_User = 2
insert into Users values (1,'khalil','FAROUQI','a','a')

insert into Task values (1,'Title1','Description1','en Cours','2022-07-01',1)
