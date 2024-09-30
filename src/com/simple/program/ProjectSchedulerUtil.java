package com.simple.program;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Calendar;

public class ProjectSchedulerUtil {
	
    public static void calculateSchedule(List<Task> tasks, Date projectStartDate) {
        Map<Task, Date> taskEndDates = new HashMap<>();

        for (Task task : tasks) {
            Date earliestStartDate = projectStartDate;

            for (Task dependentTask : task.getPredescessor()) {
                Date depEndDate = taskEndDates.get(dependentTask);
                if (depEndDate.after(earliestStartDate)) {
                    earliestStartDate = depEndDate;
                }
            }

            task.setStartDate(earliestStartDate);
            task.setEndDate(addDays(task.getStartDate(), task.getDuration()));
            taskEndDates.put(task, task.getEndDate());
        }
    }

    public static Date addDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        return calendar.getTime();
    }

    public static void printSchedule(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTaskName() 
            + " | Start: " + task.getStartDate() 
            + " | End: " + task.getEndDate());
        }
    }
}
