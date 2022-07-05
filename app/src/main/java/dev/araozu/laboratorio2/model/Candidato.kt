package dev.araozu.laboratorio2.model
const val loremIpsum =
    "\"Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet \" +\n" +
            "\"obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!\","

data class Candidato(
    var nombre: String,
    var partido: Partido,
    /**
     * Una url a una foto
     */
    var foto: String,
    var biografia: String,
    var distrito: Distrito,
) {
    companion object {
        // Candidatos Alto Selva Alegre
        private val candidatoAsa1 = Candidato(
            "Enrique Salas Carreño",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/bGIvSmeb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )

        private val candidatoAsa2 = Candidato(
            "Mariano Otazu Yana",
            Partido.Frente_Popular_Agricola_del_Peru,
            "https://i.imgur.com/YERtdfNb.jpg",
            "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
            Distrito.ALTO_SELVA_ALEGRE
        )

        private val candidatoAsa3 = Candidato(
            "Anibal Agustin Salas Flores",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/uwo1fqib.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )

        private val candidatoAsa4 = Candidato(
            "David Adolfo Barriga Miranda",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/3qkkpQwb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa5 = Candidato(
            "Domingo Suclle Aragon",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/2Tyv1TZb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa6 = Candidato(
            "Jose Luis Narro Ortiz",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/2aoZYnMb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa7 = Candidato(
            "Rusbel Gutierrez Canaza",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/51MbijKb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa8 = Candidato(
            "Rusbel Gutierrez Canaza",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/51MbijKb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa9 = Candidato(
            "Hector Jesus Del Carpio Cayo",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/ZqQY1avb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa10 = Candidato(
            "Alfredo Willy Benavente Godoy",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/N6jA3tkb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa11 = Candidato(
            "Daniel Ricardo Delgado Quilla",
            Partido.Accion_Popular,
            "https://i.imgur.com/D03KlDkb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa12 = Candidato(
            "Raul Lima Coasaca",
            Partido.Partido_Morado,
            "https://i.imgur.com/9EW9Kheb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa13 = Candidato(
            "Rafael Vicente Villa Moroco",
            Partido.Fe_En_El_Peru,
            "https://i.imgur.com/HAjWOpHb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa14 = Candidato(
            "Jesus Antonio Gamero Marquez",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/3mXapoAb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa15 = Candidato(
            "Juan Molina Patiño",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/kRvtZ8fb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa16 = Candidato(
            "Cristhian Guillen Rivera",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/WcDoK5fb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa17 = Candidato(
            "Silvestre Frisancho Ancasi",
            Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            "https://i.imgur.com/0rzd1Bsb.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )
        private val candidatoAsa18 = Candidato(
            "Pedro Santos Cornejo Mamani",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/RAvPBg3b.jpg",
            loremIpsum,
            Distrito.ALTO_SELVA_ALEGRE
        )


        // Candidatos Cayma
        private val candidatoCay1 = Candidato(
            "Miriam Janet Pacheco de Carpio",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/7dcNb2yb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay2 = Candidato(
            "Oswaldo Alvaro Muñiz Huillca",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/pZI6Z81b.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay3 = Candidato(
            "Moises Jesus Chuctaya Huarca",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/UC0eienb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay4 = Candidato(
            "Juan Carlos Callacondo Velarde",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/WzoTKFbb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay5 = Candidato(
            "Reynaldo Paredes Casapia",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/lv1oIsrb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay6 = Candidato(
            "Jose Renato Carreon Echegaray",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/9cc0FU0b.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay7 = Candidato(
            "Juan carlos Linares Cama",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/nL3YKpZb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay8 = Candidato(
            "Gino Hector Bravo Ardiles",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/Klt1vUib.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay9 = Candidato(
            "Dolores Virginia Rodriguez Acosta",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/pAOrGWMb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay10 = Candidato(
            "Rodolfo Aquepucho Hacha",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/zapcliHb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay11 = Candidato(
            "Rodolfo Isaias QUispe Taco",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/zapcliHb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay12 = Candidato(
            "Wenceslao Salomon Tarifa Sucari",
            Partido.Podemos_Peru,
            "https://i.imgur.com/uErqMxIb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay13 = Candidato(
            "Hector Arturo Pita Catalan",
            Partido.Fuerza_Popular,
            "https://i.imgur.com/Z5fzSNjb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay14 = Candidato(
            "Fortunato Muñuico Muñuico",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/UTANjSub.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay15 = Candidato(
            "Pavel Miguel Ibarra Quispe",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/dNWGCyvb.jpg",
            loremIpsum,
            Distrito.CAYMA
        )
        private val candidatoCay16 = Candidato(
            "Victor Simon Garcia ALvarez",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/zA6tMt9b.jpg",
            loremIpsum,
            Distrito.CAYMA
        )


        //Candidatos Cerro Colorado
        private val candidatoCeColor1 = Candidato(
            "Hugo Efrain Aguilar Gonzales",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/O8wR91Ab.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor2 = Candidato(
            "Hugo Efrain Aguilar Gonzales",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/O8wR91Ab.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor3 = Candidato(
            "Santos ALfaro Rojas",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/5PugSU6b.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor4 = Candidato(
            "Miguel Eliseo Apaza Peña",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/QUrqlrvb.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor5 = Candidato(
            "Manuel Enrique Vera Paredes",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/HAwLDNZb.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor6 = Candidato(
            "Pedro Florencio HUamani ANcasi",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/zVv7HjVb.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor7 = Candidato(
            "Walter Benjamin Diaz Perez",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/Rf6DDDab.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor8 = Candidato(
            "Luis Elias Apaza Huaman",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/5jFsdv8b.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor9 = Candidato(
            "Pascual Puma Ayma",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/GBQ7akgb.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor10 = Candidato(
            "Hermes Nicolas OScco Polar",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/rXdswNib.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor11 = Candidato(
            "Jesus Heraclides Torres Gonzales",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/cs2W2l5b.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor12 = Candidato(
            "Wilfredo Quispe Gutierrez",
            Partido.Fe_En_El_Peru,
            "https://i.imgur.com/UFG3lGPb.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )
        private val candidatoCeColor13 = Candidato(
            "Nila Yesmit Apaza Mamani",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/wNIU5iUb.jpg",
            loremIpsum,
            Distrito.CERRO_COLORADO
        )


        // Candidatos Characato
        private val candidatochr1 = Candidato(
            "Maribel Efigenia Linares Luque",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/FQxlqArb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr2 = Candidato(
            "Teresa Moscoso Oscco",
            Partido.Frente_Popular_Agricola_del_Peru,
            "https://i.imgur.com/0kURfjKb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr3 = Candidato(
            "Alexander Hector Quise Vilca",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/CZrTTvbb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )

        private val candidatochr4 = Candidato(
            "Angel Anastacio Linares Portilla",
            Partido.Arequipa_Renace,
            "https://i.imgur.com/E5H4x5ab.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr5 = Candidato(
            "Carlos Alberto Portilla Tejada",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/7Wh7okdb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr6 = Candidato(
            "Jorge Rony Portilla Portilla",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/ymoi3DCb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr7 = Candidato(
            "Percy Juan Herrera Morales",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/OKikZiWb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr8 = Candidato(
            "Donilly Willy Alvarez Arce",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/8DjUSa3b.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr9 = Candidato(
            "Jesus Godofredo Aguillar Guillen",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/9RUR69fb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr10 = Candidato(
            "Luciano Mamani Maquera",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/plmw2upb.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )
        private val candidatochr11 = Candidato(
            "Lucero Violeta Linares Cornejo",
            Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            "https://i.imgur.com/BjRFeN4b.jpg",
            loremIpsum,
            Distrito.CHARACATO
        )

        //Candidatos
        private val candidatochi1 = Candidato(
            "Piter Vilca Gallegos",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/EgYt3RHb.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )
        private val candidatochi2 = Candidato(
            "Gladys Ticona Flores",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/LofIZyYb.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )
        private val candidatochi3 = Candidato(
            "Yris Paola Calisaya Vilca",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/wsqEHB5b.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )
        private val candidatochi4 = Candidato(
            "Gregorio Angel Corrales Delgado",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/2ZakvTZb.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )
        private val candidatochi5 = Candidato(
            "Emiliano Vilca Cruz",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/3N4WyY5b.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )
        private val candidatochi6 = Candidato(
            "Remigio Bernardo Cahua Sahuanay",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/JLlEKxob.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )
        private val candidatochi7 = Candidato(
            "Moises Urbano Vizcarra Andamayo",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/UC0eienb.jpg",
            loremIpsum,
            Distrito.CHIGUATA
        )

        //Candidatos Jacobo Hunter
        private val cJACOBO_HUNTER0 = Candidato(
            "AURELIA LUPE PILA BARREDA",
            Partido.Arequipa_Renace,
            "https://i.imgur.com/M8i6Ht7.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER1 = Candidato(
            "CECILIA IMELDA FUENTES GUERRA",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/FNiV7Ks.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER2 = Candidato(
            "CHRISTIAN ALEXANDER ARCE MACHACA",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/4KhPbma.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER3 = Candidato(
            "DAVID APAZA ENRIQUEZ",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/0WjaBgm.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER4 = Candidato(
            "ELSA ELENA ACOSTA VARGAS",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/kUIfR2R.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER5 = Candidato(
            "ENRIQUE MENESES QUISPE",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/ustSe1Z.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER6 = Candidato(
            "HERNAN ALEJANDRO TORRES MEDINA",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/06IWruP.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER7 = Candidato(
            "JIMMY EDGARDO VARGAS ESPINOZA",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/fzlQScC.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER8 = Candidato(
            "JOSE LUIS CARDENAS DELGADO",
            Partido.Partido_Morado,
            "https://i.imgur.com/fbe3Gbj.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER9 = Candidato(
            "JUAN YNTI LLERENA MEZA",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/SP4Phvj.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER10 = Candidato(
            "JULIO CESAR ARO MADARIAGA",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/fHLsxv1.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER11 = Candidato(
            "LEONARDO JESUS ALVAREZ TICONA",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/7I10bj8.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER12 = Candidato(
            "MAGNO LOAYZA AQUINO",
            Partido.Fe_En_El_Peru,
            "https://i.imgur.com/d9zCvW4.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER13 = Candidato(
            "MANUEL ARMANDO CHAVEZ SANCHEZ",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/WxPjxdJ.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER14 = Candidato(
            "NEY HAMILTON OJEDA CONDE",
            Partido.Renovacion_Popular,
            "https://i.imgur.com/4OW0rss.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER15 = Candidato(
            "ROGER ANDIA ROMERO",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/mfEdULS.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER16 = Candidato(
            "SERGIO ALFREDO BARRIGA RODRIGUEZ",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/FCuwX9E.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )
        private val cJACOBO_HUNTER17 = Candidato(
            "TONY HILARIO GONZALES",
            Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            "https://i.imgur.com/tN5h4ua.jpg",
            loremIpsum,
            Distrito.JACOBO_HUNTER
        )


        //Candidatos Jose luis Bustamante y Rivero
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO0 = Candidato(
            "ALEXIS MICHAEL IBARCENA ALVIS",
            Partido.Renovacion_Popular,
            "https://i.imgur.com/g3gHdan.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO1 = Candidato(
            "ALFREDO HERBERT RAMIREZ MARRON",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/YEWvAeh.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO2 = Candidato(
            "ALVARO CESAR ANAHUA CCAMA",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/DvxsGoD.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO3 = Candidato(
            "CARLO RAMIRO ALIAGA NUÑEZ",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/F2m2gQ1.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO4 = Candidato(
            "CESAR MARIO FLORES YTUSACA",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/NGErAwN.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO5 = Candidato(
            "DAVID ZAPATA LOVATÓN",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/JDLqxCn.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO6 = Candidato(
            "EDISSON STEVE RODRIGUEZ VALENCIA",
            Partido.Arequipa_Renace,
            "https://i.imgur.com/3QxOQHs.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO7 = Candidato(
            "ELIZABETH FELICITAS ROSELLO QUINTEROS",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/BH6154i.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO8 = Candidato(
            "FREDY JAVIER ZEGARRA BLACK",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/rJ0gNHF.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO9 = Candidato(
            "GONZALO BRICEÑO LIRA",
            Partido.Partido_Morado,
            "https://i.imgur.com/YSY0mz0.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO10 = Candidato(
            "GUILLERMO PABLO REINOSO BARLETTI",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/ry7WkTX.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO11 = Candidato(
            "JIMMY RENZO OJEDA ARNICA",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/9fgDOEX.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO12 = Candidato(
            "JORGE ANTONIO ZAPANA VELASCO",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/Q4tDHq5.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO13 = Candidato(
            "JORGE LUIS PINTO APAZA",
            Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            "https://i.imgur.com/7QLOla1.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO14 = Candidato(
            "JULIO ERNESTO FEDERICO ZEGARRA POLAR",
            Partido.Accion_Popular,
            "https://i.imgur.com/8tqGO8i.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO15 = Candidato(
            "LORENZO ANSGARIO COLQUE GONZA",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/j3gp5WD.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO16 = Candidato(
            "MANUEL JESUS GUTIERREZ FLORES",
            Partido.Accion_Popular,
            "https://i.imgur.com/QlQY7kI.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO17 = Candidato(
            "RAUL MIGUEL ROBLES BORDA",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/G5JzQSs.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO18 = Candidato(
            "RONALD PABLO IBAÑEZ BARREDA",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/T7fTNel.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )
        private val cJOSE_LUIS_BUSTAMANTE_Y_RIVERO19 = Candidato(
            "SHIRLEY ELBA ALCOCER PAUCA",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/gs1teQ7.jpg",
            loremIpsum,
            Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
        )


        //Candidatos Mariano Melgar
        private val cMARIANO_MELGAR0 = Candidato(
            "ANGEL GERARDO ESQUIVEL QUISPE",
            Partido.Accion_Popular,
            "https://i.imgur.com/NSVPBU3.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR1 = Candidato(
            "CARLOS ALBERTO CHAIÑA LIPA",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/C93hCJF.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR2 = Candidato(
            "CARLOS ALEJANDRO ANDRADE PAREJA",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/e5noVCp.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR3 = Candidato(
            "DINA KATHERINE REYNOSO CHACON",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/btKxntm.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR4 = Candidato(
            "EDSON CESAR FLORES VALENCIA",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/zhNFGMC.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR5 = Candidato(
            "EFRAIN HERNAN ENRIQUEZ PEREZ",
            Partido.Partido_Morado,
            "https://i.imgur.com/0yXu7am.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR6 = Candidato(
            "GOURVICH ROMULO PARI ONOFRIO",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/u7NUZmS.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR7 = Candidato(
            "JAIRD JOHN ORTIZ MEDINA",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/qIOOjpA.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR8 = Candidato(
            "JESUS JEHNER FLORES SANA",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/8BPAun4.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR9 = Candidato(
            "JOSE MAQUERA TORRES",
            Partido.Frente_Popular_Agricola_del_Peru,
            "https://i.imgur.com/SeB1Q0v.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR10 = Candidato(
            "LUIS ALBERTO MENDOZA PERALTA",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/aYzInPa.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR11 = Candidato(
            "OSCAR ALFREDO AYALA ARENAS",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/liBkPf3.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR12 = Candidato(
            "ROBERTO CARLO MOLINA DIAZ",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/s5997hp.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )
        private val cMARIANO_MELGAR13 = Candidato(
            "SERGIO GONZALES APAZA",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/FgmccpN.jpg",
            loremIpsum,
            Distrito.MARIANO_MELGAR
        )


        //Candidatos Miraflores
        private val cMIRAFLORES0 = Candidato(
            "ABISAIT BRAHIM PACHAO LOVON",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/rw57HMb.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES1 = Candidato(
            "DANTE APAZA VIVEROS",
            Partido.Arequipa_Renace,
            "https://i.imgur.com/YjaXNu9.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES2 = Candidato(
            "DONATO GUADALINO FLORES PUMACAJIA",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/C8Heu7F.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES3 = Candidato(
            "ERIKA CANDY RAMOS CRUZ",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/uJtu9P1.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES4 = Candidato(
            "FILAMIR CONTRERAS SILVA",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/OJ3rbTE.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES5 = Candidato(
            "GERMAN TORRES CHAMBI",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/UIiTrbS.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES6 = Candidato(
            "GIOVANNA ESTEFANIA CORDOVA ALVIZ",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/9GlXk7k.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES7 = Candidato(
            "HUBERT JESUS ALVAREZ MAMANI",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/2d2MSMw.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES8 = Candidato(
            "JIM ROBERT CAMA HUARICALLO",
            Partido.Accion_Popular,
            "https://i.imgur.com/LTVwMc1.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES9 = Candidato(
            "JORGE AMERICO GALARZA ALVAREZ",
            Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            "https://i.imgur.com/zOhQr52.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES10 = Candidato(
            "JOSE ROBERTO ROQUE QUISPE",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/bHcAZed.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES11 = Candidato(
            "LUIS ANGEL SANCHEZ ÑAUPA",
            Partido.Podemos_Peru,
            "https://i.imgur.com/JC8vhqK.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES12 = Candidato(
            "LUIS CARMELO VACA TAYA",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/HZORAfC.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES13 = Candidato(
            "MARCO ANTONIO CENTTY LOPEZ",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/zs3zMx7.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES14 = Candidato(
            "MERCEDES AURORA LLAJARUNA MORETO",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/j6x90yQ.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES15 = Candidato(
            "PEDRO RAMIRO ESCOBEDO AZA",
            Partido.Renovacion_Popular,
            "https://i.imgur.com/lTUioyj.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )
        private val cMIRAFLORES16 = Candidato(
            "PERCY ALEX BELLIDO REYES",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/Jt3rBFc.jpg",
            loremIpsum,
            Distrito.MIRAFLORES
        )


        //Candidatos Paucarpata
        private val cPAUCARPATA0 = Candidato(
            "ALVARO FLORENCIO ROJAS CHAVEZ",
            Partido.Fe_En_El_Peru,
            "https://i.imgur.com/m3XfCxU.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA1 = Candidato(
            "ALVARO MAURICIO MOSCOSO MERCADO",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/Zq58s89.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA2 = Candidato(
            "ALVARO RICHARD CARI CHOQUECOTA",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/KYXqWUx.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA3 = Candidato(
            "ANGEL DAVID CONDORI ",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/ZH1cZWd.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA4 = Candidato(
            "ANTONIO ZAVALA VEGA",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/7mcxv5K.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA5 = Candidato(
            "CRISTIAN ERNESTO TEJADA RIVAS",
            Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            "https://i.imgur.com/3Q4m0r2.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA6 = Candidato(
            "EDWIN WILLY VILCA MAMANI",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/oVnXTZD.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA7 = Candidato(
            "ELISEO BUSTINCIO ARI",
            Partido.Podemos_Peru,
            "https://i.imgur.com/IbgP2Nq.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA8 = Candidato(
            "ESTEBAN LLACCHUA SEGOVIA",
            Partido.Frente_Popular_Agricola_del_Peru,
            "https://i.imgur.com/cYmNYY3.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA9 = Candidato(
            "FLOR DEL ROSARIO EDUARDO CUADROS",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/Yg4SX44.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA10 = Candidato(
            "FRANK PETER SALCEDO VENERO",
            Partido.Partido_Morado,
            "https://i.imgur.com/mphASI1.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA11 = Candidato(
            "FRANKLIN MAXON VALDIVIA CHAVEZ",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/RVBVsDT.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA12 = Candidato(
            "FREDY ALDO MAMANI CONDORI",
            Partido.Renovacion_Popular,
            "https://i.imgur.com/IHi3yuH.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA13 = Candidato(
            "GEHOVA MICHELE MEDINA ARENAS",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/EdfuATj.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA14 = Candidato(
            "GUIDO RICARDO RAMOS PAREDES",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/wkXfvde.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA15 = Candidato(
            "GUSTAVO PUMA CACERES",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/GLjgM0C.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA16 = Candidato(
            "JOSE FELIPE MANRIQUE SALAS",
            Partido.Accion_Popular,
            "https://i.imgur.com/NgvIkQq.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA17 = Candidato(
            "JUAN DAVID CHAVEZ FARFAN",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/Xp6RMcH.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA18 = Candidato(
            "MARCO ANTONIO ANCO HUARACHI",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/ng0w5r2.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )
        private val cPAUCARPATA19 = Candidato(
            "RAUL GREGORIO CHARA CHAMBI",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/EyZBZmn.jpg",
            loremIpsum,
            Distrito.PAUCARPATA
        )


        //candidatos de Sabandia
        private val candidatosab1 = Candidato(
            "Herless Ronald Diaz Perea",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/F7NKGSNb.jpg",
            loremIpsum,
            Distrito.SABANDIA
        )
        private val candidatosab2 = Candidato(
            "Santos Albertano Salinas Valencia",
            Partido.Arequipa_Renace,
            "https://i.imgur.com/932PmvQb.jpg",
            loremIpsum,
            Distrito.SABANDIA
        )
        private val candidatosab3 = Candidato(
            "Victor Raul Pauca Calcina",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/2uXSnR0b.jpg",
            loremIpsum,
            Distrito.SABANDIA
        )
        private val candidatosab4 = Candidato(
            "Leslie Noelia Stephany Castillo Rodriguez",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/Kqh2AFMb.jpg",
            loremIpsum,
            Distrito.SABANDIA
        )
        private val candidatosab5 = Candidato(
            "Johel Agapito Calderon Taco",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/j37jjPjb.jpg",
            loremIpsum,
            Distrito.SABANDIA
        )

        // Candidatos Sachaca
        private val cSACHACA0 = Candidato(
            "ALDO ALEJANDRO HERNANI CRESPO",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/f6RVNge.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA1 = Candidato(
            "ALEXANDER BERENI ESPINOZA VALENCIA",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/ceJWhdw.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA2 = Candidato(
            "EVARISTO FLORENTINO CALDERON NUÑEZ",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/EwUqysf.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA3 = Candidato(
            "FERNANDO ISAEL ZAPANA HUARANCA",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/bCkEfJ7.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA4 = Candidato(
            "GONZALO ANDRE MEDINA ORBEGOSO",
            Partido.Partido_Frente_De_La_Esperanza_2021,
            "https://i.imgur.com/AiiWYyn.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA5 = Candidato(
            "IVAN FORTUNATO FERNANDEZ FEBRES",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/C9vTllN.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA6 = Candidato(
            "LISSETT ROMINA DIAZ VALDEZ",
            Partido.Renovacion_Popular,
            "https://i.imgur.com/GGNk9UM.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA7 = Candidato(
            "MARCO ANTONIO MALAGA ZENTENO",
            Partido.Juntos_Por_El_Peru,
            "https://i.imgur.com/zzIckR2.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA8 = Candidato(
            "MARILIA NORMA YUCRA MAMANI",
            Partido.Avanza_Pais_Partido_De_Integracion_Social,
            "https://i.imgur.com/cf0tcN3.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA9 = Candidato(
            "MICHAEL GERALD ROSAS AVENDAÑO",
            Partido.Alianza_Para_El_Progreso,
            "https://i.imgur.com/22uygBu.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA10 = Candidato(
            "MIGUEL ANGEL CUADROS PAREDES",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/n2MgVl7.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA11 = Candidato(
            "MIGUEL ILDEFONSO NINA MELGAR",
            Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
            "https://i.imgur.com/2IY3neD.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA12 = Candidato(
            "RENZO ALONSO SALAS HERRERA",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/OaYKi4e.jpg",
            loremIpsum,
            Distrito.SACHACA
        )
        private val cSACHACA13 = Candidato(
            "RUSVEL PEPE SUCARI PRADO",
            Partido.Partido_Politico_Nacional_Peru_Libre,
            "https://i.imgur.com/Orf1D4J.jpg",
            loremIpsum,
            Distrito.SACHACA
        )


        //Candidatos Socabaya
        private val candidatosoc1 = Candidato(
            "Zacarias Pfoccori Pumacallahue",
            Partido.Frente_Popular_Agricola_del_Peru,
            "https://i.imgur.com/A1MMPhqb.jpg",
            loremIpsum,
            Distrito.SOCABAYA
        )
        private val candidatosoc2 = Candidato(
            "Juan Carlos Ortiz Villalta",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/8uDsM6bb.jpg",
            loremIpsum,
            Distrito.SOCABAYA
        )
        private val candidatosoc3 = Candidato(
            "Glissolym Soledad Monataño Condori",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/oCkDEPcb.jpg",
            loremIpsum,
            Distrito.SOCABAYA
        )
        private val candidatosoc4 = Candidato(
            "Romulo Freddy Teran Trigoso Soto",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/9ErYg1Lb.jpg",
            loremIpsum,
            Distrito.SOCABAYA
        )
        private val candidatosoc5 = Candidato(
            "Pedro Jesus Fuentes Lopez",
            Partido.Fe_En_El_Peru,
            "https://i.imgur.com/LcglbRFb.jpg",
            loremIpsum,
            Distrito.SOCABAYA
        )

        //Candidatos Tiabaya
        private val candidatotia1 = Candidato(
            "Julio Renato Marca Mamani",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/Y5hkZgKb.jpg",
            loremIpsum,
            Distrito.TIABAYA
        )
        private val candidatotia2 = Candidato(
            "Nelson Godofredo Delgado Dueños",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/fQgg8f0b.jpg",
            loremIpsum,
            Distrito.TIABAYA
        )
        private val candidatotia3 = Candidato(
            "Eduardo Mejia Vargas",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/qahOKSZb.jpg",
            loremIpsum,
            Distrito.TIABAYA
        )
        private val candidatotia4 = Candidato(
            "Lizeth Maribel Mamani Corrales",
            Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
            "https://i.imgur.com/vXnJuOAb.jpg",
            loremIpsum,
            Distrito.TIABAYA
        )
        private val candidatotia5 = Candidato(
            "Rissy Paola Calderon Zeballos",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/vC7dscHb.jpg",
            loremIpsum,
            Distrito.TIABAYA
        )

        //Candidatos Uchumayo
        private val candidatouchu1 = Candidato(
            "Alberto Guillermo Zevallos Torres",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/Q8odWnjb.jpg",
            loremIpsum,
            Distrito.UCHUMAYO
        )
        private val candidatouchu2 = Candidato(
            "Jorge Luis Alvarez Briceño",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/UzLYcn2b.jpg",
            loremIpsum,
            Distrito.UCHUMAYO
        )
        private val candidatouchu3 = Candidato(
            "Jorge Alfredo Tapia Neira",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/TlLY1aFb.jpg",
            loremIpsum,
            Distrito.UCHUMAYO
        )
        private val candidatouchu4 = Candidato(
            "Gualberto Chilo Monroy",
            Partido.Renovacion_Popular,
            "https://i.imgur.com/2QyM6Pab.jpg",
            loremIpsum,
            Distrito.UCHUMAYO
        )
        private val candidatouchu5 = Candidato(
            "Hardin Jose Abril Velarde",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/aXLf8Wab.jpg",
            loremIpsum,
            Distrito.UCHUMAYO
        )

        //Candidatos Ynahuara
        private val candidatoyana1 = Candidato(
            "Ernesto Jesus Montoya Mogrovejo",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/zi5ALEtb.jpg",
            loremIpsum,
            Distrito.YANAHUARA
        )
        private val candidatoyana2 = Candidato(
            "Sergio Javier Bolliger Marroquin",
            Partido.Arequipa_transformacion,
            "https://i.imgur.com/e0a23MRb.jpg",
            loremIpsum,
            Distrito.YANAHUARA
        )
        private val candidatoyana3 = Candidato(
            "Jose Augusto Arce Paredes",
            Partido.Partido_Democratico_Somos_Peru,
            "https://i.imgur.com/Sf4p5QIb.jpg",
            loremIpsum,
            Distrito.YANAHUARA
        )
        private val candidatoyana4 = Candidato(
            "Aldo Alonso Franco Salinas",
            Partido.Movimiento_Regional_Reveladora,
            "https://i.imgur.com/BhJBVWXb.jpg",
            loremIpsum,
            Distrito.YANAHUARA
        )
        private val candidatoyana5 = Candidato(
            "Pilar Teresa Vera Madariaga",
            Partido.Accion_Popular,
            "https://i.imgur.com/5Ti8EGMb.jpg",
            loremIpsum,
            Distrito.YANAHUARA
        )

        //Candidatos Yura
        private val candidatoyur1 = Candidato(
            "Mirtha Mavel Ruelas Casillas",
            Partido.Arequipa_Tradicion_Futuro,
            "https://i.imgur.com/aLqQnp4b.jpg",
            loremIpsum,
            Distrito.YURA
        )
        private val candidatoyur2 = Candidato(
            "Maria Magdalena Llasaca Ala",
            Partido.Fuerza_Arequipenya,
            "https://i.imgur.com/TpQIoFSb.jpg",
            loremIpsum,
            Distrito.YURA
        )
        private val candidatoyur3 = Candidato(
            "Julio Jose Fuentes Barriga",
            Partido.Arequipa_Renace,
            "https://i.imgur.com/7R98Ezzb.jpg",
            loremIpsum,
            Distrito.YURA
        )
        private val candidatoyur4 = Candidato(
            "Ruben Manuel Pari Cañaza",
            Partido.Yo_Arequipa,
            "https://i.imgur.com/0Y5jNHPb.jpg",
            loremIpsum,
            Distrito.YURA
        )
        private val candidatoyur5 = Candidato(
            "Luis Javier Fuentes Salas",
            Partido.Movimineto_Regional_Arequipa_Avancemos,
            "https://i.imgur.com/9ebzc8Nb.jpg",
            loremIpsum,
            Distrito.YURA
        )

        var candidatos = arrayListOf(
            candidatoAsa1,
            candidatoAsa2,
            candidatoAsa3,
            candidatoAsa4,
            candidatoAsa5,
            candidatoAsa6,
            candidatoAsa7,
            candidatoAsa8,
            candidatoAsa9,
            candidatoAsa10,
            candidatoAsa11,
            candidatoAsa12,
            candidatoAsa13,
            candidatoAsa14,
            candidatoAsa15,
            candidatoAsa16,
            candidatoAsa17,
            candidatoAsa18,
            //Candidatos Cayma
            candidatoCay1,
            candidatoCay2,
            candidatoCay3,
            candidatoCay4,
            candidatoCay5,
            candidatoCay6,
            candidatoCay7,
            candidatoCay8,
            candidatoCay9,
            candidatoCay10,
            candidatoCay11,
            candidatoCay12,
            candidatoCay13,
            candidatoCay14,
            candidatoCay15,
            candidatoCay16,
            //Candidatos Cerro Colorado
            candidatoCeColor1,
            candidatoCeColor2,
            candidatoCeColor3,
            candidatoCeColor4,
            candidatoCeColor5,
            candidatoCeColor6,
            candidatoCeColor7,
            candidatoCeColor8,
            candidatoCeColor9,
            candidatoCeColor10,
            candidatoCeColor11,
            candidatoCeColor12,
            candidatoCeColor13,
            //Candidatos Characato
            candidatochr1,
            candidatochr2,
            candidatochr3,
            candidatochr4,
            candidatochr5,
            candidatochr6,
            candidatochr7,
            candidatochr8,
            candidatochr9,
            candidatochr10,
            candidatochr11,
            //candidatos chiguata
            candidatochi1,
            candidatochi2,
            candidatochi3,
            candidatochi4,
            candidatochi5,
            candidatochi6,
            candidatochi7,
            //Candidatos Jacobo HUnter
            cJACOBO_HUNTER0,
            cJACOBO_HUNTER1,
            cJACOBO_HUNTER2,
            cJACOBO_HUNTER3,
            cJACOBO_HUNTER4,
            cJACOBO_HUNTER5,
            cJACOBO_HUNTER6,
            cJACOBO_HUNTER7,
            cJACOBO_HUNTER8,
            cJACOBO_HUNTER9,
            cJACOBO_HUNTER10,
            cJACOBO_HUNTER11,
            cJACOBO_HUNTER12,
            cJACOBO_HUNTER13,
            cJACOBO_HUNTER14,
            cJACOBO_HUNTER15,
            cJACOBO_HUNTER16,
            cJACOBO_HUNTER17,

            //Candidatos Jose Luis Bustamente y Rivero
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO0,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO1,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO2,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO3,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO4,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO5,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO6,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO7,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO8,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO9,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO10,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO11,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO12,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO13,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO14,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO15,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO16,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO17,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO18,
            cJOSE_LUIS_BUSTAMANTE_Y_RIVERO19,

            //Candiadtos Mariano Melgar
            cMARIANO_MELGAR0,
            cMARIANO_MELGAR1,
            cMARIANO_MELGAR2,
            cMARIANO_MELGAR3,
            cMARIANO_MELGAR4,
            cMARIANO_MELGAR5,
            cMARIANO_MELGAR6,
            cMARIANO_MELGAR7,
            cMARIANO_MELGAR8,
            cMARIANO_MELGAR9,
            cMARIANO_MELGAR10,
            cMARIANO_MELGAR11,
            cMARIANO_MELGAR12,
            cMARIANO_MELGAR13,

            //Candidatos Miraflores
            cMIRAFLORES0,
            cMIRAFLORES1,
            cMIRAFLORES2,
            cMIRAFLORES3,
            cMIRAFLORES4,
            cMIRAFLORES5,
            cMIRAFLORES6,
            cMIRAFLORES7,
            cMIRAFLORES8,
            cMIRAFLORES9,
            cMIRAFLORES10,
            cMIRAFLORES11,
            cMIRAFLORES12,
            cMIRAFLORES13,
            cMIRAFLORES14,
            cMIRAFLORES15,
            cMIRAFLORES16,

            //Candidatos Paucarpata
            cPAUCARPATA0,
            cPAUCARPATA1,
            cPAUCARPATA2,
            cPAUCARPATA3,
            cPAUCARPATA4,
            cPAUCARPATA5,
            cPAUCARPATA6,
            cPAUCARPATA7,
            cPAUCARPATA8,
            cPAUCARPATA9,
            cPAUCARPATA10,
            cPAUCARPATA11,
            cPAUCARPATA12,
            cPAUCARPATA13,
            cPAUCARPATA14,
            cPAUCARPATA15,
            cPAUCARPATA16,
            cPAUCARPATA17,
            cPAUCARPATA18,
            cPAUCARPATA19,


            //Candidatos Sabandia
            candidatosab1,
            candidatosab2,
            candidatosab3,
            candidatosab4,
            candidatosab5,

            //Candidatos Sachaca
            cSACHACA0,
            cSACHACA1,
            cSACHACA2,
            cSACHACA3,
            cSACHACA4,
            cSACHACA5,
            cSACHACA6,
            cSACHACA7,
            cSACHACA8,
            cSACHACA9,
            cSACHACA10,
            cSACHACA11,
            cSACHACA12,
            cSACHACA13,

            //Candidatos Socabaya
            candidatosoc1,
            candidatosoc2,
            candidatosoc3,
            candidatosoc4,
            candidatosoc5,

            //Candidatos Tiabaya
            candidatotia1,
            candidatotia2,
            candidatotia3,
            candidatotia4,
            candidatotia5,

            //Candidatos Uchumayo
            candidatouchu1,
            candidatouchu2,
            candidatouchu3,
            candidatouchu4,
            candidatouchu5,
            //Candidatos Ynahuara
            candidatoyana1,
            candidatoyana2,
            candidatoyana3,
            candidatoyana4,
            candidatoyana5,
            //Candidatos Yura
            candidatoyur1,
            candidatoyur2,
            candidatoyur3,
            candidatoyur3,
            candidatoyur5,
        )
    }
    fun getCandidatosPorDistrito(candidatos:List<Candidato>,distrito: Distrito): List<Candidato> {
        return candidatos.filter { it.distrito == distrito }
    }

    fun getCandidatosPorPartido(candidatos:List<Candidato>,partido: Partido): List<Candidato> {
        return candidatos.filter { it.partido == partido }
    }
}
