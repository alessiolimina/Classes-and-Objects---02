package it.develhope.classesandobjects;

public class CompetitionRules {

private static CompetitionRules competitionRules = new CompetitionRules();

private String competitionRule1 = "Do not copy and paste from StackOverFlow!";
private String competitionRule2 = "Learn every day!";
private String competitionRule3 = "Be the best team!";

public void printRules(){
    System.out.println(competitionRule1);
    System.out.println(competitionRule2);
    System.out.println(competitionRule3);
}

private CompetitionRules(){}

public static CompetitionRules getInstance(){
    return competitionRules;
}


}


//perché anche qui il return è sbagliato?

//create a singleton class called CompetitionRules that has:
//a private variable competitionRule1 as string, initialised with "Do not copy and paste from StackOverflow!" value
//a private variable competitionRule2 as string, initialised with "Learn every day!" value
//a private variable competitionRule3 as string, initialised with "Be the best team!" value
//a method printRules() that prints the 3 rules
