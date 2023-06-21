package org.example;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int userId = 1;
        List<TaskEntity> openTasks = TaskApp.getOpenTasksForUser(userId);

        if (openTasks != null) {
            System.out.println("Open tasks for User ID " + userId + ":");
            for (TaskEntity task : openTasks) {
                System.out.println(task.getId() + ": " + task.getTitle());
            }
        } else {
            System.out.println("Failed to retrieve open tasks for User ID " + userId);
        }
    }
}
