package Project2VanStream;


public class ScoreInfoApp {
    public static void main(String[] args) {
        ScoreInfoService scoreInfoService = new ScoreInfoService();

        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Jane", "Smith");
        Student student3 = new Student("Martha", "Etkinson");
        Student student4 = new Student("Robert", "Edison");
        Student student5 = new Student("Jonny", "Kleen");
        Student student6 = new Student("Framon", "Jeferson");
        Student student7 = new Student("Mika", "Dayson");
        Student student8 = new Student("Martina", "Jolly");
        Student student9 = new Student("Rick", "Madison");
        Student student10 = new Student("Penilopa", "Harison");


        scoreInfoService.addScoreInfo(new ScoreInfo(95, student1));
        scoreInfoService.addScoreInfo(new ScoreInfo(80, student2));
        scoreInfoService.addScoreInfo(new ScoreInfo(71, student3));
        scoreInfoService.addScoreInfo(new ScoreInfo(57, student4));
        scoreInfoService.addScoreInfo(new ScoreInfo(100, student5));
        scoreInfoService.addScoreInfo(new ScoreInfo(45, student6));
        scoreInfoService.addScoreInfo(new ScoreInfo(87, student7));
        scoreInfoService.addScoreInfo(new ScoreInfo(95, student8));
        scoreInfoService.addScoreInfo(new ScoreInfo(77, student9));
        scoreInfoService.addScoreInfo(new ScoreInfo(89, student10));


        System.out.println("*********************************************");
        scoreInfoService.getNumberOfStudents();
        System.out.println("*********************************************");
        scoreInfoService.calculateAverageScore();
        System.out.println("*********************************************");
        scoreInfoService.filterScore();
        System.out.println("*********************************************");
        scoreInfoService.printFailingStudents();
        System.out.println("*********************************************");
        scoreInfoService.getDataSortedByLastName();
        System.out.println("*********************************************");
        scoreInfoService.getDataSortedByScore();
        System.out.println("*********************************************");
    }
}
