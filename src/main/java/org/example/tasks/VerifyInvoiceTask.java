package org.example.tasks;

public class VerifyInvoiceTask implements ITask
{
    public static VerifyInvoiceTask instance = new VerifyInvoiceTask();

    public VerifyInvoiceTask(){}

    public static ITask getTask()
    {
        return instance;
    }
}
