package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Saver save = new Saver();
        save.save(user);
        Reporter report = new Reporter();
        report.report(user);

    }
}