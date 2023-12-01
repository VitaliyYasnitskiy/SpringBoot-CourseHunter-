package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("----------------------------");
    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу из UniLibrary");
        System.out.println("----------------------------");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал в UniLibrary");
        System.out.println("----------------------------");
    }

    public void returnMagasine(){
        System.out.println("Мы возвращаем журнал из UniLibrary");
        System.out.println("----------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("----------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("----------------------------");
    }

}






