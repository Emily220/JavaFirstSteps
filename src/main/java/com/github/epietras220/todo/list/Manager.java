package com.github.epietras220.todo.list;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.github.epietras220.todo.list.MenuState.*;
import static java.time.LocalDateTime.now;

public class Manager {

    private static Scanner input = new Scanner(System.in);
    private MenuState state;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    List<Entry> entryList = new ArrayList<>();

    public Manager() {

        this.state = MAIN_MENU;
    }

    public void printMenu() {

        int userChoice = 0;

        if (state == MAIN_MENU) {
            System.out.println("Hello! What do you want to do?");
            System.out.println("Create new task - press 1");
            System.out.println("View only incomplete task - press 2");
            System.out.println("View only completed task - press 3");
            System.out.println("View of all tasks (completed and incomplete) - press 4");
            System.out.println("Save all changes in CSV file - press 5");
            System.out.println("Open csv file - press 6");
            System.out.println("To finish entering changes - press 99");

            try {
                userChoice = Integer.parseInt(input.nextLine());
                handleUserChoice(userChoice);
            } catch (NumberFormatException ex) {
                System.out.println("Option doesn't known");
            }

        } else if (state == CREATE_ENTRY) {
            LocalDateTime deadline = null;
            System.out.println("Enter the task name");
            String taskName = input.nextLine();
            LocalDateTime createDate = now();
            System.out.println("Enter content of the task");
            String task = input.nextLine();
            Boolean completed = false;
            System.out.println("Enter deadline (in format: yyyy-MM-dd HH:mm)");

            while (deadline == null || deadline.isBefore(now())) {
                try {
                    deadline = LocalDateTime.parse(input.nextLine(), formatter);
                    if (deadline.isBefore(now())) {
                        System.out.println("Deadline must be in the future");
                    }

                } catch (DateTimeParseException ex) {
                    System.out.println("Ups, something went wrong. Enter date in correct format: yyyy-MM-dd HH:mm");
                }
            }
            StringBuilder line = new StringBuilder();
            line.append(taskName)
                    .append(";")
                    .append(createDate.format(formatter))
                    .append(";")
                    .append(task)
                    .append(";")
                    .append(completed)
                    .append(";")
                    .append(deadline.format(formatter));

            Entry entry = new Entry(line.toString(), ";");
            entryList.add(entry);

            System.out.println("your changes have been saved.");
            comeBackToMainMenu(userChoice);

        } else if (state == COMPLETE_ENTRY) {
            System.out.println("Which one task you want to mark as completed?");
            int number = Integer.parseInt(input.nextLine());
            entryList.get(number - 1).complete();
            System.out.println("The task has been completed and remove from the task list.");
            comeBackToMainMenu(userChoice);

        } else if (state == EXTEND_DEADLINE) {
            System.out.println("Whose task you want to extend deadline?");
            int number = Integer.parseInt(input.nextLine());
            System.out.println("How many days do you want to extend?");
            int days = Integer.parseInt(input.nextLine());
            while (days <= 0) {
                System.out.println("Count of days must be more than 0");
                System.out.println("Enter correct count of days");
                days = Integer.parseInt(input.nextLine());
            }
            entryList.get(number - 1).extendDeadline(days);
            System.out.println("Deadline has been extend");
            comeBackToMainMenu(userChoice);

        } else if (state == ALL_TASK_LIST_VIEW) {
            if (entryList.isEmpty()) {
                System.out.println("Your task list is empty. Add your first task!");
                System.out.println("Create new task - press 1");
                System.out.println("Come back to main menu - press 0");
                userChoice = Integer.parseInt(input.nextLine());
                handleUserChoice(userChoice);

            } else {
                int listSize = entryList.size();
                for (int i = 0; i < listSize; i++) {
                    System.out.println(i + 1 + ". " + entryList.get(i).getUuid()
                            + ", " + entryList.get(i).getTask()
                            + ", deadline: " + entryList.get(i).getDeadline().format(formatter)
                            + " is completed? - " + entryList.get(i).isCompleted());
                }
                comeBackToMainMenu(userChoice);
            }
        } else if (state == SAVE_AS_CSV_FILE) {
            System.out.println("File name: ");
            String nameFile = input.nextLine();
            LineWriter lineWriter = new LineWriter();
            try {
                lineWriter.write(entryList, lineWriter.getFile(nameFile).toString() + ".csv");
            } catch (IOException e) {
                System.out.println("Ups, something went wrong.");
            }
            System.out.println("Your tasks have been saved in CSV file.");
            comeBackToMainMenu(userChoice);

        } else if (state == READ_FROM_CSV_FILE) {
            LineReader lineReader = new LineReader();

            System.out.println("Which one file do you want to open? (Enter file name:)");
            String nameFile = input.nextLine();
            try {
                lineReader.read(nameFile + ".csv");
            } catch (IOException ex) {
                System.out.println("Ups, This file not exist. Check file name and enter correct name.");
            }
            System.out.println("The file has been loaded.");
            System.out.println("Do you want to see your tasks? Press 4");
            comeBackToMainMenu(userChoice);

        } else if (state == INCOMPLETE_TASK_LIST_VIEW) {
            int listSize = entryList.size();
            for (int i = 0; i < listSize; i++) {
                if (!entryList.get(i).isCompleted()) {
                    System.out.println(i + 1 + ". " + entryList.get(i).getUuid() + ", " + entryList.get(i).getTask() + ", deadline: " + entryList.get(i).getDeadline().format(formatter));
                    System.out.println("What do you want to do now?");
                    System.out.println("Extend deadline one of the tasks - press 1");
                    System.out.println("Mark the task as completed - press 2");
                } else {
                    System.out.println("Congratulations! You don't have incomplete tasks.");
                }
            }
            System.out.println("Come back to main menu - press 0");
            System.out.println("Exit program - press 99");
            userChoice = Integer.parseInt(input.nextLine());
            handleUserChoiceInTask(userChoice);


        } else if (state == COMPLETED_TASK_LIST_VIEW) {
            int listSize = entryList.size();
            for (int i = 0; i < listSize; i++) {
                if (entryList.get(i).isCompleted()) {
                    System.out.println(i + 1 + ". " + entryList.get(i).getUuid() + ", " + entryList.get(i).getTask() + ", deadline: " + entryList.get(i).getDeadline().format(formatter));
                } else {
                    System.out.println("You don't have completed tasks.");
                }
            }
            comeBackToMainMenu(userChoice);
        }
    }

