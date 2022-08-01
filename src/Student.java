public class Student{
  int rating;
  private String name;
  static double avgRate, counter;

  public Student(String name) {
    this.name=name;
    counter++;
  }

  public static double getAvgRating(){
    if (counter != 0){
      return avgRate/counter;
    }
    else {
      return 0;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
   this.name=name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating=rating;
    avgRate = avgRate+ rating;
  }

  public boolean betterStudent(Student student) {
    if (this.rating > student.rating) {
      return true;
    } else if (this.rating < student.rating) {
      return false;
    } else {
      return true;
    }
  }


  public void changeRating(int rating) {
      avgRate =  avgRate - this.rating;
      this.rating = rating;
      avgRate = avgRate + rating;
  }

  public static void removeStudent(Student student) {
    student = null;
    avgRate = 0;
    counter = 0;
  }

  @Override
  public String toString() {
    return "Student name is " + this.name + " and student rating is " + this.rating;
  }
}
