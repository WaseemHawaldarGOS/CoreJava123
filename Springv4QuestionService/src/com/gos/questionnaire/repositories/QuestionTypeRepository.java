package com.gos.questionnaire.repositories;

import java.math.BigInteger;

import com.gos.questionnaire.beans.AaiAbcDimQtnType;
import org.springframework.data.repository.CrudRepository;

public interface QuestionTypeRepository extends CrudRepository<AaiAbcDimQtnType,BigInteger>{

}