    public void comeBackToMainMenu(int userChoice) {
        System.out.println("What do you want to do now?");
        System.out.println("Come back to main menu - press 0");
        System.out.println("Exit program - press 99");
        userChoice = Integer.parseInt(input.nextLine());
        handleUserChoice(userChoice);
    }

    public void handleUserChoice(int number) {
        switch (number) {
            case 0:
                state = MAIN_MENU;
                printMenu();
            case 1:
                state = CREATE_ENTRY;
                printMenu();
            case 2:
                state = INCOMPLETE_TASK_LIST_VIEW;
                printMenu();
            case 3:
                state = COMPLETED_TASK_LIST_VIEW;
                printMenu();
            case 4:
                state = ALL_TASK_LIST_VIEW;
                printMenu();
            case 5:
                state = SAVE_AS_CSV_FILE;
                printMenu();
            case 6:
                state = READ_FROM_CSV_FILE;
                printMenu();
            case 99:
                System.exit(0);
            default:
                System.out.println("Ups, something went wrong. Enter correct number");
                state = MAIN_MENU;
                printMenu();
        }
    }

    public void handleUserChoiceInTask(int number) {
        switch (number) {
            case 0:
                state = MAIN_MENU;
                printMenu();
            case 1:
                state = EXTEND_DEADLINE;
                printMenu();
            case 2:
                state = COMPLETE_ENTRY;
                printMenu();
            case 99:
                System.exit(0);
            default:
                System.out.println("Ups, something went wrong. Enter correct number");
                state = MAIN_MENU;
                printMenu();

        }
    }
}
