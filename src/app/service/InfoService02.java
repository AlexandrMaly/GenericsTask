package app.service;

import app.entity.Client;
import app.utils.Rounder;

import java.util.Scanner;

public class InfoService02 {

    Scanner scanner;
    String phone;
    double amount;

    public String getData() {
        return formData(getInputs());
    }

    private Client<String, Double> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter client's purchase amount: ");
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered not an amount. Amount should be a number");
        }
        return new Client<>(phone, amount);
    }

    private String formData(Client<String, Double> client) {
        String amountRounded = Rounder.roundValue(client.getValue());
        return "Client's phone is " + client.getKey() +
                ", purchase amount is USD " + amountRounded;
    }
}
