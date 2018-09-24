package com.github.epietras220.todo.list;

public class ToDoList {

    //TODO - pola: reader, writer, manager
    private MenuState state = MenuState.MAIN_MENU;
    Manager manager = new Manager();
    boolean a = true;

    public void run() {
        while (true) {
            manager.printMenu();
        }
    }
}
