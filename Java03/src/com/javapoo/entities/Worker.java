package com.javapoo.entities;

import com.javapoo.entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> hourContracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getHourContracts() {
        return hourContracts;
    }

    public void addContract(HourContract contract) {
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        hourContracts.remove(contract);
    }

    public double income(int year, int month) {
        double valorTotal = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c : hourContracts) {
            calendar.setTime(c.getDate());
            int auxYear = calendar.get(Calendar.YEAR);
            int auxMonth = 1 + calendar.get(Calendar.MONTH);
            if (auxYear == year && auxMonth == month) {
                valorTotal += c.totalValue();
            }
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return
                "\nName: "
                        + name
                        + "\nDepartment: "
                        + department.getName()
                        + "\nLevel: "
                        + level.toString()
                        + "\n";
    }
}
