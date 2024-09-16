package org.example;

public class ValidadorCPF {

    public boolean validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            return false;
        }

        // Validação dos dígitos verificadores
        int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * pesos[i];
        }

        int resto = 11 - (soma % 11);
        int digito1 = (resto > 9) ? 0 : resto;

        if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        pesos = new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * pesos[i];
        }

        resto = 11 - (soma % 11);
        int digito2 = (resto > 9) ? 0 : resto;

        return digito2 == Character.getNumericValue(cpf.charAt(10));
    }
}

