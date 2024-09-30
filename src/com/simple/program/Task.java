package com.simple.program;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Task {
		private String taskName;
		private int duration; // in days
		private List<Task> predescessor; // tasks this task predescessor
		private Date startDate;
		private Date endDate;
		
		
		
		public Task(String taskName, int duration) {
	        this.taskName = taskName;
	        this.duration = duration;
	        this.predescessor = new ArrayList<Task>();
	    }
		
		public void addPredescessor(Task task) {
	        this.predescessor.add(task);
	    }
		
		public List<Task> getPredescessor(){
			if(null==predescessor) {
				predescessor = new ArrayList<Task>();
			}
			return predescessor;
		}
		
		
		public String getTaskName() {
			return taskName;
		}
		
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		
		public void setDuration(int duration) {
			this.duration = duration;
		}
		
		public int getDuration() {
			return duration;
		}
		
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		
		public Date getEndDate() {
			return endDate;
		}
		
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		
		public Date getStartDate() {
			return startDate;
		}
		
		
		
		
		
		
}
