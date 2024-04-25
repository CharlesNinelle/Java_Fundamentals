package ArrayDeque;

public class Person {
   String name;
   Gender gender;

   public Person(String name, Gender gender) {
      this.name = name;
      this.gender = gender;
   }

   public enum Gender {
      MALE,
      FEMALE
   }

   @Override
   public String toString() {
      return name;
   }
}
