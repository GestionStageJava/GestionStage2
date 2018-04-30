/*
stage
    bbd stage
    groupe stage
    set role stage;
*/

---------------------
-- CREATION TABLES --
---------------------

create table stagiaire(idStagiaire serial primary key, nomStagiaire varchar(30), prenomStagiaire varchar(30));
create table lieu(idLieu serial primary key, nomLieu varchar(30));
create table stage(idStage serial primary key, libelle varchar(30), nbPlace integer, idLieu integer, foreign key(idLieu) references lieu(idLieu));
create table stageStagiaire(idStage integer, idStagiaire integer, primary key(idStage,idStagiaire), foreign key(idStage) references stage(idStage), foreign key(idStagiaire) references stagiaire(idStagiaire));
create table semaine(numSemaine integer, annee integer, primary key(numSemaine,annee));
create table stageSemaine(idStage integer, numSemaine integer, annee integer, primary key(idStage,numSemaine,annee), foreign key(idStage) references stage(idStage), foreign key(numSemaine,annee) references semaine(numSemaine,annee));

-----------------
-- JEU D'ESSAI --
-----------------

-- stagiaire
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Leopold','Paris');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Arno','Diz');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Paul','Far');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Jeffrey','People');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Dean','Wright');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Virgilio','Lorenzo');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Julienne','Phaneuf');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Lilly','Walsh');
insert into stagiaire(nomStagiaire, prenomStagiaire) values('Mikiko','Nishi');

-- lieu
insert into lieu(nomLieu) values('CHU Poitiers');
insert into lieu(nomLieu) values('Garage Peugeot');
insert into lieu(nomLieu) values('Wazinfo');
insert into lieu(nomLieu) values('ProStage');

-- semaine
insert into semaine(numSemaine,annee) values(1,2017);
insert into semaine(numSemaine,annee) values(2,2017);
insert into semaine(numSemaine,annee) values(3,2017);
insert into semaine(numSemaine,annee) values(4,2017);
insert into semaine(numSemaine,annee) values(5,2017);

insert into semaine(numSemaine,annee) values(1,2018);
insert into semaine(numSemaine,annee) values(2,2018);
insert into semaine(numSemaine,annee) values(3,2018);

insert into semaine(numSemaine,annee) values(15,2018);
insert into semaine(numSemaine,annee) values(16,2018);
insert into semaine(numSemaine,annee) values(17,2018);

insert into semaine(numSemaine,annee) values(39,2018);
insert into semaine(numSemaine,annee) values(40,2018);

-- stage

insert into stage(libelle, nbPlace, idLieu) values('secourisme',3,1);
insert into stage(libelle, nbPlace, idLieu) values('secourisme',2,1);
insert into stage(libelle, nbPlace, idLieu) values('travail à l''atelier',2,2);
insert into stage(libelle, nbPlace, idLieu) values('mise à jour site web',1,3);
insert into stage(libelle, nbPlace, idLieu) values('creation site marchand',3,3);
insert into stage(libelle, nbPlace, idLieu) values('mise à jour site web',2,3);
insert into stage(libelle, nbPlace, idLieu) values('gestion de stages',3,4);

-- stageStagiaire

insert into stageStagiaire(idStage, idStagiaire) values (1,1);
insert into stageStagiaire(idStage, idStagiaire) values (1,2);
insert into stageStagiaire(idStage, idStagiaire) values (2,3);
insert into stageStagiaire(idStage, idStagiaire) values (3,4);
insert into stageStagiaire(idStage, idStagiaire) values (4,5);
insert into stageStagiaire(idStage, idStagiaire) values (4,6);
insert into stageStagiaire(idStage, idStagiaire) values (5,7);
insert into stageStagiaire(idStage, idStagiaire) values (6,8);
insert into stageStagiaire(idStage, idStagiaire) values (7,9);
insert into stageStagiaire(idStage, idStagiaire) values (7,1);

-- stageSemaine

insert into stageSemaine(idStage, numSemaine, annee) values (1,1,2017);

insert into stageSemaine(idStage, numSemaine, annee) values (2,1,2017);
insert into stageSemaine(idStage, numSemaine, annee) values (2,2,2017);

insert into stageSemaine(idStage, numSemaine, annee) values (3,2,2017);
insert into stageSemaine(idStage, numSemaine, annee) values (3,3,2017);
insert into stageSemaine(idStage, numSemaine, annee) values (3,4,2017);
insert into stageSemaine(idStage, numSemaine, annee) values (3,5,2017);

