package ru.vsu.cs.surkov;

import ru.vsu.cs.surkov.classes.Faculty;
import ru.vsu.cs.surkov.classes.Institute;
import ru.vsu.cs.surkov.classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("FKN");
        Institute toizi = new Institute("MKN", "297");
        Institute is = new Institute("IS", "387");
        Institute tst = new Institute("IT", "311п");
        Institute itu = new Institute("FIZFAK", "312п");
        Institute piit = new Institute("PI", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Vaciliev Anatoliy Makarov ",
                "data protection");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Bugaltenko Ismail Romanovitch",
                "systems modeling");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Molikova Maria Masloa",
                "\n" +
                        "intelligent systems");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Dedkov Daniil Eparkov",
                "pattern recognition");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "MarakovA Rita Salamova",
                "information processing technologies");
        toizi.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("\n" +
                "Departments " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] toizi_employees = toizi.getEmployees();
        System.out.println("Department staff " + toizi.getName() + ": \n");
        for (int i = 0; i < toizi_employees.length; i++) {
            System.out.println(toizi_employees[i].getName());
        }
        //System.out.println(Arrays.toString(fkn.getInstitutes()));
    }
}
