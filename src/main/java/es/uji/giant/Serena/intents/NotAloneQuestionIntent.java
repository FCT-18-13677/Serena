package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class NotAloneQuestionIntent extends Intent {

    private static final Logger LOG = LoggerFactory.getLogger(AloneQuestionIntent.class);

    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;
        saveInfo(questionnaries, parameter, request.getSession());

        audio = Constants.FREE_QUESTION_MP3_URL;
        desc = Constants.FREE_QUESTION_MP3_DESC;
        contextName = request.getSession() + "/contexts/free";

        return fillResponse(audio, desc, null, contextName);
    }

    @Override
    public boolean isValidInput(String input) {
        return false;
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
        if (activeQuestionnaries.containsKey(session)) {
            activeQuestionnaries.get(session).setNonLonelinessComments(parameter);
        }
    }
}
