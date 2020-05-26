--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.3

-- Started on 2020-05-26 14:18:12

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 16394)
-- Name: exposicion; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.exposicion (
    id_exposicion integer NOT NULL,
    titulo character varying(50) NOT NULL,
    descripcion character varying(250) NOT NULL,
    fechainauguracion date NOT NULL,
    fechaclausura date NOT NULL,
    salon1 character varying(2) NOT NULL,
    salon2 character varying(2) NOT NULL,
    salon3 character varying(2) NOT NULL
);


ALTER TABLE public.exposicion OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16399)
-- Name: obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.obra (
    id_obra integer NOT NULL,
    titulo character varying(50),
    estilo character varying(50),
    precio real NOT NULL,
    id_propietario integer NOT NULL,
    id_artista integer NOT NULL
);


ALTER TABLE public.obra OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16404)
-- Name: obraexpo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.obraexpo (
    id_obraexpo integer NOT NULL,
    id_obra integer NOT NULL,
    id_exposicion integer NOT NULL,
    exposicion_fechainauguracion date NOT NULL,
    exposicion_salon1 character varying(2) NOT NULL,
    exposicion_salon2 character varying(2) NOT NULL,
    exposicion_salon3 character varying(2) NOT NULL
);


ALTER TABLE public.obraexpo OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16409)
-- Name: persona; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.persona (
    id_persona integer NOT NULL,
    nombre character varying(75) NOT NULL,
    apellido character varying(50) NOT NULL,
    celular integer NOT NULL,
    pais character varying(20) NOT NULL,
    ciudad character varying(20) NOT NULL,
    profesion character varying(50) NOT NULL
);


ALTER TABLE public.persona OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16414)
-- Name: venta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.venta (
    id_venta integer NOT NULL,
    id_obra integer NOT NULL,
    fechaventa date NOT NULL,
    id_cliente integer NOT NULL
);


ALTER TABLE public.venta OWNER TO postgres;

--
-- TOC entry 2842 (class 0 OID 16394)
-- Dependencies: 202
-- Data for Name: exposicion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.exposicion (id_exposicion, titulo, descripcion, fechainauguracion, fechaclausura, salon1, salon2, salon3) FROM stdin;
1	ArteContemporaneo	Arte Mundial	2018-05-02	2018-06-02	no	si	no
2	Nueva Arte	Arte del 2020	2015-05-04	2015-05-29	si	no	no
3	Nueva Arte	Arte del 2020	2015-05-04	2015-05-29	no	no	si
\.


--
-- TOC entry 2843 (class 0 OID 16399)
-- Dependencies: 203
-- Data for Name: obra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.obra (id_obra, titulo, estilo, precio, id_propietario, id_artista) FROM stdin;
1	La Monalisa	Contemporaneo	255.3	1	1
2	La pinta	Renacimiento.	3500.5	3	4
3	La ultima Cena	Expresionismo.	25000	2	3
4	La Luna	Natural	2500	2	1
\.


--
-- TOC entry 2844 (class 0 OID 16404)
-- Dependencies: 204
-- Data for Name: obraexpo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.obraexpo (id_obraexpo, id_obra, id_exposicion, exposicion_fechainauguracion, exposicion_salon1, exposicion_salon2, exposicion_salon3) FROM stdin;
1	1	1	2018-05-02	no	si	no
2	3	2	2015-05-04	si	no	no
3	2	3	2015-05-04	no	no	si
\.


--
-- TOC entry 2845 (class 0 OID 16409)
-- Dependencies: 205
-- Data for Name: persona; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.persona (id_persona, nombre, apellido, celular, pais, ciudad, profesion) FROM stdin;
1	Juan	Cutile	77780142	Bolvia	La Paz	Artista Contemporaneo
2	Alex	Quispe	78978965	Argentina	Buenos Aires	Pintor
3	Carolina	Herrera	62420742	Corea del Sur	Busan	Artesano
4	Belen	Curaca	77245070	Italia	Roma	Escultor
5	Cielo	Castillo	60524633	Japon	Tokio	Escultora
\.


--
-- TOC entry 2846 (class 0 OID 16414)
-- Dependencies: 206
-- Data for Name: venta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.venta (id_venta, id_obra, fechaventa, id_cliente) FROM stdin;
1	1	2020-05-25	2
2	3	2020-05-25	5
3	3	2020-05-19	2
\.


--
-- TOC entry 2702 (class 2606 OID 16398)
-- Name: exposicion exposicion_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.exposicion
    ADD CONSTRAINT exposicion_pk PRIMARY KEY (id_exposicion, fechainauguracion, salon1, salon2, salon3);


--
-- TOC entry 2706 (class 2606 OID 16408)
-- Name: obraexpo id_obraexpo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obraexpo
    ADD CONSTRAINT id_obraexpo PRIMARY KEY (id_obraexpo);


--
-- TOC entry 2704 (class 2606 OID 16403)
-- Name: obra obra_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obra
    ADD CONSTRAINT obra_pk PRIMARY KEY (id_obra);


--
-- TOC entry 2708 (class 2606 OID 16413)
-- Name: persona persona_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pk PRIMARY KEY (id_persona);


--
-- TOC entry 2710 (class 2606 OID 16418)
-- Name: venta venta_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_pk PRIMARY KEY (id_venta);


--
-- TOC entry 2711 (class 2606 OID 16429)
-- Name: obra obra_persona; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obra
    ADD CONSTRAINT obra_persona FOREIGN KEY (id_propietario) REFERENCES public.persona(id_persona);


--
-- TOC entry 2712 (class 2606 OID 16419)
-- Name: obraexpo obraexpo_exposicion; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obraexpo
    ADD CONSTRAINT obraexpo_exposicion FOREIGN KEY (id_exposicion, exposicion_fechainauguracion, exposicion_salon1, exposicion_salon2, exposicion_salon3) REFERENCES public.exposicion(id_exposicion, fechainauguracion, salon1, salon2, salon3);


--
-- TOC entry 2713 (class 2606 OID 16424)
-- Name: obraexpo obraexpo_obra; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.obraexpo
    ADD CONSTRAINT obraexpo_obra FOREIGN KEY (id_obra) REFERENCES public.obra(id_obra);


--
-- TOC entry 2714 (class 2606 OID 16434)
-- Name: venta venta_obra; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_obra FOREIGN KEY (id_obra) REFERENCES public.obra(id_obra);


--
-- TOC entry 2715 (class 2606 OID 16439)
-- Name: venta venta_persona; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_persona FOREIGN KEY (id_cliente) REFERENCES public.persona(id_persona);


-- Completed on 2020-05-26 14:18:13

--
-- PostgreSQL database dump complete
--

