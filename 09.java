class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() method
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        // Create object of class
        Student s1 = new Student(101, "Rahul");

        // Display object details using toString()
        System.out.println(s1);  // automatically calls toString()
    }
}
