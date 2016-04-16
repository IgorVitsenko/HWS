package HW7;

import java.util.Calendar;
import java.util.Date;

class Datex {
   static java.util.Date time = new java.util.Date(); // определяем переменную с датой, автоматически иннициализируется сегодняшним числом и временем
    static Calendar cal = Calendar.getInstance();// - создаем экземпляр класса Calendar обращаясь к статическому методу getInstance()

     Date getDate(int x) {
        cal.setTime(time); //устанавливаем значение даты в календаре сегодняшним днем из переменной time
        cal.add(Calendar.DATE, -x); // отнимаем 10 дней, в нашем случает количество дней должно быть случайным
        return time = cal.getTime(); // заносим значение даты обратно в переменную
    }

}
