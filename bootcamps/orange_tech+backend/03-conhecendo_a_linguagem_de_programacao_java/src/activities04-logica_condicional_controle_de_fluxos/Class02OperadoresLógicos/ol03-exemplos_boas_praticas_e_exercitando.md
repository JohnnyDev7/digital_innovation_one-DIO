# Operadores Lógicos

- ## Exemplos

boolean b1 = true; boolean b2 = false;
boolean b3 = true;boolean b4 = false;

b1 && b2, b1 && b3
b2 && b3, b2 && b4
b1 ^ b3, b4 ^ b1
!b1, !b2
(i1 > i2) || (f2 < f1>)
((i1 + i2) < (f2 - f1)) && true

- ## Boas Práticas

Crie variáveis para guardar resultados intermediários.

(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)

_Pode ser:_<br>
(salarioBaixo) && (muitosDependentes)

boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
