package net.woody.utils;

public class CommandUtil {

    //TODO : private 생성자

    public static void printMenu() {
        System.out.println("< Command Menu >");
        System.out.println(" 'start' : game start ");
        System.out.println(" 'end'   : game end ");
        System.out.println("( case-insensitive 😊)");
        System.out.print("> ");
    }

    public static boolean isGameOver(String command) {
        switch (command.toLowerCase()) {
            case "start":
                return true;
            case "end":
                System.out.println("bye~!💨💨");
                return false;
            default:
                System.out.println("plz enter the command again, check the command menu!");
                return true;
        }
    }
}
