package com.luismiguel;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerEvent managerEvent = new ManagerEvent();

        System.out.println("Cadastro do Usuário");

        System.out.println("User: ");
        String userName = scanner.nextLine();

        System.out.println("Email: ");
        String userEmail = scanner.nextLine();

        System.out.println("Idade: ");
        int userAge = scanner.nextInt();

        System.out.println("Sex(F/M): ");
        String userInputSex = scanner.nextLine();
        boolean userSex = userInputSex.equalsIgnoreCase("M");

        scanner.nextLine();

        System.out.println("Endereço: ");
        String userAddress = scanner.nextLine();

        Usuario usuario = new Usuario(userName, userEmail, userAge, userSex, userAddress);


        System.out.println("Cadastro de Eventos");

        System.out.println("Name: ");
        String eventName = scanner.nextLine();

        System.out.println("Endereço: ");
        String eventAddress = scanner.nextLine();

        System.out.println("Categoria: ");
        String category = scanner.nextLine();

        System.out.println("Horário (YYYY-MM-DD HH:MM): ");
        String timeString = scanner.nextLine();

        String[] parts = timeString.split(" ");
        String[] dateParts = parts[0].split("-");
        String[] timeParts = parts[1].split(":");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        int hour = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        LocalDateTime time = LocalDateTime.of(year, month, day, hour, minutes);

        System.out.println("Descrição: ");
        String description = scanner.nextLine();

        Event event = new Event(eventName, eventAddress, category, time, description);
        managerEvent.registerEvent(event);

        System.out.println("\nEventos Cadastrados");
        for (Event e : managerEvent.consultEvents()) {
            System.out.printf("Nome: " + e.getEventName());
            System.out.printf("\nEndereço: " + e.getEventAddress());
            System.out.printf("\nCategoria: " + e.getCategory());
            System.out.printf("\nHorário: " + e.getTime());
            System.out.printf("\nDescrição: " + e.getDescription());
        }

        scanner.close();

    }
}