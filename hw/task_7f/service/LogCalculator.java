package task_7f.service;

import task_7f.logger.ILogger;
import task_7f.model.ComplexNumber;

public class LogCalculator implements ICalculatorService {
    private final ICalculatorService decorated;
    private final ILogger logger;

    public LogCalculator(ICalculatorService decorated, ILogger logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызывается метод СУММ со значениями (real_num1 = " + a.getRe() + " и imag_num1 = " + a.getIm() + ") + (real_num2 = " +
                b.getRe() + " и imag_num2 = " + b.getIm() + ")");
        return decorated.sum(a, b);
    }

    @Override
    public ComplexNumber multi(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызывается метод УМНОЖ со значениями (real_num1 = " + a.getRe() + " и imag_num1 = " + a.getIm() + ") * (real_num2 = " +
                b.getRe() + " и imag_num2 = " + b.getIm() + ")");
        return decorated.multi(a, b);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызывается метод ДЕЛ со значениями (real_num1 = " + a.getRe() + " и imag_num1 = " + a.getIm() + ") / (real_num2 = " +
                b.getRe() + " и imag_num2 = " + b.getIm() + ")");
        return decorated.div(a, b);
    }
}