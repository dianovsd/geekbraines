package observer;

import java.util.ArrayList;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000, Position.Frontend);
        Company yandex = new Company("Yandex", jobAgency, 95000,Position.Cleaning);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000,Position.HR);
        Company facebook = new Company("Facebook", jobAgency, 50000,Position.Backend);

        Student student1 = new Student("Petrov", Position.Frontend);
        Master master1 = new Master("Ivanov", Position.HR);
        Student student2 = new Student("Dianov", Position.Manager);
        Middle middle1 = new Middle("Kosolapov", Position.Backend);



        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(middle1);


        for (int i = 0; i < 1; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            facebook.needEmployee();
        }

    }

}
