package org.example.user;

import org.example.tasks.Task;

import java.util.ArrayList;

public abstract class UserEmployers extends Users {
    private boolean adm;

    protected ArrayList taskList = new ArrayList();
    private org.example.user.UserEmployers nextEmployer;

    public org.example.user.UserEmployers getNextEmployer()
    {
        return nextEmployer;
    }

    public void setNextEmployer(org.example.user.UserEmployers nextEmployer)
    {
        this.nextEmployer = nextEmployer;
    }

    public abstract String getEmployerJob();

    public String executeTask(Task task)
    {
        if(taskList.contains(task.getTask())){
            return getEmployerJob();
        }

        if(nextEmployer != null){
            return nextEmployer.executeTask(task);
        }

        return "No employer with this task";
    }

}

