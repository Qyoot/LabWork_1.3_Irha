package com.company;

public class Faculty {
    Applicant applicant;
    Teacher teacher;
    Exams exams;

    public Faculty(Applicant applicant, Teacher teacher) {
        this.applicant = applicant;
        this.teacher=teacher;
    }

    double ExamsResult() {
        teacher.setExams();
        double AvgMark=0;
        int quantity_exams=4;
        exams = teacher.getExams();
        AvgMark+=exams.getUkrainian();
        AvgMark+=exams.getProfessional_Lang();
        AvgMark+=exams.getHistory();
        AvgMark+=exams.getMathematics();

        AvgMark /= quantity_exams;
        return AvgMark;
    }
}
