package es.uji.giant.Serena.utils;

public class Constants {
    /* ELASTICSEARCH */
    public static final String ELASTICSEARCH_TEST_INDEX = "serena_v2";
    public static final String ELASTICSEARCH_TEST_TYPE = "questionnarie_v2";

    /* INTENT NAMES */
    public static final String WELCOME_INTENT = "Default Welcome Intent";
    public static final String GENDER_INTENT = "Pregunta Genero";
    public static final String AGE_INTENT = "Pregunta Edad";
    public static final String ALONE_INTENT = "Pregunta Solo";
    public static final String ALONE_FREQUENCY_INTENT = "Pregunta Frecuencia Soledad";
    public static final String FREE_QUESTION_INTENT = "Pregunta Libre";
    public static final String UCLA1_INTENT = "UCLA 1";
    public static final String UCLA2_INTENT = "UCLA 2";
    public static final String UCLA3_INTENT = "UCLA 3";


    /* SUGGESTION CHIPS */
    public static final String[] SEX_CHIPS = {"Femenino", "Masculino", "Otro", "Prefiero no contestar"};
    public static final String[] AGE_CHIPS = {"Prefiero no contestar"};
    public static final String[] ALONE_CHIPS = {"Sí", "No", "Prefiero no contestar"};
    public static final String[] UCLA_CHIPS = {"A menudo", "Algunas veces", "Casi nunca"};


    /* Intent MP3 and Descriptions (shown text) */
    public static final String WELCOME_MP3_URL = "https://www.dropbox.com/s/siieo470n1l0v9w/presentacion_y_genero.ogg?raw=1";
    public static final String WELCOME_MP3_DESC = "Hola, soy Serena, un asistente conversacional desarrollado en la Universitat Jaume I y subvencionado por la Fundación Española para la Ciencia y la Tecnología.\n" +
            "Aunque la soledad forma parte de nuestras vidas, cada vez son más las personas que sienten soledad no deseada. Por ello, estoy aprendiendo a detectar la soledad y me gustaría que me ayudara contestando las siguientes preguntas.\n" +
            "La información que me facilite sólo se utilizará en el contexto de este proyecto y cuenta con el visto bueno de la Comisión Ética de la Universitat Jaume I.\n" +
            "Muchas gracias por su ayuda.\n" +
            "¿Podría indicarme su género? Conteste: Femenino, Masculino, Otro, Prefiero no contestar";

    public static final String AGE_MP3_URL = "https://www.dropbox.com/s/jf87q3imisxlzmm/Normalizado2_edad.ogg?raw=1";
    public static final String AGE_MP3_DESC = "¿Cuál es su edad? Si prefiere no decirla, diga Prefiero no contestar.";

    public static final String ALONE_MP3_URL = "https://www.dropbox.com/s/vf4i0oqiygfc4o3/Normalizado2_convivencia%20neutro.ogg?raw=1";
    public static final String ALONE_MP3_URL_FEM = "https://www.dropbox.com/s/eh4dlqxcpgpy46e/Normalizado2_convivencia%20femenino.ogg?raw=1";
    public static final String ALONE_MP3_URL_MASC = "https://www.dropbox.com/s/xj4zh2t8spiybz1/Normalizado2_convivencia%20masculino.ogg?raw=1";
    public static final String ALONE_MP3_DESC = "En la actualidad, ¿está viviendo solo o sola? Conteste Sí, No, Prefiero no contestar.";
    public static final String ALONE_MP3_DESC_FEM = "En la actualidad, ¿está viviendo sola? Conteste Sí, No, Prefiero no contestar.";
    public static final String ALONE_MP3_DESC_MASC = "En la actualidad, ¿está viviendo solo? Conteste Sí, No, Prefiero no contestar.";

