public class Main {
    // Osztályok
    public static class Csapat {
        Tag member;
        public Csapat(Tag member) {
            this.member = member;
        }
    }
    public static void main(String[] args) {
        // Konzolra Kiíratás
        System.out.println("Hello, World!");

        Tag myMember = new Tag("Kincső", 20, 150);
        Csapat myTeam = new Csapat(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getAge());
        System.out.println(myTeam.member.getHeight());
    }
}

// Osztályok
class Tag {
    private String name;
    private int age;
    private int height;
    public Tag(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }
}