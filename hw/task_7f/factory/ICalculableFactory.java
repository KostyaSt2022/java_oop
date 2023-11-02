package task_7f.factory;

import task_7f.service.ICalculatorService;

public interface ICalculableFactory {
    ICalculatorService create();
}