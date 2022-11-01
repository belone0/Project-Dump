class Node(object):
    def __init__(self, valor):
        self.valor = valor
        self.esquerda = None
        self.direita = None


class BinaryTree(object):
    def __init__(self, raiz):
        self.raiz = Node(raiz)

    def print_arvore(self, traversal_type):
        if traversal_type == "preorder":
            return self.preorder_print(arvore.raiz, "")
        elif traversal_type == "inorder":
            return self.inorder_print(arvore.raiz, "")
        elif traversal_type == "postorder":
            return self.postorder_print(arvore.raiz, "")
        else:
            print("Tipo de traversal não existente")
            return False

    def preorder_print(self, start, traversal):
        #raiz - esquerda - direira
        if start:
            traversal += (str(start.valor) + "-")
            traversal = self.preorder_print(start.esquerda, traversal)
            traversal = self.preorder_print(start.direita, traversal)
        return traversal

    def inorder_print(self, start, traversal):
        #esquerda - raiz - direita
        if start:
            traversal = self.inorder_print(start.esquerda, traversal)
            traversal += (str(start.valor) + "-")
            traversal = self.inorder_print(start.direita, traversal)
        return traversal

    def postorder_print(self, start, traversal):
        #esquerda - direita - raiz
        if start:
            traversal = self.postorder_print(start.esquerda, traversal)
            traversal = self.postorder_print(start.direita, traversal)
            traversal += (str(start.valor) + "-")
        return traversal

arvore = BinaryTree(1)
arvore.raiz.esquerda = Node(2)
arvore.raiz.direita = Node(3)
arvore.raiz.esquerda.esquerda = Node(4)
arvore.raiz.esquerda.direita = Node(5)
arvore.raiz.direita.esquerda = Node(6)
arvore.raiz.direita.direita = Node(7)

print(arvore.print_arvore("preorder"))
#print(tree.print_tree("inorder"))
#print(tree.print_tree("postorder"))