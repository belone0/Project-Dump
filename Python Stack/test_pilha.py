from pilha import Pilha

def test_criar_criacao_de_pilha():
    pilha = Pilha()
    assert pilha.topo == None

def test_numero_de_elementos_da_pilha():
    pilha = Pilha()
    pilha.empilhar(1)
    pilha.empilhar(2)
    pilha.empilhar(3)
    pilha.empilhar(4)

    assert pilha.count() == 4