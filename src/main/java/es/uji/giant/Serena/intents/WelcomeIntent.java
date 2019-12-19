package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2Context;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2IntentMessage;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.utils.Constants;
import org.apache.tomcat.util.bcel.Const;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class WelcomeIntent extends Intent {
    @Override
    public GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries) {
        String contextName = request.getSession() + "/contexts/sex";
        return fillResponse(Constants.WELCOME_MP3_URL, Constants.WELCOME_MP3_DESC, Constants.SEX_CHIPS, contextName);
    }

    @Override
    public boolean isValidInput(String input) {
        return false;
    }

    @Override
    public void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session) {
    }
}
