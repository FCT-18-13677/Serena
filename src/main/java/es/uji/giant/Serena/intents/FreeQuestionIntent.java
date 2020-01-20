package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.repository.QuestionnarieDao;
import es.uji.giant.Serena.utils.Constants;

import java.util.Map;

public class FreeQuestionIntent extends Intent {
    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String parameter = String.valueOf(request.getQueryResult().getParameters().get("val")), audio, desc, contextName;
        String[] chips = Constants.UCLA_CHIPS;
        saveInfo(questionnaries, parameter, request.getSession());

        audio = Constants.END_CONVERSATION_MP3;
        desc = Constants.END_CONVERSATION_DESC;
        contextName = request.getSession() + "/contexts/end";

        return fillResponse(audio, desc, chips, contextName);
    }

    @Override
    public boolean isValidInput(String input) {
        return false;
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
        if (activeQuestionnaries.containsKey(session)) {
            activeQuestionnaries.get(session).setHowAreYouComments(parameter);

            activeQuestionnaries.get(session).calculateUCLAScore();
            activeQuestionnaries.get(session).setTimestamp(System.currentTimeMillis());
            QuestionnarieDao.insertQuestionnarie(session, activeQuestionnaries.get(session));
            activeQuestionnaries.remove(session);
        }
    }
}
