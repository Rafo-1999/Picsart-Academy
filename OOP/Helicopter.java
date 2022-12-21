package org.homework2;

public class Helicopter {

    public static void main(String[] args) {

        Passenger passenger = new Passenger();
        passenger.setName("FirstName");
        passenger.setSurname("LastName");
        passenger.setTicketName(1);

        Flight flight = new Flight();
        flight.setFlightNumber(15);


        System.out.println("Passenger Name ->"+passenger.getName());
        System.out.println("Passenger Surname ->"+passenger.getSurname());
        System.out.println("Passenger TicketName ->"+passenger.getTicketName());
        System.out.println("Flight Number ->" +flight.getFlightNumber());


    }


    public static class Passenger {
        private String name;
        private String surname;

        private int ticketName;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getTicketName() {
            return ticketName;
        }

        public void setTicketName(int ticketName) {
            this.ticketName = ticketName;
        }

        public boolean validTicket(){
            if (ticketName!=0){
                return true;
            }
            else {
                return false;
            }
        }
    }


    public static class Flight {
        Passenger passenger1=null;
        private int flightNumber;

        private int maxCountPassenger=20;

        private int confirmedPassenger;



        public int getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(int flightNumber) {
            this.flightNumber = flightNumber;
        }

        public int getConfirmedPassenger() {
            return confirmedPassenger;
        }

        public void setConfirmedPassenger(int confirmedPassenger) {
            this.confirmedPassenger = confirmedPassenger;
        }

        public int getMaxSize() {
            return maxCountPassenger;
        }

        public void setMaxSize(int maxSize) {
            this.maxCountPassenger = maxCountPassenger;
        }

        public  boolean addPassenger(Passenger p){
            for (int i=0;i<maxCountPassenger;i++) {
                if (confirmedPassenger == 0) {
                    passenger1 = p;
                    confirmedPassenger++;
                    System.out.println("Added passengers");
                }

            }
            return true;

        }
    }

}


