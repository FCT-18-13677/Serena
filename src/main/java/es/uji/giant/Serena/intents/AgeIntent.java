package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.controller.DialogflowController;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class AgeIntent extends Intent {

    private static final Logger LOG = LoggerFactory.getLogger(AgeIntent.class);

    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;
        String[] chips;

        if (isValidInput(parameter)) {
            saveInfo(questionnaries, parameter, request.getSession());
            audio = getAudioFromSex(questionnaries, request.getSession());
            desc = getDescFromSex(questionnaries, request.getSession());
            chips = Constants.ALONE_CHIPS;
            contextName = request.getSession() + "/contexts/alone";
        } else {
            audio = Constants.NOT_VALID_AGE_MP3;
            desc = Constants.NOT_VALID_AGE_ANSWER;
            chips = Constants.AGE_CHIPS;
            contextName = request.getSession() + "/contexts/age";
        }

        return fillResponse(audio, desc, chips, contextName);
    }

    private String getAudioFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) return Constants.ALONE_MP3_URL_MASC;
            if (q.isFemale()) return Constants.ALONE_MP3_URL_FEM;
            else return Constants.ALONE_MP3_URL;
        } else {
            LOG.info("ERROR EN AGEINTENT getAudio");
            return null;
        }
    }

    private String getDescFromSex(Map<String, Questionnarie> questionnaries, String session) {
        if (questionnaries.containsKey(session)) {
            Questionnarie q = questionnaries.get(session);
            if (q.isMale()) return Constants.ALONE_MP3_DESC_MASC;
            if (q.isFemale()) return Constants.ALONE_MP3_DESC_FEM;
            else return Constants.ALONE_MP3_DESC;
        } else {
            LOG.info("ERROR EN AGEINTENT getDesc");
            return null;
        }
    }

    @Override
    public boolean isValidInput(String input) {
        if (input.toLowerCase().equals("prefiero no contestar")) return true;

        if (isNumeric(input)) {
            int age = Integer.valueOf(input);
            return age >= 16 && age <= 105;
        } else {
            return false;
        }
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
        if (activeQuestionnaries.containsKey(session)) {
            // Guarda la edad. Si el usuario no lo ha especificado, la edad será "0".
            if (!parameter.toLowerCase().equals("prefiero no contestar")) {
                activeQuestionnaries.get(session).setAge(Integer.valueOf(parameter));
            }
        }
    }

    private static boolean isNumeric(String input)
    {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
