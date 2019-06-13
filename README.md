# Java.Core
В данном разделе находятся решения заданий по Java Core

Лекция 1

1. Разобраться с имеющимся кодом;
2. Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ), метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
В итоге должно быть что-то вроде:

public static void main(String[] args) {
Course c = new Course(...); // Создаем полосу препятствий
Team team = new Team(...); // Создаем команду
c.doIt(team); // Просим команду пройти полосу
team.showResults(); // Показываем результаты
}

Лекция 2

1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.


В качестве бонуса

Требуется реализовать enum DayOfWeek, который будет представлять дни недели. 
С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.

 Возвращает кол-во оставшихся рабочих часов до конца
 недели по заданному текущему дню. Считается, что
 текущий день ещё не начался, и рабочие часы за него
 должны учитываться.

public class DayOfWeekMain {
 
 public static void main(final String[] args) {
 System.out.println(getWorkingHours(DayOfWeek.MONDAY));
 }
}

Лекция 3

1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов, тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get().


