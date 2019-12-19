package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;

import java.util.Map;

public class GenderIntent extends Intent {

    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;
        String[] chips;

        if (isValidInput(parameter)) {
            saveInfo(questionnaries, parameter, request.getSession());
            audio = Constants.AGE_MP3_URL;
            desc = Constants.AGE_MP3_DESC;
            chips = Constants.AGE_CHIPS;
            contextName = request.getSession() + "/contexts/age";
        } else {
            audio = Constants.NOT_VALID_SEX_MP3;
            desc = Constants.NOT_VALID_SEX_ANSWER;
            chips = Constants.SEX_CHIPS;
            contextName = request.getSession() + "/contexts/sex";
        }

        return fillResponse(audio, desc, chips, contextName);
    }

    @Override
    public boolean isValidInput(String input) {
        String[] validAnswers = {"masculino", "femenino", "otro", "otros", "prefiero no contestar"};
        return isValid(input, validAnswers);
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
        if (activeQuestionnaries.containsKey(session)) {
            activeQuestionnaries.get(session).setSex(parameter);
        } else {
            Questionnarie questionnarie = new Questionnarie();
            questionnarie.setId(session);
            questionnarie.setSex(parameter.toLowerCase());
            activeQuestionnaries.put(session, questionnarie);
        }
    }
}
