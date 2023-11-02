package task_7f.service;

import task_7f.model.ComplexNumber;

public class Calculator implements ICalculatorService {
    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return a.sum(b);
    }

    @Override
    public ComplexNumber multi(ComplexNumber a, ComplexNumber b) {
        return a.multi(b);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        return a.div(b);
    }
}