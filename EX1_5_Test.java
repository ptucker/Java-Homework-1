public class EX1_5_Test {
    public static void main(String [] args) {
        // Let's test out the overloaded constructor by making a few employees
        EX1_5 Employee1 = new EX1_5("Tom Hardy", "January 17, 2006", "Cashier", "Suzie");
        EX1_5 Employee2 = new EX1_5("Sally Jones", "November 6, 2010", "Courtesy Clerk", "Mary");
        EX1_5 Employee3 = new EX1_5("Gertrude Vonderbeek", "January 5, 2019", "deli clerk", "Fred");

        // Let's test out our getters and constructor by printing out our 3 employees' stats to the console
        System.out.println("This employee's name is " + Employee1.getName() + ". His/her employee number is " + Employee1.getIdNumber() + ". He/She was hired as a " + Employee1.getPosition() + " on " + Employee1.getHiredate() + " and his/her boss is " + Employee1.getBoss() + "\n");
        System.out.println("This employee's name is " + Employee2.getName() + ". His/her employee number is " + Employee2.getIdNumber() + ". He/She was hired as a " + Employee2.getPosition() + " on " + Employee2.getHiredate() + " and his/her boss is " + Employee2.getBoss() + "\n");
        System.out.println("This employee's name is " + Employee3.getName() + ". His/her employee number is " + Employee3.getIdNumber() + ". He/She was hired as a " + Employee3.getPosition() + " on " + Employee3.getHiredate() + " and his/her boss is " + Employee3.getBoss() + "\n");

        // Lastly, we better give out a promotion, after all, Gertrude is killin' it!
        Employee3.setPosition("Deli Supervisor");
        Employee3.setBoss("Justin, GM");

        // Let's show this promotion 
        System.out.println(Employee3.getName() + " was promoted to " + Employee3.getPosition() + " and now her direct superior is none other than " + Employee3.getBoss() + "\n");
    }

}