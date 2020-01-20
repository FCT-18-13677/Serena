package es.uji.giant.Serena.utils;

public class Constants {
    /* ELASTICSEARCH */
    public static final String ELASTICSEARCH_TEST_INDEX = "serena";
    public static final String ELASTICSEARCH_TEST_TYPE = "questionnarie";

    /* INTENT NAMES */
    public static final String WELCOME_INTENT = "Default Welcome Intent";
    public static final String GENDER_INTENT = "Pregunta Genero";
    public static final String AGE_INTENT = "Pregunta Edad";
    public static final String ALONE_INTENT = "Pregunta Solo";
    public static final String FREE_QUESTION_INTENT = "Pregunta Libre";
    public static final String ALONE_QUESTION_INTENT = "Pregunta Soledad";
    public static final String NOT_ALONE_QUESTION_INTENT = "Pregunta No Soledad";
    public static final String UCLA1_INTENT = "UCLA 1";
    public static final String UCLA2_INTENT = "UCLA 2";
    public static final String UCLA3_INTENT = "UCLA 3";


    /* SUGGESTION CHIPS */
    public static final String[] SEX_CHIPS = {"Femenino", "Masculino", "Otro", "Prefiero no contestar"};
    public static final String[] AGE_CHIPS = {"Prefiero no contestar"};
    public static final String[] ALONE_CHIPS = {"Sí", "No", "Prefiero no contestar"};
    public static final String[] UCLA_CHIPS = {"A menudo", "Algunas veces", "Casi nunca"};


    /* Intent MP3 and Descriptions (shown text) */
    public static final String WELCOME_MP3_URL = "https://www.dropbox.com/s/k33tx1t6kweak70/Normalizado2_introducci%C3%B3n%20buena.ogg?raw=1";
    public static final String WELCOME_MP3_DESC = "Hola, soy Serena. Estoy aprendiendo a detectar la soledad en las personas. " +
            "Me gustaría conversar con usted. ¿Podría indicarme su género? Conteste: Femenino, Masculino, Otro, Prefiero no contestar";

    public static final String AGE_MP3_URL = "https://www.dropbox.com/s/jf87q3imisxlzmm/Normalizado2_edad.ogg?raw=1";
    public static final String AGE_MP3_DESC = "¿Cuál es su edad? Si prefiere no decirla, diga Prefiero no contestar.";

    public static final String ALONE_MP3_URL = "https://www.dropbox.com/s/vf4i0oqiygfc4o3/Normalizado2_convivencia%20neutro.ogg?raw=1";
    public static final String ALONE_MP3_URL_FEM = "https://www.dropbox.com/s/eh4dlqxcpgpy46e/Normalizado2_convivencia%20femenino.ogg?raw=1";
    public static final String ALONE_MP3_URL_MASC = "https://www.dropbox.com/s/xj4zh2t8spiybz1/Normalizado2_convivencia%20masculino.ogg?raw=1";
    public static final String ALONE_MP3_DESC = "En la actualidad, ¿está viviendo solo o sola? Conteste Sí, No, Prefiero no contestar.";
    public static final String ALONE_MP3_DESC_FEM = "En la actualidad, ¿está viviendo sola? Conteste Sí, No, Prefiero no contestar.";
    public static final String ALONE_MP3_DESC_MASC = "En la actualidad, ¿está viviendo solo? Conteste Sí, No, Prefiero no contestar.";

    public static final String ALONE_QUESTION_MP3_URL = "https://www.dropbox.com/s/50a9fsdobre9h4s/Normalizado2_solo-a%20Neutro.ogg?raw=1";
    public static final String ALONE_QUESTION_MP3_URL_FEM = "https://www.dropbox.com/s/i6k9yhe82e9uhuu/Normalizado2_sola%20F.ogg?raw=1";
    public static final String ALONE_QUESTION_MP3_URL_MASC = "https://www.dropbox.com/s/78n9f4w91gw4k6f/Normalizado2_solo%20M.ogg?raw=1";
    public static final String ALONE_QUESTION_MP3_DESC = "Hábleme de cuándo se siente sola o solo.";
    public static final String ALONE_QUESTION_MP3_DESC_FEM = "Hábleme de cuándo se siente sola.";
    public static final String ALONE_QUESTION_MP3_DESC_MASC = "Hábleme de cuándo se siente solo";

