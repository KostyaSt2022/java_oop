package task_7f.model;

import java.text.NumberFormat;

public class ComplexNumber {
    private Double re;
    private Double im;

    public ComplexNumber(Double re, Double im) {
        this.re = re;
        this.im = im;
    }

    public Double getRe() {
        return re;
    }

    public Double getIm() {
        return im;
    }

    public ComplexNumber sum(ComplexNumber num) {
        re += num.getRe();
        im += num.getIm();

        return this;
    }

    public ComplexNumber multi(ComplexNumber num) {
        double temp = re * num.getRe() - im * num.getIm();
        im = re * num.getIm() + im * num.getRe();
        re = temp;

        return this;
    }

    public ComplexNumber div(ComplexNumber num) {
        double denominator = num.getRe() * num.getRe() + num.getIm() * num.getIm();

        if (denominator == 0) {
            re = im = 0.;
        } else {
            double temp = (re * num.getRe() + im * num.getIm()) / denominator;
            im = (im * num.getRe() - re * num.getIm()) / denominator;
            re = temp;
        }

        return this;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();

        if (re == 0) {
            return nf.format(im) + "i";
        } else if (im == 0) {
            return nf.format(re);
        } else if (im > 0) {
            return nf.format(re) + " + " + nf.format(im) + "i";
        } else {
            return nf.format(re) + nf.format(im) + "i";
        }
    }
}