package com.javapoo.excecoes.personalizadas.program;

import com.javapoo.excecoes.personalizadas.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException { //metodo que pode lançar a exceção
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("check-in date (dd/MM/yyyy): ");
        String dateCheckinAux = scanner.nextLine();
        Date dateCheckin = sdf.parse(dateCheckinAux);
        System.out.print("check-out date (dd/MM/yyyy): ");
        String dateCheckoutAux = scanner.nextLine();
        Date dateCheckout = sdf.parse(dateCheckoutAux);

        if (!dateCheckout.after(dateCheckin)) {
            System.out.println("Error in reservation: Check-out date must ber after check-in date");
        } else {
            Reservation reservation = new Reservation(number, dateCheckin, dateCheckout);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("check-in date (dd/MM/yyyy): ");
            dateCheckinAux = scanner.nextLine();
            dateCheckin = sdf.parse(dateCheckinAux);
            System.out.print("check-out date (dd/MM/yyyy): ");
            dateCheckoutAux = scanner.nextLine();
            dateCheckout = sdf.parse(dateCheckoutAux);

            Date now = new Date();
            if (dateCheckin.before(now) || dateCheckout.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!dateCheckout.after(dateCheckin)) {
                System.out.println("Error in reservation: Check-out date must ber after check-in date");
            } else {
                reservation.updateDates(dateCheckin, dateCheckout);
                System.out.println(reservation);
            }


        }


        scanner.close();
    }
}
