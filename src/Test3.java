public class Test3 {
    public static void main(String[] args) {
        Runnable task_1 = () -> {
//            int i = 0;
//            while (i < 25) {
                System.out.println("Hello, World! from " + Thread.currentThread().getName());
//                i++;
//            }
        };

        Runnable task_2 = () -> {
            int i = 0;
            while (i < 25) {
                System.out.println("Hello, World! from thread two");
                i++;
            }
        };

        int i = 0;
        while (i < 25) {
            Thread thread_1 = new Thread(task_1);
            thread_1.start();
            i++;
        }

//        Thread thread_1 = new Thread(task_1);
//        thread_1.start();
//        Thread thread_2 = new Thread(task_2);
//        thread_2.start();
    }
}
