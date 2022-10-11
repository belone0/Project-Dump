from node import Node


class Fila:

    def __init__(self):
        self.inicio = None
        self.fim = None

    def enfileirar(self, numero):
        node = Node(numero)
        if self.esta_vazia():
            self.inicio = node
            self.fim = node
        else:
            self.fim.setProximo(node)
            self.fim = self.fim.proximo

    def esta_vazia(self):
        return (self.inicio == None)

    def __str__(self):
        aux = self.inicio
        output = '['
        while aux != None:
            output += f"{str(aux.numero)}, "
            aux = aux.proximo
        output += ']'
        return output
