class A{
    private int count;
    A(){
        this.count = 0;
    }
    public int getCount() {
        return this.count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public synchronized void increment(){
        this.count = this.count + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        A ob = new A();

        Runnable r = () -> {
            for(int i = 0; i < 1000; i++){
                ob.increment();
            }
        };
        Runnable r1 = () -> {
            for(int i = 0; i < 1000; i++){
                ob.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ob.getCount());
    }
}
