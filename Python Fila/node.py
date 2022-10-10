class Node:

    def __init__(self, numero, proximo = None):
        self.numero = numero
        self.proximo = proximo

    def setProximo(self,proximo):
        self.proximo = proximo