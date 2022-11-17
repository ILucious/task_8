package task;

import test.Task_8_Tests;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Task_8 task = new Task_8();
        Task_8_Tests.test(task, "test");
    }
}
