package org.example.tasks;

public class AddPizzaMenuTask implements ITask
{
    public static AddPizzaMenuTask instance = new AddPizzaMenuTask();

    public AddPizzaMenuTask(){}

    public static ITask getTask()
    {
        return instance;
    }
}
