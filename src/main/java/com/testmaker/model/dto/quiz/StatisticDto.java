package com.testmaker.model.dto.quiz;

import com.testmaker.model.user.UserStatistic;
import lombok.Data;

import java.util.List;

@Data
public class StatisticDto {

    List<UserStatistic> statistics;

}
