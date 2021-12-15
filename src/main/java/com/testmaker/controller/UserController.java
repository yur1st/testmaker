package com.testmaker.controller;

import com.testmaker.model.Proposal;
import com.testmaker.model.Quiz;
import com.testmaker.model.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public User addUser(User user) {
        return null;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return null;
    }

    @GetMapping
    public List<User> getUsers() {
        return new ArrayList<>();
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, User user) {
        return null;
    }

    @DeleteMapping("/{userId}")
    public User deleteUser(@PathVariable Long userId) {
        return null;
    }

    @GetMapping("/{userId}/quiz")
    public List<Quiz> getUserQuizzes(@PathVariable Long userId) {
        return new ArrayList<>();
    }

    @GetMapping("/{userId}/proposal")
    public List<Proposal> getAllUserProposals(@PathVariable Long userId) {
        return new ArrayList<>();
    }

    @GetMapping("/{userId}/quiz/{quizId}/proposal")
    public List<Proposal> getUserProposalsForQuiz(@PathVariable Long userId, @PathVariable Long quizId) {
        return new ArrayList<>();
    }

}
