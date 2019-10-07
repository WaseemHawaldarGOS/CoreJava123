package com.gos.questionnaire.repositories;

import java.math.BigInteger;

import com.gos.questionnaire.beans.QuestionBean;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<QuestionBean,BigInteger> {

}
