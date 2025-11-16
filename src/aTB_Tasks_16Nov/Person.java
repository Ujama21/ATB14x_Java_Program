package aTB_Tasks_16Nov;

public class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + this.name + ", Age: " + this.age);
        }

        public static void main(String[] args) {
            Person person1 = new Person("John", 25);
            Person person2 = new Person("Alice", 30);

            person1.display();
            person2.display();
    }
}
