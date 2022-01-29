package com.javapoo.excecoes.personalizadas.program;

import com.javapoo.excecoes.personalizadas.model.entities.Reservation;
import com.javapoo.excecoes.personalizadas.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) { //metodo que pode lançar a exceção
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.print("Room number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("check-in date (dd/MM/yyyy): ");
            String dateCheckinAux = scanner.nextLine();
            Date dateCheckin = sdf.parse(dateCheckinAux);
            System.out.print("check-out date (dd/MM/yyyy): ");
            String dateCheckoutAux = scanner.nextLine();
            Date dateCheckout = sdf.parse(dateCheckoutAux);


            Reservation reservation = new Reservation(number, dateCheckin, dateCheckout);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("check-in date (dd/MM/yyyy): ");
            dateCheckinAux = scanner.nextLine();
            dateCheckin = sdf.parse(dateCheckinAux);
            System.out.print("check-out date (dd/MM/yyyy): ");
            dateCheckoutAux = scanner.nextLine();
            dateCheckout = sdf.parse(dateCheckoutAux);


            reservation.updateDates(dateCheckin, dateCheckout);
            System.out.println(reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        scanner.close();
    }
}
