--------------------------------------------------------
--  File created - Samstag-Juni-07-2008   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence SEQ_ABSCHLUSSARBEIT_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SMARTPMS"."SEQ_ABSCHLUSSARBEIT_ID"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_KLAUSUR_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SMARTPMS"."SEQ_KLAUSUR_ID"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_LEHRANGEBOT_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SMARTPMS"."SEQ_LEHRANGEBOT_ID"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_PERSON_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SMARTPMS"."SEQ_PERSON_ID"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table ABSCHLUSSARBEIT
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."ABSCHLUSSARBEIT" 
   (	"ID" NUMBER, 
	"TYP" NUMBER(1,0), 
	"THEMA" VARCHAR2(50 CHAR), 
	"BESCHREIBUNG" VARCHAR2(255 CHAR), 
	"ABGABETERMIN" DATE, 
	"NOTE" NUMBER(1,1), 
	"ECTS" NUMBER(2,1), 
	"PROFESSOR" NUMBER, 
	"STUDENT" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table DOZENT
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."DOZENT" 
   (	"ID" NUMBER, 
	"TITEL" VARCHAR2(20 CHAR), 
	"BUERO" VARCHAR2(20 CHAR)
   ) ;
--------------------------------------------------------
--  DDL for Table KLAUSUR
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."KLAUSUR" 
   (	"ID" NUMBER, 
	"LEHRANGEBOT" NUMBER, 
	"BEGINN" DATE, 
	"ENDE" DATE, 
	"ECTS" NUMBER(2,1) DEFAULT 5.0, 
	"MINDESTECTS" NUMBER(2,1) DEFAULT 0
   ) ;
--------------------------------------------------------
--  DDL for Table LEHRANGEBOT
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."LEHRANGEBOT" 
   (	"ID" NUMBER, 
	"NUMMER" VARCHAR2(10 CHAR), 
	"BEZEICHNUNG" VARCHAR2(100 CHAR), 
	"DOZENT" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table PERSON
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."PERSON" 
   (	"ID" NUMBER, 
	"ANREDE" VARCHAR2(4 CHAR), 
	"VORNAME" VARCHAR2(50 CHAR), 
	"NACHNAME" VARCHAR2(100 CHAR), 
	"ANSCHRIFT1" VARCHAR2(100 CHAR), 
	"ANSCHRIFT2" VARCHAR2(100 CHAR), 
	"POSTLEITZAHL" VARCHAR2(5 CHAR), 
	"WOHNORT" VARCHAR2(100 CHAR), 
	"TELEFON" VARCHAR2(20 CHAR), 
	"TELEFAX" VARCHAR2(20 CHAR), 
	"MOBILTELEFON" VARCHAR2(20 CHAR), 
	"EMAIL" VARCHAR2(255 CHAR), 
	"GEBURTSDATUM" DATE, 
	"TYP" CHAR(1 CHAR)
   ) ;
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."STUDENT" 
   (	"ID" NUMBER, 
	"MATRIKELNUMMER" NUMBER(10,0), 
	"STUDIENGANG" VARCHAR2(100 CHAR), 
	"SEMESTER" NUMBER(2,0) DEFAULT 1
   ) ;
--------------------------------------------------------
--  DDL for Table TEILNAHME
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."TEILNAHME" 
   (	"STUDENT" NUMBER, 
	"KLAUSUR" NUMBER, 
	"VERSUCH" NUMBER(2,0) DEFAULT 1, 
	"NOTE" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table TERMIN
--------------------------------------------------------

  CREATE TABLE "SMARTPMS"."TERMIN" 
   (	"ID" NUMBER, 
	"TYP" NUMBER(1,0), 
	"RAUM" VARCHAR2(5 CHAR), 
	"WOCHENTAG" NUMBER(1,0), 
	"BEGINN" DATE, 
	"ENDE" DATE, 
	"LEHRANGEBOT" NUMBER
   ) ;

---------------------------------------------------
--   DATA FOR TABLE ABSCHLUSSARBEIT
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.ABSCHLUSSARBEIT

---------------------------------------------------
--   END DATA FOR TABLE ABSCHLUSSARBEIT
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE DOZENT
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.DOZENT

---------------------------------------------------
--   END DATA FOR TABLE DOZENT
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE KLAUSUR
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.KLAUSUR

---------------------------------------------------
--   END DATA FOR TABLE KLAUSUR
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE LEHRANGEBOT
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.LEHRANGEBOT

---------------------------------------------------
--   END DATA FOR TABLE LEHRANGEBOT
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE PERSON
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.PERSON

---------------------------------------------------
--   END DATA FOR TABLE PERSON
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE STUDENT
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.STUDENT

---------------------------------------------------
--   END DATA FOR TABLE STUDENT
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE TEILNAHME
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.TEILNAHME

---------------------------------------------------
--   END DATA FOR TABLE TEILNAHME
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE TERMIN
--   FILTER = none used
---------------------------------------------------
REM INSERTING into SMARTPMS.TERMIN

---------------------------------------------------
--   END DATA FOR TABLE TERMIN
---------------------------------------------------
--------------------------------------------------------
--  Constraints for Table TERMIN
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."TERMIN" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TERMIN" MODIFY ("TYP" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TERMIN" MODIFY ("WOCHENTAG" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TERMIN" MODIFY ("BEGINN" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TERMIN" MODIFY ("ENDE" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TERMIN" MODIFY ("LEHRANGEBOT" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TERMIN" ADD CONSTRAINT "TERMIN_PK" PRIMARY KEY ("ID") ENABLE;
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."STUDENT" ADD CONSTRAINT "STUDENT_CHK1" CHECK (
semester < 100
) ENABLE;
 
  ALTER TABLE "SMARTPMS"."STUDENT" ADD CONSTRAINT "STUDENT_CHK2" CHECK (
semester > 0
) ENABLE;
 
  ALTER TABLE "SMARTPMS"."STUDENT" ADD CONSTRAINT "STUDENT_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."STUDENT" ADD CONSTRAINT "STUDENT_UK1" UNIQUE ("MATRIKELNUMMER") ENABLE;
 
  ALTER TABLE "SMARTPMS"."STUDENT" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."STUDENT" MODIFY ("MATRIKELNUMMER" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."STUDENT" MODIFY ("STUDIENGANG" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table LEHRANGEBOT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" ADD CONSTRAINT "LEHRANGEBOT_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" ADD CONSTRAINT "LEHRANGEBOT_UK1" UNIQUE ("NUMMER") ENABLE;
 
  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" MODIFY ("NUMMER" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" MODIFY ("BEZEICHNUNG" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" MODIFY ("DOZENT" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TEILNAHME
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."TEILNAHME" MODIFY ("STUDENT" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TEILNAHME" MODIFY ("KLAUSUR" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."TEILNAHME" ADD CONSTRAINT "TEILNAHME_CHK1" CHECK (versuch > 0) ENABLE;
 
  ALTER TABLE "SMARTPMS"."TEILNAHME" ADD CONSTRAINT "TEILNAHME_PK" PRIMARY KEY ("STUDENT", "KLAUSUR") ENABLE;
--------------------------------------------------------
--  Constraints for Table DOZENT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."DOZENT" ADD CONSTRAINT "DOZENT_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."DOZENT" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PERSON
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."PERSON" ADD CONSTRAINT "PERSON_CHK1" CHECK (
typ in ('D','S','H','P')
) ENABLE;
 
  ALTER TABLE "SMARTPMS"."PERSON" ADD CONSTRAINT "PERSON_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."PERSON" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."PERSON" MODIFY ("ANREDE" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."PERSON" MODIFY ("VORNAME" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."PERSON" MODIFY ("NACHNAME" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ABSCHLUSSARBEIT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" ADD CONSTRAINT "ABSCHLUSSARBEIT_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" ADD CONSTRAINT "ABSCHLUSSARBEIT_UK1" UNIQUE ("THEMA") ENABLE;
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("TYP" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("THEMA" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("ABGABETERMIN" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("ECTS" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("PROFESSOR" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" MODIFY ("STUDENT" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table KLAUSUR
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."KLAUSUR" ADD CONSTRAINT "KLAUSUR_CHK1" CHECK (to_char(beginn,'DD.MM.YYYY') = to_char(ende,'DD.MM.YYYY')) ENABLE;
 
  ALTER TABLE "SMARTPMS"."KLAUSUR" ADD CONSTRAINT "KLAUSUR_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."KLAUSUR" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."KLAUSUR" MODIFY ("LEHRANGEBOT" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."KLAUSUR" MODIFY ("BEGINN" NOT NULL ENABLE);
 
  ALTER TABLE "SMARTPMS"."KLAUSUR" MODIFY ("ENDE" NOT NULL ENABLE);
--------------------------------------------------------
--  DDL for Index ABSCHLUSSARBEIT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."ABSCHLUSSARBEIT_PK" ON "SMARTPMS"."ABSCHLUSSARBEIT" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index DOZENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."DOZENT_PK" ON "SMARTPMS"."DOZENT" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index TERMIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."TERMIN_PK" ON "SMARTPMS"."TERMIN" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index STUDENT_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."STUDENT_UK1" ON "SMARTPMS"."STUDENT" ("MATRIKELNUMMER") 
  ;
--------------------------------------------------------
--  DDL for Index PERSON_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."PERSON_PK" ON "SMARTPMS"."PERSON" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index LEHRANGEBOT_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."LEHRANGEBOT_UK1" ON "SMARTPMS"."LEHRANGEBOT" ("NUMMER") 
  ;
--------------------------------------------------------
--  DDL for Index KLAUSUR_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."KLAUSUR_PK" ON "SMARTPMS"."KLAUSUR" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index LEHRANGEBOT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."LEHRANGEBOT_PK" ON "SMARTPMS"."LEHRANGEBOT" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index ABSCHLUSSARBEIT_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."ABSCHLUSSARBEIT_UK1" ON "SMARTPMS"."ABSCHLUSSARBEIT" ("THEMA") 
  ;
--------------------------------------------------------
--  DDL for Index STUDENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."STUDENT_PK" ON "SMARTPMS"."STUDENT" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index TEILNAHME_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SMARTPMS"."TEILNAHME_PK" ON "SMARTPMS"."TEILNAHME" ("STUDENT", "KLAUSUR") 
  ;
--------------------------------------------------------
--  Ref Constraints for Table ABSCHLUSSARBEIT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."ABSCHLUSSARBEIT" ADD CONSTRAINT "ABSCHLUSSARBEIT_STUDENT_FK1" FOREIGN KEY ("STUDENT")
	  REFERENCES "SMARTPMS"."STUDENT" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table DOZENT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."DOZENT" ADD CONSTRAINT "DOZENT_PERSON_FK1" FOREIGN KEY ("ID")
	  REFERENCES "SMARTPMS"."PERSON" ("ID") ON DELETE CASCADE ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table KLAUSUR
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."KLAUSUR" ADD CONSTRAINT "KLAUSUR_LEHRANGEBOT_FK1" FOREIGN KEY ("LEHRANGEBOT")
	  REFERENCES "SMARTPMS"."LEHRANGEBOT" ("ID") ON DELETE SET NULL ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table LEHRANGEBOT
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."LEHRANGEBOT" ADD CONSTRAINT "LEHRANGEBOT_DOZENT_FK1" FOREIGN KEY ("DOZENT")
	  REFERENCES "SMARTPMS"."DOZENT" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TEILNAHME
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."TEILNAHME" ADD CONSTRAINT "TEILNAHME_KLAUSUR_FK1" FOREIGN KEY ("STUDENT")
	  REFERENCES "SMARTPMS"."KLAUSUR" ("ID") ENABLE;
 
  ALTER TABLE "SMARTPMS"."TEILNAHME" ADD CONSTRAINT "TEILNAHME_STUDENT_FK1" FOREIGN KEY ("STUDENT")
	  REFERENCES "SMARTPMS"."STUDENT" ("MATRIKELNUMMER") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TERMIN
--------------------------------------------------------

  ALTER TABLE "SMARTPMS"."TERMIN" ADD CONSTRAINT "TERMIN_LEHRANGEBOT_FK1" FOREIGN KEY ("LEHRANGEBOT")
	  REFERENCES "SMARTPMS"."LEHRANGEBOT" ("ID") ON DELETE CASCADE ENABLE;
