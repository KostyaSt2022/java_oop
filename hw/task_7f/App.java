/*
Урок 7. ООП Дизайн и Solid ч.2
Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.
Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA,
то необходимо написать документ, каким образом можно запустить приложение (что необходимо установить, каким образом запускать и т.п.).

Формат сдачи: ссылка на гитхаб проект
Данная промежуточная аттестация оценивается по системе "зачет" / "не зачет".
Оценка “Зачтено” ставится, если Задание выполнено на 65% и более и предоставлено в срок и в комфортном для обзора формате
Оценка “Незачтено” выставляется, если выполнено менее 65% проекта, сдан пустой файл, битая ссылка, нерелевантное содержимое присланного.
 */

package task_7f;

import task_7f.factory.CalculableLoggerFactory;
import task_7f.factory.ICalculableFactory;
import task_7f.logger.ILogger;
import task_7f.logger.LoggerConsole;
import task_7f.view.CalculatorView;
import task_7f.view.ConsoleCalculatorView;

public class App {
    public static void main(String[] args) {
        ILogger logger = new LoggerConsole();
        ICalculableFactory calculableFactory = new CalculableLoggerFactory(logger);
        CalculatorView calculatorView = new ConsoleCalculatorView(calculableFactory);

        calculatorView.run();
    }
}