    public static final String LONELINESS_FREQUENCY_QUESTION_MP3_URL = "https://www.dropbox.com/s/o7x4kdf3waszlmj/frecuencia_soledad_neutro.ogg?raw=1";
    public static final String LONELINESS_FREQUENCY_QUESTION_MP3_URL_FEM = "https://www.dropbox.com/s/7fo7h75itwiwsvd/7.%20Frecuencia%20soledad%20femenino.ogg?raw=1";
    public static final String LONELINESS_FREQUENCY_QUESTION_MP3_URL_MASC = "https://www.dropbox.com/s/gdjxgp6y54jak8a/7.%20Frecuencia%20soledad%20masculino.ogg?raw=1";
    public static final String LONELINESS_FREQUENCY_QUESTION_MP3_DESC = "Piense en la última semana ¿durante cuánto tiempo se ha sentido sola o solo? Conteste Casi nunca, Algunas veces, A menudo.";
    public static final String LONELINESS_FREQUENCY_QUESTION_MP3_DESC_FEM = "Piense en la última semana ¿durante cuánto tiempo se ha sentido sola? Conteste Casi nunca, Algunas veces, A menudo.";
    public static final String LONELINESS_FREQUENCY_QUESTION_MP3_DESC_MASC = "Piense en la última semana ¿durante cuánto tiempo se ha sentido solo? Conteste Casi nunca, Algunas veces, A menudo.";

    public static final String FREE_QUESTION_MP3_OFTEN_URL = "https://www.dropbox.com/s/9nuey3c7ye5uh4j/8.%20Abierta%20a%20menudo%20neutro.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_OFTEN_DESC = "Por favor, ¿podría contarme por qué ha respondido que a menudo se ha sentido sola o solo?";
    public static final String FREE_QUESTION_MP3_OFTEN_URL_FEM = "https://www.dropbox.com/s/emfu0mib5wryeao/8.%20Abierta%20a%20menudo%20femenino.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_OFTEN_DESC_FEM = "Por favor, ¿podría contarme por qué ha respondido que a menudo se ha sentido sola?";
    public static final String FREE_QUESTION_MP3_OFTEN_URL_MASC = "https://www.dropbox.com/s/og5rgfps7flswfz/8.%20Abierta%20a%20menudo%20masculino.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_OFTEN_DESC_MASC = "Por favor, ¿podría contarme por qué ha respondido que a menudo se ha sentido solo?";

    public static final String FREE_QUESTION_MP3_SOMETIMES_URL = "https://www.dropbox.com/s/lac80eb86jk654c/8.%20Abierta%20algunas%20veces%20neutro.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_SOMETIMES_DESC = "Por favor, ¿podría contarme por qué ha respondido que algunas veces se ha sentido sola o solo?";
    public static final String FREE_QUESTION_MP3_SOMETIMES_URL_FEM = "https://www.dropbox.com/s/qaeynr59woef7yr/8.%20Abierta%20algunas%20veces%20femenino.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_SOMETIMES_DESC_FEM = "Por favor, ¿podría contarme por qué ha respondido que algunas veces se ha sentido sola?";
    public static final String FREE_QUESTION_MP3_SOMETIMES_URL_MASC = "https://www.dropbox.com/s/lvo9y4ki54lhofn/8.%20Abierta%20algunas%20veces%20masculino.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_SOMETIMES_DESC_MASC = "Por favor, ¿podría contarme por qué ha respondido que algunas veces se ha sentido solo?";

    public static final String FREE_QUESTION_MP3_NEVER_URL = "https://www.dropbox.com/s/nqd5clgar8977ia/8.%20Abierta%20casi%20nunca%20neutra.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_NEVER_DESC = "Por favor, ¿podría contarme por qué ha respondido que casi nunca se ha sentido sola o solo?";
    public static final String FREE_QUESTION_MP3_NEVER_URL_FEM = "https://www.dropbox.com/s/ki4pggl2i3knews/8.%20Abierta%20casi%20nunca%20femenino.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_NEVER_DESC_FEM = "Por favor, ¿podría contarme por qué ha respondido que casi nunca se ha sentido sola?";
    public static final String FREE_QUESTION_MP3_NEVER_URL_MASC = "https://www.dropbox.com/s/epzfsyg6ahggtmk/8.%20Abierta%20casi%20nunca%20masculino.ogg?raw=1";
    public static final String FREE_QUESTION_MP3_NEVER_DESC_MASC = "Por favor, ¿podría contarme por qué ha respondido que casi nunca se ha sentido solo?";
    // Nuevas Free Questions

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

    public static final String END_CONVERSATION_DESC = "Muchas gracias por colaborar en este proyecto. Siempre que quiera podrá volver a conversar conmigo. Con su ayuda podré aprender a detectar la soledad. ¡Hasta la próxima!";
    public static final String END_CONVERSATION_MP3 = "https://www.dropbox.com/s/dbg5xj3iluw89ii/Despedida%20Serena.ogg?raw=1";
}
