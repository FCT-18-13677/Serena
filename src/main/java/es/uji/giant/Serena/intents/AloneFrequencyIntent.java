package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class AloneFrequencyIntent extends Intent {

    private static final Logger LOG = LoggerFactory.getLogger(AloneFrequencyIntent.class);

    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;

        if (isValidInput(parameter)) {
            saveInfo(questionnaries, parameter, request.getSession());
            audio = getAudioFromSex(questionnaries, request.getSession());
            desc = getDescFromSex(questionnaries, request.getSession());
            contextName = request.getSession() + "/contexts/free";
            return fillResponse(audio, desc, null, contextName);
        } else {
            String[] chips = Constants.UCLA_CHIPS;
            audio = Constants.NOT_VALID_UCLA_MP3;
            desc = Constants.NOT_VALID_UCLA_ANSWER;
            contextName = request.getSession() + "/contexts/alone_frequency";
            return fillResponse(audio, desc, chips, contextName);
        }
    }

    private String getAudioFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) {
                switch (q.getLastWeekLoneliness().toLowerCase()) {
                    case "a menudo":
                        return Constants.FREE_QUESTION_MP3_OFTEN_URL_MASC;
                    case "algunas veces":
                        return Constants.FREE_QUESTION_MP3_SOMETIMES_URL_MASC;
                    case "casi nunca":
                        return Constants.FREE_QUESTION_MP3_NEVER_URL_MASC;
                    default:
                        return null;
                }
            } else if (q.isFemale()) {
                switch (q.getLastWeekLoneliness().toLowerCase()) {
                    case "a menudo":
                        return Constants.FREE_QUESTION_MP3_OFTEN_URL_FEM;
                    case "algunas veces":
                        return Constants.FREE_QUESTION_MP3_SOMETIMES_URL_FEM;
                    case "casi nunca":
                        return Constants.FREE_QUESTION_MP3_NEVER_URL_FEM;
                    default:
                        return null;
                }
            } else {
                switch (q.getLastWeekLoneliness().toLowerCase()) {
                    case "a menudo":
                        return Constants.FREE_QUESTION_MP3_OFTEN_URL;
                    case "algunas veces":
                        return Constants.FREE_QUESTION_MP3_SOMETIMES_URL;
                    case "casi nunca":
                        return Constants.FREE_QUESTION_MP3_NEVER_URL;
                    default:
                        return null;
                }
            }
        } else {
            LOG.info("ERROR EN ALONEFREQUENCYINTENT getAudio");
            return null;
        }
    }

    private String getDescFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) {
                switch (q.getLastWeekLoneliness().toLowerCase()) {
                    case "a menudo":
                        return Constants.FREE_QUESTION_MP3_OFTEN_DESC_MASC;
                    case "algunas veces":
                        return Constants.FREE_QUESTION_MP3_SOMETIMES_DESC_MASC;
                    case "casi nunca":
                        return Constants.FREE_QUESTION_MP3_NEVER_DESC_MASC;
                    default:
                        return null;
                }
            } else if (q.isFemale()) {
                switch (q.getLastWeekLoneliness().toLowerCase()) {
                    case "a menudo":
                        return Constants.FREE_QUESTION_MP3_OFTEN_DESC_FEM;
                    case "algunas veces":
                        return Constants.FREE_QUESTION_MP3_SOMETIMES_DESC_FEM;
                    case "casi nunca":
                        return Constants.FREE_QUESTION_MP3_NEVER_DESC_FEM;
                    default:
                        return null;
                }
            } else {
                switch (q.getLastWeekLoneliness().toLowerCase()) {
                    case "a menudo":
                        return Constants.FREE_QUESTION_MP3_OFTEN_DESC;
                    case "algunas veces":
                        return Constants.FREE_QUESTION_MP3_SOMETIMES_DESC;
                    case "casi nunca":
                        return Constants.FREE_QUESTION_MP3_NEVER_DESC;
                    default:
                        return null;
                }
            }
        } else {
            LOG.info("ERROR EN ALONEFREQUENCYINTENT getDesc");
            return null;
        }
    }

    @Override
    public boolean isValidInput(String input) {
        String[] validAnswers = {"casi nunca", "algunas veces", "a menudo"};
        return isValid(input, validAnswers);
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
        if (activeQuestionnaries.containsKey(session)) {
            activeQuestionnaries.get(session).setLastWeekLoneliness(parameter);
        }
    }
}
