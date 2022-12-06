package com.company;


import java.util.*;

class projectDetails {
    int days;
    int score;
    int bestBefore;
    int noOfSkill;
    String nameOfSkill;
    int levelOfSkill;

    public projectDetails(int days, int score, int bestBefore, int noOfSkill, String nameOfSkill, int levelOfSkill) {

        this.days = days;
        this.score = score;
        this.bestBefore = bestBefore;
        this.noOfSkill = noOfSkill;
        for (int i = 0; i < noOfSkill; i++) {
            this.nameOfSkill = nameOfSkill;
            this.levelOfSkill = levelOfSkill;
        }
    }

    public projectDetails(int noOfSkill, String nameOfSkill, int levelOfSkill) {
        this.noOfSkill = noOfSkill;
        for (int i = 0; i < noOfSkill; i++) {
            this.nameOfSkill = nameOfSkill;
            this.levelOfSkill = levelOfSkill;
        }
    }
}
class list {
    String projectName;
    String roleAssigned[] = new String[1000];
}

public class Mentor_And_TeamWork {
    public static void main(String args[])  {
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int P = scanner.nextInt();

        Hashtable<String, projectDetails> nameOfContributorAndNoOfSkill = new Hashtable<String, projectDetails>();

        for (int i = 0; i < C; i++) {
            String nameOfContibutor = scanner.next();
            int noOfSkills = scanner.nextInt();
            for (int j = 0; j < noOfSkills; j++) {
                String nameOfSkills = scanner.next();
                int levelOfSkill = scanner.nextInt();
                projectDetails projectDetails = new projectDetails(noOfSkills, nameOfSkills, levelOfSkill);
                nameOfContributorAndNoOfSkill.put(nameOfContibutor, projectDetails);
            }
        }

        Hashtable<String, projectDetails> project_details = new Hashtable<String, projectDetails>();

        for (int i = 0; i < P; i++) {

            String nameOfProject = scanner.next();
            int day = scanner.nextInt();
            int scores = scanner.nextInt();
            int bd = scanner.nextInt();
            int role = scanner.nextInt();

            for (int j = 0; j < role; j++) {
                String skills = scanner.next();
                int level = scanner.nextInt();
                projectDetails projectDetails = new projectDetails(day, scores, bd, role, skills, level);
                project_details.put(nameOfProject, projectDetails);
            }
        }

        for (Map.Entry<String, projectDetails> entry : nameOfContributorAndNoOfSkill.entrySet()) {
            String key = entry.getKey();
            projectDetails HTD = entry.getValue();
            System.out.println(key+" "+"Details :");
            System.out.println(HTD.nameOfSkill+" "+HTD.levelOfSkill);
        }
        for (Map.Entry<String, projectDetails> entry : project_details.entrySet()) {
            String key = entry.getKey();
            projectDetails HTD = entry.getValue();
            System.out.println(key+" "+"Details :");
            System.out.println(HTD.days+" "+HTD.score+" "+HTD.bestBefore+" "+HTD.noOfSkill);
        }

        Hashtable<Integer, list> outputList = new Hashtable<Integer, list>();

    }
}