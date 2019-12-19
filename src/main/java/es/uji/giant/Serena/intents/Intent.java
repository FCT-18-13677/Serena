package es.uji.giant.Serena.intents;

import com.google.api.services.dialogflow.v2.model.*;
import es.uji.giant.Serena.model.Questionnarie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class Intent {

    public abstract  GoogleCloudDialogflowV2WebhookResponse generateResponseForIntent(GoogleCloudDialogflowV2WebhookRequest request, Map<String, Questionnarie> questionnaries);
    public abstract boolean isValidInput(String input);
    public abstract void saveInfo(Map<String, Questionnarie> activeQuestionnaries, String parameter, String session);

    boolean isValid (String input, String[] validAnswers) {
        for (String validAnswer : validAnswers) {
            if (validAnswer.equals(input.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public List<GoogleCloudDialogflowV2IntentMessage> generateSSMLAudio(String url, String desc) {
        List<GoogleCloudDialogflowV2IntentMessage> fulfillmentMessages = new ArrayList<>();
        GoogleCloudDialogflowV2IntentMessage message = new GoogleCloudDialogflowV2IntentMessage();

        List<GoogleCloudDialogflowV2IntentMessageSimpleResponse> messagesList = new ArrayList<>();
        GoogleCloudDialogflowV2IntentMessageSimpleResponse response = new GoogleCloudDialogflowV2IntentMessageSimpleResponse();
        response.setSsml("<speak><audio src=\"" + url + "\"> <desc>" + desc + "</desc> </audio></speak>");
        messagesList.add(response);

        GoogleCloudDialogflowV2IntentMessageSimpleResponses responses = new GoogleCloudDialogflowV2IntentMessageSimpleResponses();
        responses.setSimpleResponses(messagesList);

        message.setPlatform("ACTIONS_ON_GOOGLE");
        message.setSimpleResponses(responses);

        fulfillmentMessages.add(message);
        return fulfillmentMessages;
    }

    public GoogleCloudDialogflowV2IntentMessage generateSuggestionChips(String[] chips) {
        GoogleCloudDialogflowV2IntentMessage message = new GoogleCloudDialogflowV2IntentMessage();
        message.setPlatform("ACTIONS_ON_GOOGLE");
        GoogleCloudDialogflowV2IntentMessageSuggestions suggestions = new GoogleCloudDialogflowV2IntentMessageSuggestions();
        List<GoogleCloudDialogflowV2IntentMessageSuggestion> suggestionList = new ArrayList<>();

        for (int i = 0; i < chips.length; i++) {
            GoogleCloudDialogflowV2IntentMessageSuggestion s = new GoogleCloudDialogflowV2IntentMessageSuggestion();
            s.put("title", chips[i]);
            suggestionList.add(s);
        }
        suggestions.setSuggestions(suggestionList);
        message.setSuggestions(suggestions);

        return message;
    }

    public GoogleCloudDialogflowV2WebhookResponse fillResponse(String audio, String desc, String[] chips, String contextName) {
            GoogleCloudDialogflowV2WebhookResponse response = new GoogleCloudDialogflowV2WebhookResponse();
            GoogleCloudDialogflowV2Context outputContext = new GoogleCloudDialogflowV2Context();

            response.setFulfillmentMessages(generateSSMLAudio(audio, desc));
            if (chips != null) {
                response.getFulfillmentMessages().add(generateSuggestionChips(chips));
            }

            outputContext.setLifespanCount(1);
            outputContext.setName(contextName);
            response.setOutputContexts(new ArrayList<>(Arrays.asList(outputContext)));

            return response;
    }
}
