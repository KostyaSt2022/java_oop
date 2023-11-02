package task_7f.factory;

import task_7f.service.Calculator;
import task_7f.service.ICalculatorService;

public class CalculableFactory implements ICalculableFactory {
    public ICalculatorService create() {
        return new Calculator();
    }
}