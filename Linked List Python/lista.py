from node import Node


class Lista:

    def __init__(self):
        self.inicio = None

    def adicionar(self, valor, inicio=True):
        if inicio:
            self.adicionar_no_inicio(valor)
        else:
            self.adicionar_no_fim(valor)

    def adicionar_no_inicio(self, valor):
        novo = Node(valor)
        novo.proximo = self.inicio
        self.inicio = novo

    def adicionar_no_fim(self, valor):
        # inserir qnd nao tem nada
        if (self.inicio == None):
            self.inicio = Node(valor, None)
        else:
            # percorre e insere no fim
            aux = self.inicio
            while (aux.proximo != None):
                aux = aux.proximo
            aux.proximo = Node(valor, None)

    def remover(self, valor):
        aux = self.inicio
        if aux.valor == valor:
            aux.valor = None
            self.inicio = aux.proximo
        while aux.proximo != None:
            aux = aux.proximo
            if aux.valor == valor:
                aux.valor = None

    def show(self):
        aux = self.inicio
        print("[", end='')
        while (aux.proximo != None):
            print(aux.valor, end=', ')
            aux = aux.proximo
        print(aux.valor)
        print("]")
