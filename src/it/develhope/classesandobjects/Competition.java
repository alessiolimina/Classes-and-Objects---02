package it.develhope.classesandobjects;

public class Competition {
public static void main(String[] args) {

CompetitionRules competitionRules = CompetitionRules.getInstance();
competitionRules.printRules();
Team teamA = new Team();
Team teamB = new Team();
teamA.teamName = "TeamA";
teamB.teamName = "TeamB";
teamA.p1.name = "Alessio";
teamA.p1.programmingLanguage = "Java";
teamA.p1.yearsOfExperience = 2;
teamA.p2.name = "Alberto";
teamA.p2.programmingLanguage = "Angular";
teamA.p2.yearsOfExperience = 3;
teamB.p1.name = "Fabiano";
teamB.p1.programmingLanguage = "Javascript";
teamB.p1.yearsOfExperience = 5;
teamB.p2.name = "Mattia";
teamB.p2.programmingLanguage = "Android";
teamB.p2.yearsOfExperience = 4;
teamA.printTeamDetails();
teamB.printTeamDetails();
    }
}

