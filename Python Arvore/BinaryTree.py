from node import Node

class BinaryTree:

    def __init__(self):
        self.root = None

    def adicionar(self, value):
        node = Node(value)
        aux = self.root
        if self.root is None:
            self.root = node
        elif value > aux.value :
            while aux.value > value:
                aux = aux.direita
            aux = node
        elif node.value < aux.value :
            while aux.value < value:
                aux = aux.esquerda
            aux = node
