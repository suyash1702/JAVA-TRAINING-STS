package in.day11.accessmodifiers.singleton.main;

import in.day11.accessmodifiers.singleton.Task;

public class MainTask {

    public static void main(String[] args) {
        // Retrieve singleton instance
        Task obj = Task.getInstance(-1, -10);
        System.out.println(obj);

        // Modify with valid values
        Task obj2 = Task.getInstance(5, 10);
        System.out.println(obj2);

        // Ensure singleton property
        System.out.println("Are both objects the same? " + (obj == obj2));
    }
}
