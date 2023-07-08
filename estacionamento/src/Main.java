import br.com.impacta.estacionamento.account.AccountStatus;
import br.com.impacta.estacionamento.account.Admin;
import br.com.impacta.estacionamento.account.ParkingAgent;
import br.com.impacta.estacionamento.model.parking.*;
import br.com.impacta.estacionamento.model.vehicle.Car;
import br.com.impacta.estacionamento.panel.DisplayBoard;
import br.com.impacta.estacionamento.payment.Cash;
import br.com.impacta.estacionamento.payment.ParkingRate;
import br.com.impacta.estacionamento.payment.Payment;
import br.com.impacta.estacionamento.payment.PaymentStatus;
import br.com.impacta.estacionamento.person.Person;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Person personAdmin = new Person("Alex", "Rua Algum lugar", "São Paulo", "SP", 0000000, "Brasil");

        Address address = new Address("Rua das Alegrias", "São Paulo", "SP", 999999, "Brasil");
        Person manobrista = new Person("Jose", address);

        Admin admin = new Admin();
        admin.setPerson(personAdmin);
        admin.setPassword("123456");
        admin.setAccountStatus(AccountStatus.Active);
        admin.setUserName("alex_mota");

        ParkingAgent agent = new ParkingAgent();
        agent.setPerson(manobrista);
        agent.setPassword("654321");
        agent.setAccountStatus(AccountStatus.Active);
        agent.setUserName("jose_silva");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Estacionamento Rua 5");
        parkingLot.setId(10);
        parkingLot.setAddress(new Address("Rua 5", "São Paulo", "SP", 555555, "Brasil"));

        Large large50 = new Large();
        large50.setId(11);
        large50.setFree(true);

        Large large51 = new Large();
        large51.setId(12);
        large51.setFree(true);

        Compact compact20 = new Compact();
        compact20.setId(20);
        compact20.setFree(true);

        Compact compact21 = new Compact();
        compact20.setId(21);
        compact20.setFree(true);

        Handicapped handicapped1 = new Handicapped();
        handicapped1.setId(1);
        handicapped1.setFree(true);

        Handicapped handicapped2 = new Handicapped();
        handicapped2.setId(2);
        handicapped2.setFree(true);

        MotorCycle motorCycle50 = new MotorCycle();
        motorCycle50.setId(50);
        motorCycle50.setFree(true);

        MotorCycle motorCycle51 = new MotorCycle();
        motorCycle51.setId(51);
        motorCycle51.setFree(true);

        DisplayBoard displayBoard = new DisplayBoard(10, 5, 30, 15);
        parkingLot.setDisplayBoard(displayBoard);

        displayBoard.setLargeSpot(Arrays.asList(large50, large51));
        displayBoard.setCompactSpot(Arrays.asList(compact20, compact21));
        displayBoard.setHandicappedSpot(Arrays.asList(handicapped1, handicapped2));
        displayBoard.setMotorCycleSpot(Arrays.asList(motorCycle50, motorCycle51));

        Entrance entrance = new Entrance();
        entrance.setId(1);

        ParkingRate parkingRate = new ParkingRate();
        parkingRate.setRate(5.0);
        parkingRate.setHours(5);

        ParkingTicket ticket = entrance.getTicket();
        parkingLot.getParkingTicketMap().put(ticket.getTicketNumber(), ticket);
        ticket.setAmount(parkingRate.calculate());

        Car car = new Car();
        car.setLicenseNo("BRR-1023");

        Exit exit = new Exit();
        exit.setId(60);

        Payment payment = new Cash();
        payment.setPaymentStatus(PaymentStatus.Pending);
        ticket.setPayment(payment);

        if(exit.validateTicket(payment)){
            System.out.println("saida liberada");
        }else {

        }

        car.assingTicket(ticket);

        System.out.println();

    }
}