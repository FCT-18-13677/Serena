package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class UCLA1Intent extends Intent {

    private static final Logger LOG = LoggerFactory.getLogger(UCLA1Intent.class);

    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;
        String[] chips = Constants.UCLA_CHIPS;

        if (isValidInput(parameter)) {
            saveInfo(questionnaries, parameter, request.getSession());
            audio = getAudioFromSex(questionnaries, request.getSession());
            desc = getDescFromSex(questionnaries, request.getSession());
            contextName = request.getSession() + "/contexts/ucla2";
        } else {
            audio = Constants.NOT_VALID_UCLA_MP3;
            desc = Constants.NOT_VALID_UCLA_ANSWER;
            contextName = request.getSession() + "/contexts/ucla1";
        }

        return fillResponse(audio, desc, chips, contextName);
    }

    private String getAudioFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) return Constants.UCLA2_MP3_URL_MASC;
            if (q.isFemale()) return Constants.UCLA2_MP3_URL_FEM;
            else return Constants.UCLA2_MP3_URL;
        } else {
            LOG.info("ERROR EN UCLA1INTENT getAudio");
            return null;
        }
    }

    private String getDescFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) return Constants.UCLA2_MP3_DESC_MASC;
            if (q.isFemale()) return Constants.UCLA2_MP3_DESC_FEM;
            else return Constants.UCLA2_MP3_DESC;
        } else {
            LOG.info("ERROR EN UCLA1INTENT getDesc");
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
            activeQuestionnaries.get(session).getAnswers().add(parameter);
        }
    }
}
