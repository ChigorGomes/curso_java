package com.javapoo.entities;

import com.javapoo.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        double total = 0.0;
        for (OrderItem item : orderItems) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nORDER SUMMARY:\n");
        builder.append("Order moment: ");
        builder.append(sdf.format(moment) + "\n");
        builder.append("Order status: ");
        builder.append(status + "\n");
        builder.append("Client: ");
        builder.append(client);
        builder.append("Order items:\n");
        orderItems.forEach(item -> builder.append(item));
        builder.append("Total price: $");
        builder.append(String.format("%.2f", total()));
        return builder.toString();
    }
}
