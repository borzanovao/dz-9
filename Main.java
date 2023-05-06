public class Main {
    public static void main(String[] args) {
        Person men1 = new Man("Pasha", "Pavlov", 7, null);
        Person men2 = new Man("Alex", "Ovechko", 66, null);
        Person women1 = new Woman("Masha", "Ivanova", 8, null);
        Person women2 = new Woman("Lisa", "Kravchenko", 61, null);
        men2.registerPartnership(women2);
        System.out.println(men1 + "\n" + men2 + "\n" + women1 + "\n" + women2);
        //  women2.deregisterPartnership(true);
        women2.deregisterPartnership(false);
        System.out.println("\t" + men1 + "\n\t" + men2 + "\n\t" + women1 + "\n\t" + women2);
    }
}
