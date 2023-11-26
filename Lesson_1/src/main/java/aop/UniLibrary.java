package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу из UniLibrary");
    }


    public void getMagazine(){
        System.out.println("Мы берем журнал в UniLibrary");
    }

    public void returnMagasine(){
        System.out.println("Мы возвращаем журнал из UniLibrary");
    }


    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
    }

}






