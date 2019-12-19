package es.uji.giant.Serena.intents;

import es.uji.giant.Serena.utils.Constants;

public class IntentFactory {
    private WelcomeIntent welcomeIntent;
    private GenderIntent genderIntent;
    private AgeIntent ageIntent;
    private AloneIntent aloneIntent;
    private AloneQuestionIntent aloneQuestionIntent;
    private NotAloneQuestionIntent notAloneQuestionIntent;
    private FreeQuestionIntent freeQuestionIntent;
    private UCLA1Intent ucla1Intent;
    private UCLA2Intent ucla2Intent;
    private UCLA3Intent ucla3Intent;

    public IntentFactory() {
        welcomeIntent = new WelcomeIntent();
        genderIntent = new GenderIntent();
        ageIntent = new AgeIntent();
        aloneIntent = new AloneIntent();
        aloneQuestionIntent = new AloneQuestionIntent();
        notAloneQuestionIntent = new NotAloneQuestionIntent();
        freeQuestionIntent = new FreeQuestionIntent();
        ucla1Intent = new UCLA1Intent();
        ucla2Intent = new UCLA2Intent();
        ucla3Intent = new UCLA3Intent();
    }

    public Intent getIntent(String activeIntent) {
        switch (activeIntent) {
            case Constants.WELCOME_INTENT:  return welcomeIntent;
            case Constants.GENDER_INTENT:  return genderIntent;
            case Constants.AGE_INTENT:  return ageIntent;
            case Constants.ALONE_INTENT:  return aloneIntent;
            case Constants.ALONE_QUESTION_INTENT:   return aloneQuestionIntent;
            case Constants.FREE_QUESTION_INTENT:    return freeQuestionIntent;
            case Constants.NOT_ALONE_QUESTION_INTENT:   return notAloneQuestionIntent;
            case Constants.UCLA1_INTENT:    return ucla1Intent;
            case Constants.UCLA2_INTENT:    return ucla2Intent;
            case Constants.UCLA3_INTENT:    return ucla3Intent;
            default: return null;
        }
    }
}
