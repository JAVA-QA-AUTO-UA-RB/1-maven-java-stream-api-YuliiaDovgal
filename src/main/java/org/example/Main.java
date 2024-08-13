package org.example;

import org.example.dto.User;
import org.example.helpers.ResourceLoader;

import java.io.IOException;
import java.util.List;

public class Main {

    public static final String INPUT_FILENAME = "users.json";

    public static void main(String[] args) throws IOException {

        String inputFileName = INPUT_FILENAME;
        String jsonFilePath = ResourceLoader.getResourcePath(inputFileName);
        List<User> importedUsers = UserLoader.loadUsersFromJson(jsonFilePath);
        List<User> filteredAndSortedUsers = UserProcessor.filterAndSortUsers(importedUsers);

        filteredAndSortedUsers.forEach(System.out::println);

    }
}