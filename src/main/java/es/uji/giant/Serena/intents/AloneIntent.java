package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class AloneIntent extends Intent {

    private static final Logger LOG = LoggerFactory.getLogger(AloneIntent.class);

    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;
        String[] chips;

        if (isValidInput(parameter)) {
            saveInfo(questionnaries, parameter, request.getSession());
            audio = getAudioFromSex(questionnaries, request.getSession());
            desc = getDescFromSex(questionnaries, request.getSession());
            chips = null;
            contextName = request.getSession() + "/contexts/loneliness";
        } else {
            audio = Constants.NOT_VALID_ALONE_MP3;
            desc = Constants.NOT_VALID_ALONE_ANSWER;
            chips = Constants.ALONE_CHIPS;
            contextName = request.getSession() + "/contexts/alone";
        }

        return fillResponse(audio, desc, chips, contextName);
    }

    private String getAudioFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) return Constants.ALONE_QUESTION_MP3_URL_MASC;
            if (q.isFemale()) return Constants.ALONE_QUESTION_MP3_URL_FEM;
            else return Constants.ALONE_QUESTION_MP3_URL;
        } else {
            LOG.info("ERROR EN ALONEINTENT getAudio");
            return null;
        }
    }

    private String getDescFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) return Constants.ALONE_QUESTION_MP3_DESC_MASC;
            if (q.isFemale()) return Constants.ALONE_QUESTION_MP3_DESC_FEM;
            else return Constants.ALONE_QUESTION_MP3_DESC;
        } else {
            LOG.info("ERROR EN ALONEINTENT getDesc");
            return null;
        }
    }

    @Override
    public boolean isValidInput(String input) {
        String[] validAnswers = {"si", "no", "sí", "prefiero no contestar"};
        return isValid(input, validAnswers);
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
        if (activeQuestionnaries.containsKey(session)) {
            activeQuestionnaries.get(session).setLiveAlone(parameter.toLowerCase().equals("si") || parameter.toLowerCase().equals("sí"));
        }
    }
}
