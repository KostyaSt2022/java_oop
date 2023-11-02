package task_7f.factory;

import task_7f.logger.ILogger;
import task_7f.service.Calculator;
import task_7f.service.ICalculatorService;
import task_7f.service.LogCalculator;

public class CalculableLoggerFactory implements ICalculableFactory {
    private final ILogger logger;

    public CalculableLoggerFactory(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public ICalculatorService create() {
        return new LogCalculator(new Calculator(), logger);
    }
}