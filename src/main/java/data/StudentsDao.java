package data;

import data.Student;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}