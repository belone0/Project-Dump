from node import Node

class Pilha:

    def __init__(self):
        self.topo = None

    def empilhar(self, numero):
        node = Node(numero)
        if self.esta_vazia():
            self.topo = node
        else:
            node.setProximo(self.topo)
            self.topo = node

    def desempilhar(self):
        if self.esta_vazia():
            print("pilha vazia")
        else:
            self.topo = self.topo.proximo

    def esta_vazia(self):
        return self.topo == None

    def __str__(self):
        aux = self.topo
        output = '['
        while aux != None:
            output += f"{str(aux.numero)}, "
            aux = aux.proximo
        output += ']'
        return output