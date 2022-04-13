public class Main {
    public static void main(String[] args) {
//        Queue q = new Queue();
        Solution q = new Solution();
//        q.front= q.rear = null;
//        Solution.enQueue(q,14);
//        Solution.enQueue(q,22);
//        Solution.enQueue(q,6);
//        Solution.displayQueue();
//        Solution.deQueue(q);
//        Solution.displayQueue(q);
        q.front = q.rear = null;
        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(6);
        q.displayQueue(q);
        System.out.println("số dequeue: "+q.deQueue().data);
    }
}
