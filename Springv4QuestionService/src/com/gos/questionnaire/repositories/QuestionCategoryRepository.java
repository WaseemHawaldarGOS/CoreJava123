package com.gos.questionnaire.repositories;

import java.math.BigInteger;

import com.gos.questionnaire.beans.AaiAbcDimQtnCategory;
import org.springframework.data.repository.CrudRepository;

public interface QuestionCategoryRepository extends CrudRepository<AaiAbcDimQtnCategory,BigInteger>{

}
