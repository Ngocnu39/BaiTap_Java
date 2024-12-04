package bt3_1;

public class MyComplex {
        private double real = 0.0;
        private double imag = 0.0;

        // Constructors
        public MyComplex() {
            this.real = 0.0;
            this.imag = 0.0;
        }

        public MyComplex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        // Getters and Setters
        public double getReal() {
            return real;
        }

        public void setReal(double real) {
            this.real = real;
        }

        public double getImag() {
            return imag;
        }

        public void setImag(double imag) {
            this.imag = imag;
        }

        public void setValue(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        // Utility Methods
        public String toString() {
            return "(" + real + ((imag >= 0) ? "+" : "") + imag + "i)";
        }

        public boolean isReal() {
            return imag == 0;
        }

        public boolean isImaginary() {
            return real == 0;
        }

        public boolean equals(double real, double imag) {
            return this.real == real && this.imag == imag;
        }

        public boolean equals(bt3_1.MyComplex another) {
            return this.real == another.real && this.imag == another.imag;
        }

        public double magnitude() {
            return Math.sqrt(real * real + imag * imag);
        }

        public double argument() {
            return Math.atan2(imag, real); // trả về giá trị trong đơn vị radian
        }

        // Arithmetic Methods
        public bt3_1.MyComplex add(bt3_1.MyComplex right) {
            this.real += right.real;
            this.imag += right.imag;
            return this;
        }

        public bt3_1.MyComplex addNew(bt3_1.MyComplex right) {
            return new bt3_1.MyComplex(this.real + right.real, this.imag + right.imag);
        }

        public bt3_1.MyComplex subtract(bt3_1.MyComplex right) {
            this.real -= right.real;
            this.imag -= right.imag;
            return this;
        }

        public bt3_1.MyComplex subtractNew(bt3_1.MyComplex right) {
            return new bt3_1.MyComplex(this.real - right.real, this.imag - right.imag);
        }

        public bt3_1.MyComplex multiply(bt3_1.MyComplex right) {
            double newReal = this.real * right.real - this.imag * right.imag;
            double newImag = this.real * right.imag + this.imag * right.real;
            this.real = newReal;
            this.imag = newImag;
            return this;
        }

        public bt3_1.MyComplex divide(bt3_1.MyComplex right) {
            double denominator = right.real * right.real + right.imag * right.imag;
            double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
            double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
            this.real = newReal;
            this.imag = newImag;
            return this;
        }

        public bt3_1.MyComplex conjugate() {
            return new bt3_1.MyComplex(this.real, -this.imag);
        }
}
