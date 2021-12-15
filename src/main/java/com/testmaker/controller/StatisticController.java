package com.testmaker.controller;

import com.testmaker.model.Statistic;
import com.testmaker.model.user.UserStatistic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/statistic")
public class StatisticController {


    @GetMapping
    public Statistic getStatistic() {
        return null;
    }

    @GetMapping("/user/{userId}")
    public UserStatistic getUserStatistic(@PathVariable Long userId) {
        return null;
    }

}
