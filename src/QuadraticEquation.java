public class QuadraticEquation {
	private double a, b, c;

	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double get_a() {
		return this.a;
	}

	double get_b() {
		return this.b;
	}

	double get_c() {
		return this.c;
	}

	double getDiscriminant() {
		return this.b * this.b - 4 * this.a * this.c;
	}

	double getRoot1() {
		if (this.getDiscriminant() < 0.0) {
			return 0.0;
		} else {
			return (-this.b + Math.sqrt(this.getDiscriminant())) / (2.0 * this.a);
		}
	}

	double getRoot2() {
		if (this.getDiscriminant() < 0.0) {
			return 0.0;
		} else {
			return (-this.b - Math.sqrt(this.getDiscriminant())) / (2.0 * this.a);
		}
	}
}
