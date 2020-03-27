import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import java.io.PrintWriter;

/**
 * Контейнер перед инициализацией сервлета создает объект ServletContext и объект ServletConfig.
 * Проблема в том, что мы не может засунуть в ServletContext ничего дргуово, кроме строки. Например, если нам нужно
 * запихать туда объект, который представляет из себя подключение к базе данных.Для этих целей мы создаем Сервлет Контекст Лиснер.
 * Этот класс слушает два основных события в жизни ServletContext - инициализация и смерть. Во время инициализации он получает данные из
 * объекта ServletContext. использует эти данные что бы построить объект получения подключения к БД. Записывает этот объект, как атрибут
 * в объекте ServletContext (т.е. помещает ссылку на объект в качестве атрибута в ServletContext).
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext sc = servletContextEvent.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        sc.setAttribute("poroda", dogBreed);

        Dog dog = new Dog(dogBreed, "red");
         sc.setAttribute("dog", dog);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
