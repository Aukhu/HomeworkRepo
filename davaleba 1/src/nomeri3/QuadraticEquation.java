package nomeri3;

import java.util.Objects;

public class QuadraticEquation {
        private int a;
        private int b;
        private int c;
        private Double x1;
        private Double x2;

        public QuadraticEquation(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;

            if (a == 0) {
                System.out.println("a' cannot be zero for a quadratic equation.");
            } else {
                int discriminant = b * b - 4 * a * c;
                if (discriminant >= 0) {
                    calculateRoots(discriminant);
                } else {
                    System.out.println("No real solutions.");
                }
            }
        }

        private void calculateRoots(int discriminant) {
            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            } else if (discriminant == 0) {
                x1 = x2 = -b / (2.0 * a);
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            QuadraticEquation equation = (QuadraticEquation) obj;
            return Objects.equals(x1, equation.x1) && Objects.equals(x2, equation.x2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x1, x2);
        }

        @Override
        public String toString() {
            if (x1 == null || x2 == null) {
                return "Equation: " + a + "x² + " + b + "x + " + c + " = 0, No real solution.";
            }
            return "Equation: " + a + "x² + " + b + "x + " + c +
                    " = 0, Roots: " + x1 + " and " + x2;
        }
}
