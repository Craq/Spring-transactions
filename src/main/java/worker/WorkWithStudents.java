package worker;

import data.Student;
import data.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;
    @Autowired
    private TransactionTemplate transaction;
    public void saveStudentToDb(final Student student){
        transaction.execute(new TransactionCallback<Void>(){
            public Void doInTransaction(TransactionStatus status){
                if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
                    studentsDao.addStudent(student);
                    System.out.println("data.Student have been saved "+student);
                }
                return null;
            }
        });
    }
}