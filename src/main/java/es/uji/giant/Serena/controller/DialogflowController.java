package es.uji.giant.Serena.controller;

import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.dialogflow.v2.model.*;
import es.uji.giant.Serena.intents.Intent;
import es.uji.giant.Serena.intents.IntentFactory;
import es.uji.giant.Serena.model.Questionnarie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
public class DialogflowController extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(DialogflowController.class);
    private IntentFactory intentFactory;
    private Map<String, Questionnarie> activeQuestionnaries;

    @Autowired
    public DialogflowController() {
        //this.questionnarieDao = questionnarieDao;
        intentFactory = new IntentFactory();
        activeQuestionnaries = new HashMap<>();
    }

    @PostMapping("/dialogflow")
    public ResponseEntity<?> dialogflowWebhook(@RequestBody String requestStr, HttpServletRequest servletRequest) {
        try {
            GoogleCloudDialogflowV2WebhookRequest request = JacksonFactory.getDefaultInstance().createJsonParser(requestStr).parse(GoogleCloudDialogflowV2WebhookRequest.class);
            LOG.info("Request: " + request.toPrettyString());

            String intentName = request.getQueryResult().getIntent().getDisplayName();
            Intent activeIntent = intentFactory.getIntent(intentName);
            GoogleCloudDialogflowV2WebhookResponse response = activeIntent.generateResponseForIntent(request, activeQuestionnaries);

            LOG.info("Response: " + response.toPrettyString());
            LOG.info("Active questionnaries: " + activeQuestionnaries.size());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            LOG.info("Error en el webhook");
            e.printStackTrace();
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
