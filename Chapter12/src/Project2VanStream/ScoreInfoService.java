package Project2VanStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreInfoService {
    private ScoreInfo[] scoreData;
    private long numberOfStudents;

    public ScoreInfoService() {
        scoreData = new ScoreInfo[0];
        numberOfStudents = 0;
    }

    public void addScoreInfo(ScoreInfo scoreInfo) {
        scoreData = Arrays.copyOf(scoreData, scoreData.length + 1);
        scoreData[scoreData.length - 1] = scoreInfo;
        numberOfStudents++;
    }

    public void calculateAverageScore() {
        double averageScore = Arrays.stream(scoreData)
                .mapToDouble(ScoreInfo::getScore)
                .average()
                .orElse(0.0);
        System.out.println("Average Score: " + averageScore);
    }

    public int filterScore() {
        int countA = (int) Arrays.stream(scoreData)
                .filter(scoreInfo -> scoreInfo.getScore() >= 90)
                .count();
        System.out.println("Number of students with score A (>= 90): " + countA);
        return countA;
    }


    public String[] getFailedStudents() {
        return Arrays.stream(scoreData)
                .filter(scoreInfo -> scoreInfo.getScore() < 60)
                .map(scoreInfo -> scoreInfo.getStudent().toString() + " - Score: " + scoreInfo.getScore())
                .toArray(String[]::new);
    }

    public void printFailingStudents() {
        System.out.println("Failing Students:");
        Arrays.stream(getFailedStudents()).forEach(System.out::println);
    }

    public void getDataSortedByLastName() {
        List<String> sortedData = Arrays.stream(scoreData)
                .sorted(Comparator.comparing(s -> s.getStudent().getLastName()))
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println("Data Sorted By Last Name:");
        sortedData.forEach(System.out::println);
    }

    public void getDataSortedByScore() {
        System.out.println("Students from highest score to lowest:");
        Arrays.stream(scoreData)
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(System.out::println);
    }

    public long getNumberOfStudents() {
        System.out.println("Number of students: " + numberOfStudents);
        return numberOfStudents;
    }
}