insert into stageSemaine(idStage, numSemaine, annee) values (4,1,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (4,2,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (4,3,2018);

insert into stageSemaine(idStage, numSemaine, annee) values (5,1,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (5,2,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (5,3,2018);

insert into stageSemaine(idStage, numSemaine, annee) values (5,15,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (5,16,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (5,17,2018);

insert into stageSemaine(idStage, numSemaine, annee) values (6,39,2018);
insert into stageSemaine(idStage, numSemaine, annee) values (6,40,2018);

insert into stageSemaine(idStage, numSemaine, annee) values (7,2,2017);
insert into stageSemaine(idStage, numSemaine, annee) values (7,3,2017);
insert into stageSemaine(idStage, numSemaine, annee) values (7,4,2017);

-------------
-- TRIGGER --
-------------

	-----------------------------------------
	-- Si on supprime un lieu (table lieu) --
	--       on supprime dans stage	       -- FONCTIONNEL
	-----------------------------------------

create or replace function func_suppr_lieu() returns trigger as $$
    begin
        delete from stage where idLieu = OLD.idlieu;
        return OLD;
    end;
$$ language plpgsql;

create trigger trig_suppr_lieu
before delete on lieu
for each row
execute procedure func_suppr_lieu();

	-------------------------------------------
	-- Si on supprime un stage (table stage) --
	--   on supprime dans stageStagiaire     --  FONCTIONNEL
	--    on supprime dans stageSemaine      --
	-------------------------------------------

create or replace function func_suppr_stage() returns trigger as $$
    begin
        delete from stageStagiaire where idstage = OLD.idstage;	
	delete from stageSemaine where idstage = OLD.idstage;
        return OLD;
    end;
$$ language plpgsql;

create trigger trig_suppr_stage
before delete on stage
for each row
execute procedure func_suppr_stage();

	---------------------------------------------------
	-- Si on supprime un stagiaire (table stagiaire) --
	--        on supprime dans stageStagiaire        -- FONCTIONNEL
	---------------------------------------------------

create or replace function func_suppr_stagiaire() returns trigger as $$
    begin
        delete from stagestagiaire where idstagiaire = OLD.idstagiaire;
        return OLD;
    end;
$$ language plpgsql;

create trigger trig_suppr_stagiaire
before delete on stagiaire
for each row
execute procedure func_suppr_stagiaire();

	---------------------------------------------------
	--           Si on ajoute un stagiaire           --
	-- verifier si le nom ET le prenom existe ou pas -- FONCTIONNEL
	---------------------------------------------------

create or replace function func_verif_nom_prenom_stagiaire() returns trigger as $$
    begin
        if exists(select nomstagiaire,prenomstagiaire from stagiaire where nomstagiaire = NEW.nomstagiaire and prenomstagiaire = NEW.prenomstagiaire) = false then
            insert into stagiaire(nomstagiaire,prenomstagiaire) values (NEW.nomstagiaire,NEW.prenomstagiaire);
        else
            RAISE EXCEPTION 'Ce stagiaire existe deja !';	
        end if;
    return NEW;
    end;
$$ language plpgsql;

create trigger trig_verif_nom_prenom_stagiaire
before insert on stagiaire
for each row
execute procedure func_verif_nom_prenom_stagiaire();

	-------------------------------------------
	--         Si on ajoute un lieu          --
	--   verifier si le lieu existe ou pas   -- FONCTIONNEL
	-------------------------------------------

create or replace function func_verif_lieu() returns trigger as $$
    begin
        if exists(select nomlieu from lieu where nomlieu = NEW.nomlieu) = false then
            insert into lieu(nomlieu) values (NEW.nomlieu);
        else
            RAISE EXCEPTION 'Ce lieu existe deja !';
        end if;    
    return NEW;
    end;
$$ language plpgsql;

create trigger trig_verif_nom_lieu
before insert on lieu
for each row
execute procedure func_verif_lieu();

	-----------------------------------------------------------------
	-- verif entre nombres place dans stage et le nombre de lignes --
	--       comportant l'id d'un stage dans stageStagiaire        -- FONCTIONNEL
	-----------------------------------------------------------------

create or replace function func_verif_nombres_places() returns trigger as $$
    declare
        nbPlacesPrises int;
        nbPlacesTotales int;
    begin
        select into nbPlacesPrises count(*) from stagestagiaire where idstage = NEW.idstage;
        select into nbPlacesTotales nbplace from stage where idstage = NEW.idstage;
	
	if nbPlacesPrises > nbPlacesTotales then
            RAISE EXCEPTION 'Le nombre de stagiaire pour ce stage est dépassé !';
        end if;	
    return NEW;
    end;
$$ language plpgsql;

create trigger trig_verif_nombres_places
before insert on stagestagiaire
for each row
execute procedure func_verif_nombres_places();

