/*
Navicat PGSQL Data Transfer

Source Server         : Postgresql
Source Server Version : 90604
Source Host           : localhost:5432
Source Database       : petshop
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90604
File Encoding         : 65001

Date: 2017-11-08 10:51:17
*/


-- ----------------------------
-- Sequence structure for animal_id_animal_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."animal_id_animal_seq";
CREATE SEQUENCE "public"."animal_id_animal_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 37
 CACHE 1;
SELECT setval('"public"."animal_id_animal_seq"', 37, true);

-- ----------------------------
-- Sequence structure for cliente_id_cliente_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."cliente_id_cliente_seq";
CREATE SEQUENCE "public"."cliente_id_cliente_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 12
 CACHE 1;
SELECT setval('"public"."cliente_id_cliente_seq"', 12, true);

-- ----------------------------
-- Sequence structure for servico_id_servico_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."servico_id_servico_seq";
CREATE SEQUENCE "public"."servico_id_servico_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."servico_id_servico_seq"', 1, true);

-- ----------------------------
-- Sequence structure for tiposervico_id_tiposervico_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."tiposervico_id_tiposervico_seq";
CREATE SEQUENCE "public"."tiposervico_id_tiposervico_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."tiposervico_id_tiposervico_seq"', 1, true);

-- ----------------------------
-- Table structure for animal
-- ----------------------------
DROP TABLE IF EXISTS "public"."animal";
CREATE TABLE "public"."animal" (
"id_animal" int4 DEFAULT nextval('animal_id_animal_seq'::regclass) NOT NULL,
"nome_animal" varchar(250) COLLATE "default",
"raca_animal" varchar(250) COLLATE "default",
"especie_animal" varchar(250) COLLATE "default",
"sexo_animal" char(1) COLLATE "default",
"idade_animal" int4,
"iddono_animal" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for cliente
-- ----------------------------
DROP TABLE IF EXISTS "public"."cliente";
CREATE TABLE "public"."cliente" (
"id_cliente" int4 DEFAULT nextval('cliente_id_cliente_seq'::regclass) NOT NULL,
"nome_cliente" varchar(250) COLLATE "default",
"rua_cliente" varchar(250) COLLATE "default",
"bairro_cliente" varchar(250) COLLATE "default",
"cep_cliente" varchar(8) COLLATE "default",
"telefone" varchar(20) COLLATE "default",
"cpf_cliente" varchar(11) COLLATE "default",
"email_cliente" varchar(100) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for servico
-- ----------------------------
DROP TABLE IF EXISTS "public"."servico";
CREATE TABLE "public"."servico" (
"id_servico" int4 DEFAULT nextval('servico_id_servico_seq'::regclass) NOT NULL,
"custo_servico" numeric(10,2),
"preco_servico" numeric(10,2),
"horario_servico" varchar(100) COLLATE "default",
"data_servico" date,
"id_animal" int4,
"nome_servico" varchar(250) COLLATE "default",
"status" int4,
"id_tiposervico" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for tiposervico
-- ----------------------------
DROP TABLE IF EXISTS "public"."tiposervico";
CREATE TABLE "public"."tiposervico" (
"id_tiposervico" int4 DEFAULT nextval('tiposervico_id_tiposervico_seq'::regclass) NOT NULL,
"nome_tiposervico" varchar(250) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "public"."animal_id_animal_seq" OWNED BY "animal"."id_animal";
ALTER SEQUENCE "public"."cliente_id_cliente_seq" OWNED BY "cliente"."id_cliente";
ALTER SEQUENCE "public"."servico_id_servico_seq" OWNED BY "servico"."id_servico";
ALTER SEQUENCE "public"."tiposervico_id_tiposervico_seq" OWNED BY "tiposervico"."id_tiposervico";

-- ----------------------------
-- Primary Key structure for table animal
-- ----------------------------
ALTER TABLE "public"."animal" ADD PRIMARY KEY ("id_animal");

-- ----------------------------
-- Primary Key structure for table cliente
-- ----------------------------
ALTER TABLE "public"."cliente" ADD PRIMARY KEY ("id_cliente");

-- ----------------------------
-- Primary Key structure for table servico
-- ----------------------------
ALTER TABLE "public"."servico" ADD PRIMARY KEY ("id_servico");

-- ----------------------------
-- Primary Key structure for table tiposervico
-- ----------------------------
ALTER TABLE "public"."tiposervico" ADD PRIMARY KEY ("id_tiposervico");

-- ----------------------------
-- Foreign Key structure for table "public"."animal"
-- ----------------------------
ALTER TABLE "public"."animal" ADD FOREIGN KEY ("iddono_animal") REFERENCES "public"."cliente" ("id_cliente") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."servico"
-- ----------------------------
ALTER TABLE "public"."servico" ADD FOREIGN KEY ("id_animal") REFERENCES "public"."animal" ("id_animal") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."servico" ADD FOREIGN KEY ("id_animal") REFERENCES "public"."animal" ("id_animal") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."servico" ADD FOREIGN KEY ("id_tiposervico") REFERENCES "public"."tiposervico" ("id_tiposervico") ON DELETE NO ACTION ON UPDATE NO ACTION;
