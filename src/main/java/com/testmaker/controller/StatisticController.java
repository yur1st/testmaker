package com.testmaker.controller;

import com.testmaker.model.dto.StatisticDto;
import com.testmaker.model.user.UserStatistic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticController {


    @GetMapping
    public StatisticDto getStatistic() {
        return null;
    }

    @GetMapping("/user/{userId}")
    public UserStatistic getUserStatistic(@PathVariable Long userId) {
        return null;
    }

}
