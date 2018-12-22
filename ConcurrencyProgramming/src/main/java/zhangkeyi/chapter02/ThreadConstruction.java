package zhangkeyi.chapter02;

/**
 * @author kyzhang
 * this means that :
 * 1.the thread group of main function named main
 * 2.the thread which has not assigned group belongs to parent thread group
 *
 *
 */
public class ThreadConstruction {
    public static void main (String[] args) {
        Thread t1 = new Thread("t1");

        ThreadGroup group = new ThreadGroup("TestGroup");
        Thread t2 = new Thread(group,"t2");

        ThreadGroup courrentTreadGroup = Thread.currentThread().getThreadGroup();

        System.out.println("thread t1 belong to group: " + t1.getThreadGroup().getName());
        System.out.println("thread t2 belong to group: " + t2.getThreadGroup().getName());
        System.out.println("courrentTreadGroup: " + courrentTreadGroup.getName());
    }
}
