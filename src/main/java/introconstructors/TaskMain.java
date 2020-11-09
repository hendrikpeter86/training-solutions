package introconstructors;

public class TaskMain {

    public static void main(String[] args) {
        Task task = new Task("Feladat címe", "Feladat leírása");
        System.out.println(task.getTitle());
        System.out.println(task.getDescription());

        task.start();
        task.setDuration(34);

        System.out.println(task.getStartDateTime());
        System.out.println(task.getDuration());






    }
}
