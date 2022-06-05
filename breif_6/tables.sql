PGDMP         5                z           Gestion_Produit    14.3    14.3     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    Gestion_Produit    DATABASE     m   CREATE DATABASE "Gestion_Produit" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'French_France.1252';
 !   DROP DATABASE "Gestion_Produit";
                postgres    false            �            1259    16400 
   categories    TABLE     f   CREATE TABLE public.categories (
    id_categories integer NOT NULL,
    nom character varying(25)
);
    DROP TABLE public.categories;
       public         heap    postgres    false            �            1259    16405    produits    TABLE     �   CREATE TABLE public.produits (
    id_produit integer NOT NULL,
    code integer,
    nom character varying(25),
    qtestock integer,
    prixuniter integer,
    id_categories integer,
    id_unite integer
);
    DROP TABLE public.produits;
       public         heap    postgres    false            �            1259    16395    unite    TABLE     \   CREATE TABLE public.unite (
    id_unite integer NOT NULL,
    nom character varying(25)
);
    DROP TABLE public.unite;
       public         heap    postgres    false            �          0    16400 
   categories 
   TABLE DATA           8   COPY public.categories (id_categories, nom) FROM stdin;
    public          postgres    false    210          �          0    16405    produits 
   TABLE DATA           h   COPY public.produits (id_produit, code, nom, qtestock, prixuniter, id_categories, id_unite) FROM stdin;
    public          postgres    false    211   "       �          0    16395    unite 
   TABLE DATA           .   COPY public.unite (id_unite, nom) FROM stdin;
    public          postgres    false    209   ?       f           2606    16404    categories categories_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (id_categories);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    210            h           2606    16409    produits produits_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_pkey PRIMARY KEY (id_produit);
 @   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_pkey;
       public            postgres    false    211            d           2606    16399    unite unite_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.unite
    ADD CONSTRAINT unite_pkey PRIMARY KEY (id_unite);
 :   ALTER TABLE ONLY public.unite DROP CONSTRAINT unite_pkey;
       public            postgres    false    209            i           2606    16410 $   produits produits_id_categories_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_id_categories_fkey FOREIGN KEY (id_categories) REFERENCES public.categories(id_categories);
 N   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_id_categories_fkey;
       public          postgres    false    211    3174    210            j           2606    16415    produits produits_id_unite_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_id_unite_fkey FOREIGN KEY (id_unite) REFERENCES public.unite(id_unite);
 I   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_id_unite_fkey;
       public          postgres    false    3172    211    209            �      x������ � �      �      x������ � �      �      x������ � �     