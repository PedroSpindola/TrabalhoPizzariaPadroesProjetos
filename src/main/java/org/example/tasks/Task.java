package org.example.tasks;

public class Task
{

    private ITask task;

    public Task(ITask task)
    {
        this.task = task;
    }

    public ITask getTask()
    {
        return task;
    }

    public void setTask(ITask task)
    {
        this.task = task;
    }

}
