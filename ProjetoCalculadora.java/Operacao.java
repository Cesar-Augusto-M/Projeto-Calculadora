class Operacao {
    public double adicao(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtracao(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicacao(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double divisao(double numeroUm, double numeroDois) {
        return numeroUm / numeroDois;
    }

    public double potencia(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raizQuadrada(double numeroUm) {
        return Math.sqrt(numeroUm);
    }
}