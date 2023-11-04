package equation;

public record QuadraticEquation(double a, double b, double c) {
    private String noTrailingZero(double value) {
        var b = String.valueOf(value);
        var a = b.split("\\.");
        if (a[1].equals("0")) return a[0];
        return b;
    }

    private void handleLetter(StringBuilder sb, double value, String letter, boolean first) {
        if (value != 0) {
            if (first) {
                if (value < 0)
                    sb.append("-");
            } else {
                sb.append(value < 0 ? "-" : "+");
                sb.append(" ");
            }
            sb.append(noTrailingZero(Math.abs(value)));
            sb.append(letter);
            sb.append(" ");
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        handleLetter(sb, this.a, "x^2", true);
        handleLetter(sb, this.b, "x", this.a == 0);
        handleLetter(sb, this.c, "", this.a == 0 && this.b == 0);
        sb.append("= 0");
        return sb.toString();
    }

    public boolean isQuadratic() {
        return this.a != 0;
    }
}