    public static final String NOT_ALONE_QUESTION_MP3_URL = "https://www.dropbox.com/s/k8p6kxttwx7uxtu/Normalizado2_no%20solo%20N.ogg?raw=1";
    public static final String NOT_ALONE_QUESTION_MP3_URL_FEM = "https://www.dropbox.com/s/dbzv4wu06w1ik21/Normalizado2_no%20sola%20F.ogg?raw=1";
    public static final String NOT_ALONE_QUESTION_MP3_URL_MASC = "https://www.dropbox.com/s/siqtdf70lkwqafn/Normalizado2_no%20solo%20M.ogg?raw=1";
    public static final String NOT_ALONE_QUESTION_MP3_DESC = "Hábleme de cuándo NO se siente sola o solo.";
    public static final String NOT_ALONE_QUESTION_MP3_DESC_FEM = "Hábleme de cuándo NO se siente sola.";
    public static final String NOT_ALONE_QUESTION_MP3_DESC_MASC = "Hábleme de cuándo NO se siente solo";

    public static final String FREE_QUESTION_MP3_URL = "https://www.dropbox.com/s/dyz7e2vqx3p6omo/Normalizado2_abierta%20modificado.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_DESC = "Por último, me gustaría que me contara cómo le ha ido la semana?";

    public static final String UCLA1_MP3_URL = "https://www.dropbox.com/s/k039rtordqnozc2/Normalizado2_ucla%201.ogg?raw=1";
    public static final String UCLA1_MP3_DESC = "Voy a hacerle tres preguntas, responda pensando en esta última semana. ¿Con qué frecuencia siente que le falta compañía? Conteste Casi nunca, Algunas veces, A menudo.";

    public static final String UCLA2_MP3_URL = "https://www.dropbox.com/s/68fgn1u9tc649oj/Normalizado2_ucla%202%20N.ogg?raw=1";
    public static final String UCLA2_MP3_URL_FEM = "https://www.dropbox.com/s/kem1y4ndg82fuu8/Normalizado2_ucla%202%20F.ogg?raw=1";
    public static final String UCLA2_MP3_URL_MASC = "https://www.dropbox.com/s/mhtcjyu8wdpznuz/Normalizado2_ucla%202%20M.ogg?raw=1";
    public static final String UCLA2_MP3_DESC = "¿Con qué frecuencia se siente excluida o excluido? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA2_MP3_DESC_FEM = "¿Con qué frecuencia se siente excluida? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA2_MP3_DESC_MASC = "¿Con qué frecuencia se siente excluido? Conteste: Casi nunca, Algunas veces o A menudo";

    public static final String UCLA3_MP3_URL = "https://www.dropbox.com/s/dw7g0e9g886i482/Normalizado2_ucla%203%20n.ogg?raw=1";
    public static final String UCLA3_MP3_URL_FEM = "https://www.dropbox.com/s/5b9rlrga507j6jc/Normalizado2_ucla%203%20F.ogg?raw=1";
    public static final String UCLA3_MP3_URL_MASC = "https://www.dropbox.com/s/nznwmbp673s03ue/Normalizado2_ucla%203%20M.ogg?raw=1";
    public static final String UCLA3_MP3_DESC = "¿Con qué frecuencia se siente aislado o aislada de los demás? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA3_MP3_DESC_FEM = "¿Con qué frecuencia se siente aislada de los demás? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA3_MP3_DESC_MASC = "¿Con qué frecuencia se siente aislado de los demás? Conteste: Casi nunca, Algunas veces o A menudo";


    /* Not valid intent MP3 and Descriptions (shown text) */
    public static final String NOT_VALID_SEX_ANSWER = "Debe indicar (Femenino, Masculino, Otro, Prefiero no contestar)";
    public static final String NOT_VALID_SEX_MP3 = "https://www.dropbox.com/s/dtleads1d4sflzd/Normalizado2_error%20genero.ogg?raw=1";

    public static final String NOT_VALID_AGE_ANSWER = "Debe indicar un número entre 16 y 105. Si lo prefiere diga Prefiero no contestar";
    public static final String NOT_VALID_AGE_MP3 = "https://www.dropbox.com/s/32z2txiuz6g43cd/Normalizado2_error%20edad%20buena.ogg?raw=1";

    public static final String NOT_VALID_ALONE_ANSWER = "Tiene que indicar Sí, No, Prefiero no contestar";
    public static final String NOT_VALID_ALONE_MP3 = "https://www.dropbox.com/s/hgeawhn70aq3j68/Normalizado2_error%20convivencia.ogg?raw=1";

    public static final String NOT_VALID_UCLA_ANSWER = "Su respuesta debe ser Casi nunca, Algunas veces, A menudo";
    public static final String NOT_VALID_UCLA_MP3 = "https://www.dropbox.com/s/lwggrfg69mg8bqz/Normalizado2_ucla%20error.ogg?raw=1";

    public static final String END_CONVERSATION_DESC = "Gracias por conversar conmigo. Hasta la próxima.";
    public static final String END_CONVERSATION_MP3 = "https://www.dropbox.com/s/5fja5ibi7logvot/Normalizado2_despedida.ogg?raw=1";
}
