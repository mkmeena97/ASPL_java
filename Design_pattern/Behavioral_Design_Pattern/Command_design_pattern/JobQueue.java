package Behavioral_Design_Pattern.Command_design_pattern;

import java.util.LinkedList;
import java.util.Queue;

//invoker
public class JobQueue {
    private Queue<Job> jobQueue = new LinkedList<>();

    public void addJob(Job job) {
        jobQueue.offer(job);
    }

    public void processJobs() {
        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            job.execute();
        }
    }
}
