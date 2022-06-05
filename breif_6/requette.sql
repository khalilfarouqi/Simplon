create table produits(
	id_produit int primary key,
	code int,
	nom varchar(25),
	QteStock int,
	PrixUniter int,
	id_categories int references categories(id_categories),
	id_unite int references unite(id_unite)
)
create table categories(
	id_categories int primary key,
	nom varchar(25)
)
create table unite inner join (
	id_unite int primary key,
	nom varchar(25)
)
select * from unite inner join produits inner join categories 
on categories.id_categories = produits.id_categories
on unite.id_unite = produits.id_unite
