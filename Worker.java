
public class Worker {
    private String name;
    private int salary;
    static int counter = 0;
    public void setName(String name) {
       this.name=name;

        //System.out.println("Worker name is:"+name);
    }
    public String getName()
    {  counter++;
        return name;
    }
    public void setSalary(int s) {
        this.salary=s;
    }
   public int getSalary()
   {
       return salary;
   }


    public int getCounter()
    {
        return counter;
    }

}
