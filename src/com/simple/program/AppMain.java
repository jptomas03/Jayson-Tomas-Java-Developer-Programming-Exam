package com.simple.program;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AppMain {

	
	public static void main(String[] args) {
        Task task1 = new Task("Task 1", 3);
        Task task2 = new Task("Task 2", 2);
        Task task3 = new Task("Task 3", 5);
        Task task4 = new Task("Task 4", 2);
        Task task5 = new Task("Task 5", 3);


        // Set up dependencies
        task2.addPredescessor(task1);
        task3.addPredescessor(task2);
        task3.addPredescessor(task1);
        task4.addPredescessor(task1);
        task2.addPredescessor(task1);

        // Add all tasks to a list
        List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5);

        // Calculate the schedule
        Date projectStartDate = new Date(); // Current date
        ProjectSchedulerUtil.calculateSchedule(tasks, projectStartDate);

        // Print the schedule
        ProjectSchedulerUtil.printSchedule(tasks);
    }
}
