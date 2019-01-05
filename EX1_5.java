public class EX1_5 {

private String name;                            // Object variable defining this employee's name
private static int instanceCounter = 100;       // This is a static variable that will hold steady so that every instance of this object can be incremented
private int idNumber;                           // Object variable defining this employee's number
private String hireDate;                        // Object variable holding this employee's hire date
private String position;                        // Object variable describing the position that this employee currently holds
private String boss;                            // Object variable describing who this employee's direct supervisor is

/*
 When I was naming my file, I kinda forgot that the class name had to match the file name, 
 so can we pretend that this is class employee rather than class EX1_5 and 
 that these are employee constructors?
*/
public EX1_5 () {}       // No Arg Constructor

// This overloaded constructor takes the employee's name, date of hire, position, and direct boss
// It then increments the private int idNumber variable so that each instance of this class will have its own unique number
public EX1_5 (String Name, String Hiredate, String Position, String Manager) {
    name = Name;
    hireDate = Hiredate;
    position = Position;
    boss = Manager;
    instanceCounter++;                      // Increments the instance counter which applies to each successive instance of this object
    idNumber = instanceCounter;             // Gives this specific object the current instance counter value as their employee number
}

// Getters
public String getName() { return name; }
public int getIdNumber() { return idNumber; }
public String getPosition() { return position; }
public String getHiredate() { return hireDate; }
public String getBoss() { return boss; }

// Setters (In case this employee is promoted or has a boss change)
public void setPosition(String newPosition) { position = newPosition; }
public void setBoss(String newBoss) { boss = newBoss; }

}