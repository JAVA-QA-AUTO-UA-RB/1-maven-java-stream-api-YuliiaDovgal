package org.example;

import org.example.dto.User;

import java.util.List;

import java.util.stream.Collectors;

public class UserProcessor {

    public static List<User> filterAndSortUsers(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() > 25)
                .filter(user -> user.getEmail().endsWith("ilovedogs.com") || user.getEmail().endsWith("ilovecats.com"))
                .sorted((u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()))
                .collect(Collectors.toList());
    }
}
