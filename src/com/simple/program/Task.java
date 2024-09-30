package com.simple.program;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Task {
		private String taskName;
		private int duration; // in days
		private Set<Task> predescessor; // tasks this task predescessor
		private Date startDate;
		private Date endDate;
		
		
		
		public Task(String taskName, int duration) {
	        this.taskName = taskName;
	        this.duration = duration;
	        this.predescessor = new HashSet<Task>();
	    }
		
		public void addPredescessor(Task task) {
	        this.predescessor.add(task);
	    }
		
		public Set<Task> getPredescessor(){
			if(null==predescessor) {
				predescessor = new HashSet<Task>();
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
