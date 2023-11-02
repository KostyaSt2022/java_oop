package task_7f.service;

import task_7f.model.ComplexNumber;

public interface ICalculatorService {
    ComplexNumber sum(ComplexNumber a, ComplexNumber b);

    ComplexNumber multi(ComplexNumber a, ComplexNumber b);

    ComplexNumber div(ComplexNumber a, ComplexNumber b);
}