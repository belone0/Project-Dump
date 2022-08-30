class Fracao:
    numerador = 1
    denominador = 1

    def __init__(self, numerador, denominador):
        self.numerador = numerador
        self.denominador = denominador

    def add(self, fracao):
        num = (self.numerador * fracao.denominador) + (fracao.numerador * self.denominador)
        den = self.denominador * fracao.denominador

        return Fracao(num, den)


    def solve(self):
        return self.numerador/self.denominador

    def __str__(self):
        return f"{self.numerador}/{self.denominador}"

fracao1 = Fracao(1, 2)
fracao2 = Fracao(1, 3)
fracao3 = fracao1.add(fracao2)

print(fracao3)
print(fracao3.solve())

