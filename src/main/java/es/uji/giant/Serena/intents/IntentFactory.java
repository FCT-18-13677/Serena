package es.uji.giant.Serena.intents;

import es.uji.giant.Serena.utils.Constants;

public class IntentFactory {
    private final WelcomeIntent welcomeIntent;
    private final GenderIntent genderIntent;
    private final AgeIntent ageIntent;
    private final AloneIntent aloneIntent;
    private final AloneFrequencyIntent aloneFrequencyIntent;
    //private AloneQuestionIntent aloneQuestionIntent;
    //private NotAloneQuestionIntent notAloneQuestionIntent;
    private final FreeQuestionIntent freeQuestionIntent;
    private final UCLA1Intent ucla1Intent;
    private final UCLA2Intent ucla2Intent;
    private final UCLA3Intent ucla3Intent;

    public IntentFactory() {
        welcomeIntent = new WelcomeIntent();
        genderIntent = new GenderIntent();
        ageIntent = new AgeIntent();
        aloneIntent = new AloneIntent();
        aloneFrequencyIntent = new AloneFrequencyIntent();
        //aloneQuestionIntent = new AloneQuestionIntent();
        //notAloneQuestionIntent = new NotAloneQuestionIntent();
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
            case Constants.ALONE_FREQUENCY_INTENT:  return aloneFrequencyIntent;
            //case Constants.ALONE_QUESTION_INTENT:   return aloneQuestionIntent;
            case Constants.FREE_QUESTION_INTENT:    return freeQuestionIntent;
            //case Constants.NOT_ALONE_QUESTION_INTENT:   return notAloneQuestionIntent;
            case Constants.UCLA1_INTENT:    return ucla1Intent;
            case Constants.UCLA2_INTENT:    return ucla2Intent;
            case Constants.UCLA3_INTENT:    return ucla3Intent;
            default: return null;
        }
    }
}
