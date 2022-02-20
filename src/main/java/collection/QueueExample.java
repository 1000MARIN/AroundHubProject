package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("-------------------------------↓↓↓ Queue ↓↓↓--------------------------");

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(7);
        System.out.println(queue.offer(5)); // 값을 추가

        System.out.println("--------------------------");

        System.out.println(queue.peek());   // 먼저 들어간 값이 먼저 나옴, 삭제 안함
        System.out.println(queue.poll());   // 값이 삭제 되고 해당 값 리턴
        System.out.println(queue.remove()); // 다음값이 삭제 되고 값 리턴

        System.out.println("--------------------------");

        Iterator<Integer> iterator = queue.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("-------------------------------↑↑↑ Queue ↑↑↑--------------------------");
        System.out.println("-------------------------------↓↓↓ PriorityQueue ↓↓↓--------------------------");

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(); // ()에 아무것도 넣지 않으면 오름차순으로 정렬

        //PriorityQueue<Person> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐의 값 추가
        priorityQueue.add(new Person("김민수", 25));
        priorityQueue.add(new Person("황진이", 30));
        priorityQueue.add(new Person("이민아", 30));
        priorityQueue.add(new Person("홍길동", 27));

        // 우선순위 큐의 값 제거
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());

        System.out.println("-------------------------------↑↑↑ PriorityQueue ↑↑↑--------------------------");
    }

    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        Person(String name, int time) {
            this.name = name;
            this.age = time;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person person) {
            if (this.age == person.age) {   // 나이를 우선 순위로 잡고 정렬하고 같은 나이일경우 name 우선순위로 정렬
                return this.name.compareTo(person.name);
            }
            return this.age - person.age;
        }
    }
}
