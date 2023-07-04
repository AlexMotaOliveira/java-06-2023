package com.impacta.treinamento.apendice;

import javax.swing.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TesteLocalDate {

    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date.toString());
        date.getTime();
        date.before(new Date());
        date.getDay();


        Timestamp timestamp = new Timestamp(1688422863);
        System.out.println(timestamp);

        DateTimeFormatter mascara1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(mascara1));


        LocalDateTime converterData = LocalDateTime.of(2023, 7, 3, 19, 27, 10, 122154);
        System.out.println(converterData);

        LocalDateTime parseData = LocalDateTime.parse("2023-07-03T19:29:00.928506300");
        System.out.println(parseData);

        parseData.getYear();

        int ano = localDateTime.getYear();
        int mes = localDateTime.getDayOfMonth();
        int hora = localDateTime.getHour();
        int minuto = localDateTime.getMinute();

        System.out.printf("Estamos no ano %d. do mês %d \n", ano, mes);

        String format = String.format("Estamos no ano %d. do mês %d \n", ano, mes);
        System.out.println(format);


        DateTimeFormatter mascara2 = DateTimeFormatter.ofPattern("EEEE");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withMonth(1).withDayOfMonth(25);

        System.out.println(localDateTime2);

        JOptionPane.showInputDialog("");

    }
}
