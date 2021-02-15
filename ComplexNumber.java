package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
	public double add(double real, double imaginary){
        return real + imaginary;
    }
	
	public double subtract(double real, double imaginary){
		return real - imaginary;
}
