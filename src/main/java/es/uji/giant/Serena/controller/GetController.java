package es.uji.giant.Serena.controller;

import es.uji.giant.Serena.model.Questionnarie;
import es.uji.giant.Serena.repository.QuestionnarieDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/getQuestionnaries", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Questionnarie> getQuestionnaries () {
        logger.info("Se solicitan todos los cuestionarios realizados");
        return QuestionnarieDao.getAllQuestionnaries();
    }
}
