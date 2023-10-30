import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Al-halqi company's poss"+
                            " It is the end of this month your workers wants their salaries:");
       Worker c = new Worker();
       Scanner input = new Scanner(System.in);
        Worker worker = new Worker();

        int n = 0;
        while (n != 1) {
            try {
                String name;
                int s;
                System.out.println("Enter worker's name:");
                name = input.nextLine();
                input.nextLine();
                worker.setName(name);

                System.out.println("Enter worker's salary:");
                s = input.nextInt();

                if (s < 0) {
                    throw new Exception("Salary amount must be greater than zero");
                } else {
                    worker.setSalary(s);
                }

                System.out.println("The worker's name is: " + worker.getName());
                System.out.println("The worker has received " + worker.getSalary() + " Dollar");
                input.nextLine();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Press '1' to stop, or any other key to continue: ");
            n = input.nextInt();
        }

        System.out.println("You have " + worker.getCounter() + " workers.");
      }
    }

