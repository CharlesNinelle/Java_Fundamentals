package Opdracht3_PandemicSimulator;

import java.util.*;
import java.util.stream.Collectors;

public class MainAppPandemic {
    public static void main(String[] args) {
        List<Patient> allPatients = Patient.getAllPatients();

        patientOrder(allPatients);
        highTemperaturePlusAge(allPatients);
        InsuranceSorter(allPatients);
        triageOfPatients(allPatients);
    }

    public static void patientOrder(List<Patient> allPatients) {
        System.out.println("=== Patient order ===");
        for (int i = 0; i < allPatients.size(); i++) {
            Patient patient = allPatients.get(i);
            System.out.println((i + 1) + ". " + patient.getFullName());
        }
        //allPatients.forEach(patient -> System.out.println(patient));
        System.out.println("==================");
    }

    public static void highTemperaturePlusAge(List<Patient> allPatients) {
        System.out.println("======= Older patients with high fever =======");

        List<Patient> uniquePatients = allPatients.stream()
                .collect(Collectors.toMap(Patient::getNationalRegistryNumber, patient -> patient, (existing, replacement) -> existing))
                .values()
                .stream()
                .filter(patient -> patient.getTemperature() >= 38)
                .sorted(Comparator.comparingInt(Patient::getTemperature).reversed()
                        .thenComparing(Comparator.comparingInt(Patient::getAge)))
                .collect(Collectors.toList());

        for (int i = 0; i < uniquePatients.size(); i++) {
            Patient patient = uniquePatients.get(i);
            System.out.println((i + 1) + ". " + patient.getFullName() +
                    " (Age: " + patient.getAge() + ", Temperature: " + patient.getTemperature() + ")");
        }

        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
    }

    public static void InsuranceSorter(List<Patient> allPatients) {
        System.out.println("======================== Insurance Sorter =====================");
        List<Patient> uniquePatients = allPatients.stream()
                .collect(Collectors.toMap(Patient::getNationalRegistryNumber, patient -> patient, (existing, replacement) -> existing))
                .values()
                .stream()
                .sorted(Comparator.comparing(Patient::isEnsured).reversed()
                        .thenComparing(Comparator.comparingInt(Patient::getTemperature).reversed()
                                .thenComparing(Comparator.comparingInt(Patient::getAge))))
                .collect(Collectors.toList());

        for (int i = 0; i < uniquePatients.size(); i++) {
            Patient patient = uniquePatients.get(i);
            System.out.println((i + 1) + ". " + patient.getFullName() +
                    " (Age: " + patient.getAge() + ", Temperature: " + patient.getTemperature() +
                    ", Ensured: " + patient.isEnsured() + ")");
        }
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
    }

    public static int categorizePatient(Patient patient) {
        int age = patient.getAge();
        int temperature = patient.getTemperature();
        boolean unknownVirus = patient.isUnknownVirus();

        if ((age >= 65 && temperature >= 38) || temperature >= 40) {
            return 1; // Category 1
        } else if (unknownVirus && temperature >= 38) {
            return 2; // Category 2
        } else if (unknownVirus && temperature < 38) {
            return 3; // Category 3
        } else if (temperature >= 38 && !unknownVirus) {
            return 4; // Category 4
        } else {
            return 5; // Home or to the pharmacist
        }
    }

    public static void triageOfPatients(List<Patient> allPatients) {
        Map<Integer, String> categoryDescriptions = Map.of(
                1, "High Temperature or Elderly with Unknown Virus",
                2, "Population with Unknown Virus",
                3, "People with Unknown Virus but No Fever",
                4, "People with Fever and Known Virus",
                5, "Send to Pharmacy or Home"
        );

        System.out.println("=== Triage Of Patients ===");

        Map<Integer, List<Patient>> patientCategories = new HashMap<>();
        Set<Patient> alreadyPrintedPatients = new HashSet<>();

        for (Patient patient : allPatients) {
            int category = categorizePatient(patient);
            patientCategories.computeIfAbsent(category, k -> new ArrayList<>()).add(patient);
        }

        // Print results of Map
        for (Map.Entry<Integer, List<Patient>> category : patientCategories.entrySet()) {
            int key = category.getKey();
            String description = categoryDescriptions.get(key);
            System.out.println("Category " + key + ": " + description);

            List<Patient> patientsInCategory = category.getValue();
            for (Patient patient : patientsInCategory) {
                if (!alreadyPrintedPatients.contains(patient)) {
                    System.out.print(patient.getFullName() + "(Age: " + patient.getAge() + ", Temperature: " + patient.getTemperature() + ")");
                    if (key == 1 && patient.isUnknownVirus()) {
                        System.out.print(" - Unknown Virus");
                    } else if (key == 2 && patient.isUnknownVirus()) {
                        System.out.print(" - Unknown Virus");
                    } else if (key == 3 && patient.isUnknownVirus()) {
                        System.out.print(" - Unknown Virus");
                    } else if (key == 4 && !patient.isUnknownVirus()) {
                        System.out.print(" - Known Virus");
                    }
                    System.out.println(); // Move to the next line for the next patient
                    alreadyPrintedPatients.add(patient);
                }
            }
            System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
        }

        // Print contents of Queue (empty in this case)
        Queue<Patient> emptyQueue = new LinkedList<>();
        System.out.println("Queue: " + emptyQueue);
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆");
    }
}
