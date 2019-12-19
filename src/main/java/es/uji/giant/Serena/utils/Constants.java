package es.uji.giant.Serena.utils;

public class Constants {
    /* ELASTICSEARCH */
    public static final String ELASTICSEARCH_TEST_INDEX = "giant_tests";
    public static final String ELASTICSEARCH_TEST_TYPE = "tests";

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
    public static final String WELCOME_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String WELCOME_MP3_DESC = "Hola, soy Serena. Estoy aprendiendo a detectar/evaluar la soledad en las personas. " +
            "Estoy aquí para hablar contigo y escucharte. Me podría indicar su género. Coneste: Femenino, Masculino, Otro, Prefiero no contestar";

    public static final String AGE_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String AGE_MP3_DESC = "¿Cuál es su edad? Si prefiere no decirla, diga Prefiero no contestar.";

    public static final String ALONE_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String ALONE_MP3_URL_FEM = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String ALONE_MP3_URL_MASC = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String ALONE_MP3_DESC = "¿Está viviendo sola o solo actualmente? Conteste Sí, No, Prefiero no contestar.";
    public static final String ALONE_MP3_DESC_FEM = "¿Está viviendo sola actualmente? Conteste Sí, No, Prefiero no contestar.";
    public static final String ALONE_MP3_DESC_MASC = "¿Está viviendo solo actualmente? Conteste Sí, No, Prefiero no contestar.";

    public static final String ALONE_QUESTION_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String ALONE_QUESTION_MP3_URL_FEM = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String ALONE_QUESTION_MP3_URL_MASC = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String ALONE_QUESTION_MP3_DESC = "Hábleme de cuándo se siente solo o sola.";
    public static final String ALONE_QUESTION_MP3_DESC_FEM = "Hábleme de cuándo se siente sola.";
    public static final String ALONE_QUESTION_MP3_DESC_MASC = "Hábleme de cuándo se siente solo";

    public static final String NOT_ALONE_QUESTION_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String NOT_ALONE_QUESTION_MP3_URL_FEM = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String NOT_ALONE_QUESTION_MP3_URL_MASC = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String NOT_ALONE_QUESTION_MP3_DESC = "Hábleme de cuándo NO se siente solo o sola.";
    public static final String NOT_ALONE_QUESTION_MP3_DESC_FEM = "Hábleme de cuándo NO se siente sola.";
    public static final String NOT_ALONE_QUESTION_MP3_DESC_MASC = "Hábleme de cuándo NO se siente solo";

    public static final String FREE_QUESTION_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String FREE_QUESTION_MP3_DESC = "¿Cómo le ha ido la semana?";

    public static final String UCLA1_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA1_MP3_DESC = "Ahora voy a hacerle tres preguntas de un test. ¿Con qué frecuencia siente que le falta compañía? Conteste Casi nunca, Algunas veces, A menudo.";

    public static final String UCLA2_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA2_MP3_URL_FEM = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA2_MP3_URL_MASC = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA2_MP3_DESC = "¿Con qué frecuencia se siente excluida o excluido? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA2_MP3_DESC_FEM = "¿Con qué frecuencia se siente excluida? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA2_MP3_DESC_MASC = "¿Con qué frecuencia se siente excluido? Conteste: Casi nunca, Algunas veces o A menudo";

    public static final String UCLA3_MP3_URL = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA3_MP3_URL_FEM = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA3_MP3_URL_MASC = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
    public static final String UCLA3_MP3_DESC = "¿Con qué frecuencia se siente aislado o aislada de los demás? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA3_MP3_DESC_FEM = "¿Con qué frecuencia se siente aislada de los demás? Conteste: Casi nunca, Algunas veces o A menudo";
    public static final String UCLA3_MP3_DESC_MASC = "¿Con qué frecuencia se siente aislado de los demás? Conteste: Casi nunca, Algunas veces o A menudo";


    /* Not valid intent MP3 and Descriptions (shown text) */
    public static final String NOT_VALID_SEX_ANSWER = "Tiene que indicar un género válido (Femenino, Masculino, Otro, Prefiero no contestar)";
    public static final String NOT_VALID_SEX_MP3 = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";

    public static final String NOT_VALID_AGE_ANSWER = "Tiene que indicar un número válido entre 16 y 105. Si lo prefiere puede indicar Prefiero no contestar";
    public static final String NOT_VALID_AGE_MP3 = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";

    public static final String NOT_VALID_ALONE_ANSWER = "Tiene que indicar Sí, No, Prefiero no contestar";
    public static final String NOT_VALID_ALONE_MP3 = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";

    public static final String NOT_VALID_UCLA_ANSWER = "Su respuesta debe ser Casi nunca, Algunas veces, A menudo";
    public static final String NOT_VALID_UCLA_MP3 = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";

    public static final String END_CONVERSATION_DESC = "Gracias por hablar conmigo. Hasta la próxima.";
    public static final String END_CONVERSATION_MP3 = "https://www.dropbox.com/s/5fc5nyoacgxy2vw/andrea_test_min.mp3?raw=1";
}
